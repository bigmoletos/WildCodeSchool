/**
* Function de waDebug
* @param {string} text : text à afficher*/
function waDebug(text)
{
    var mDate = new Date();
    console.log('DEBUG : '+mDate.getUTCMinutes()+':'+mDate.getUTCSeconds()+':'+mDate.getUTCMilliseconds()+" \t"+text);
}

function waGallery(data, options)
{
	//Zoom out for Gallery
	options['onopen'] = function(){
		wa$('meta[name="viewport"]').attr("content","width=device-width, initial-scale=1, maximum-scale=1.0");
	};
	options['onclose'] = function(){
		wa$('meta[name="viewport"]').attr("content","width=device-width, initial-scale=1");
	};
	blueimp.Gallery(data, options);
}


function checkIndicatorHiding(count)
{
	if(ResponsiveBootstrapToolkit.is('lg') && count>50)
		wa$('#wa-gallery ol.indicator').hide();
	else if(ResponsiveBootstrapToolkit.is('md') && count>22)
		wa$('#wa-gallery ol.indicator').hide();
	else if(ResponsiveBootstrapToolkit.is('sm') && count>16)
		wa$('#wa-gallery ol.indicator').hide();
	else if(ResponsiveBootstrapToolkit.is('xs') && count>6)
		wa$('#wa-gallery ol.indicator').hide();


	//Color XS
	if(ResponsiveBootstrapToolkit.is('xs'))
		wa$(".blueimp-gallery").css("background", "black");
}


function bindInPageGalleries() 
{

	var className = waImageGalleryClassSelector;
 	wa$('.'+className).each(function(){
 		wa$(this).click(function(event){
			event = event || window.event;
			var target = event.target || event.srcElement,
			link = target.src ? target.parentNode : target,
			options = {index: link, event: event, container:"#wa-gallery", titleElement: 'p'},
			links = wa$(this).find('a');

			wa$('#wa-gallery ol.indicator').show();
			if(wa$(this).hasClass(waImageGalleryNoIndicatior))
				wa$('#wa-gallery ol.indicator').hide();

			checkIndicatorHiding(links.length);
			waGallery(links, options);

 		});
 	});
 }



function bindLinkedGalleries() 
{
	var className = waImageGalleryIdLinkSelectorPattern;
	wa$('.'+className).each(function(){
		var galName = wa$(this).attr("data-gal");
		var e = wa$(this);
		wa$.ajax( galName )
		.done(function(data) {
 				e.click(function(event){
 					event.preventDefault();
 					if(typeof(data) ==  "string")
 						data = JSON.parse(data);
					
					wa$('#wa-gallery ol.indicator').show();
 					checkIndicatorHiding(data.length);
 					waGallery(data, {container:"#wa-gallery", titleElement: 'p'});
 				});
		})
		.fail(function( jqXHR, textStatus ) {
  			waDebug( "Request for wa_Galleries failed: " + textStatus );
		});
	});
}

function bindLinkedCarousel() 
{
	var idLinkPattern = waCarouselIdLinkSelectorPattern;
	var idCarouselPattern = waCarouselIdSelectorPattern;

	wa$("[id^="+idLinkPattern+"]").each(function(){
		var galName = wa$(this).attr("data-gal");
		var idCarousel = idCarouselPattern+wa$(this).attr("id").replace(idLinkPattern,"");

		//AutoStart ?
		var autoStart = (wa$(this).attr("data-gal-autostart") ==="true");

		//enableKeyboardNavigation ?
		var startwithoverlay = (wa$(this).attr("data-gal-startwithoverlay") ==="true");

		//Display Mode
		var displayMode;
		if(wa$(this).attr("data-gal-display-mode") ==="cover")
			displayMode = "cover";
		else
			displayMode = true;

		//Slide Duration
		var duration = parseInt(wa$(this).attr("data-gal-duration"));


		wa$.ajax( galName )
		.done(function(data) {
				if(typeof(data) ==  "string")
				data = JSON.parse(data);
				blueimp.Gallery(data,{
	     			container: "#"+idCarousel,
	     			titleElement: '.title',
	     			carousel: true,
	     			stretchImages : displayMode,
	     			startSlideshow : autoStart,
	     			slideshowInterval : duration
				});


				if(wa$("#"+idCarousel).find(".indicator li").length)
				{	
					if((wa$("#"+idCarousel).width()-110)/wa$("#"+idCarousel).find(".indicator li").first().outerWidth(true)/wa$("#"+idCarousel).find(".indicator li").length<1)
						wa$("#"+idCarousel).find(".indicator").hide();
				}

			
				var tmpTimer = setTimeout(function(){
					resizeUpdate();
					clearTimeout(tmpTimer);	
				},100);

				if(startwithoverlay)
					wa$("#"+idCarousel).addClass("blueimp-gallery-controls");
				
		})
		.fail(function( jqXHR, textStatus ) {
  			waDebug( "Request for wa_Galleries failed: " + textStatus );
		});
	});
}


function bindGalleries()
{
	bindInPageGalleries();
	bindLinkedGalleries();
	bindLinkedCarousel();
}

if(wa$('.wa-compmenu').length===0)//If there is a menu, it handles the binding
	bindGalleries();	

wa$( document ).ready(function() {
	//Gestion probleme refresh painting navigateur sur grosses galleries (resize = paint)
	if (navigator.userAgent.indexOf('MSIE') !== -1 || navigator.appVersion.indexOf('Trident/') > 0) {
	     var evt = document.createEvent('UIEvents');
	     evt.initUIEvent('resize', true, false, window, 0);
	     window.dispatchEvent(evt);
   }
   else
       window.dispatchEvent(new Event('resize'));

});
