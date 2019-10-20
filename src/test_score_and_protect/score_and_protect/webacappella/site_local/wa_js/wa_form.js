///formulaires
wa$().ready(function () {

    var prefix_wa_form = "wa-form-";

    var forms = wa$("form[id^='" + prefix_wa_form + "']")
    wa$.each(forms, function (index, value) {
        var form = wa$(value)
        form.submit(function (event) {
            if (wa$(form).data("busy"))
                return false;

            wa$(form).data("busy", true);
            var id = wa$(form).attr('id');
            var waId = id.substring(prefix_wa_form.length)

            var wa_post_url = wa$(form).attr('action');
             var wa_success_message = wa$(form).data('custom-success-message');


            

            if (wa_post_url === undefined)
                wa_post_url = WaJsVariable.form_post_url;

            wa_post_url = wa_post_url.replace("{{waId}}", waId);

            if (WaContext.preview) {
                WaGui.alert(WaTranslator.tr("Feature no available in preview"));
                wa$(form).data("busy", false);
                return;
            }

            wa$.ajax({
                type: "POST",
                timeout: 5000,
                data: wa$(form).serialize() + "&lng=" + WaPageContext.lang_filename + "&message_error_recaptcha=" + encodeURI(WaTranslator.tr("Recaptcha not validated !")),
                url: wa_post_url,
                success: function (code_html, statut) {
                    var json = code_html;

                    if (typeof json == "string") {
                        /*
                        if (string.indexOf("<?php") !== -1)
                        {
                            WaGui.alert("No PHP support on Server !");
                            wa$(form).data("busy",false);
                            return;
                        }
                        */
                        try {
                            json = JSON.parse(code_html);
                        } catch (e) {

                            if (code_html.indexOf("<?php") !== -1) {
                                WaGui.alert(WaTranslator.tr("No PHP support on Server !"));
                                wa$(form).data("busy", false);
                                return;
                            }
                            WaGui.alert(e + " " + code_html);
                            wa$(form).data("busy", false);
                            return;
                        }

                    }

                    if (json.success == true) {
                        wa$(form).find('input, select, textarea').val('');
                        wa$(form).find('input:radio, input:checkbox').removeAttr('checked').removeAttr('selected').removeAttr('value');

                        WaGui.alert(wa_success_message);

                    }
                    else {
                        WaGui.alert(WaTranslator.tr(json.error));
                    }
                    wa$(form).data("busy", false);

                },
                error: function (resultat, statut, erreur) {
                    if(statut==="timeout") 
                    {
                        WaGui.alert(wa_success_message);
                    }
                    else
                    {
                       WaGui.alert('Error during send form : ' + erreur);
                    }
                    wa$(form).data("busy", false);

                },
                complete: function (resultat, statut) {
                    //alert('complete')
                    wa$(form).data("busy", false);
                }
            });
            event.preventDefault();
        });
    });
});
/////
