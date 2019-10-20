var WaJsVariable = {};
WaJsVariable.form_post_url="wa_php/comp/{{waId}}/form_post.php";
WaJsVariable.search_index_filename="wa_js/waSearchIndex_{{lang}}.js";
var WaTranslator = {};
var WaIdContext = '5BD5F794279AE';
WaTranslator.tr = function(key) 
{ 
key = key.toLowerCase();
    return (this.messages[key]!=undefined)?this.messages[key]:'*'+key+'*';
}; 
WaTranslator.messages={
"%1 result found !":"%1 r\u00e9sultat(s) trouv\u00e9(s)",
"cookiebanner:i understand":"Ok",
"cookiebanner:learn more":"Plus d\u0027informations",
"cookiebanner:this website use cookie to ensure good experience on our website":"Ce site utilise des cookies pour vous assurer la meilleure exp\u00e9rience de navigation",
"enter your password":"Entrez votre mot de passe",
"feature no available in preview":"Fonctionnalit\u00e9 non disponible en test !",
"form successfully sent !":"Formulaire envoy\u00e9 avec succ\u00e8s !",
"form:email field":"E-mail de contact",
"form:firstname field":"Pr\u00e9nom",
"form:label my form":"Mon formulaire",
"form:lastname field":"Nom",
"form:my choices":"Mes choix",
"form:my message sample":"Mon message",
"form:sample choice value":"Choix",
"form:upload - select file":"S\u00e9lection de fichier(s)",
"invalid email !":"Adresse email non valide !",
"label button send form":"Envoyer",
"no email":"Aucun email n\u0027a \u00e9t\u00e9 d\u00e9fini !",
"no php support on server !":"Pas de support PHP sur le serveur !",
"page under construction":"Page en construction",
"recaptcha not validated !":"La v\u00e9rification reCAPTCHA a \u00e9chou\u00e9e !",
"search placeholder":"Rechercher",
"shop_loading_error":"La boutique n\u0027est pas configur\u00e9e",
"untitled page":"Sans titre",
};

//Selectors
var waImageGalleryClassSelector = "wa-image-gallery-tobind";
var waImageGalleryNoIndicatior = "wa-image-gallery-no-thumbs";
var waImageGalleryIdLinkSelectorPattern = "wa-gal-link";
var waCarouselIdLinkSelectorPattern = "wa-compcarousel-link";
var waCarouselIdSelectorPattern = "wa-compcarousel";
