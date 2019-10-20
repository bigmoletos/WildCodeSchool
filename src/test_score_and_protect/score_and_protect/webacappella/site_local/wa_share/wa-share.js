function checkShareBarState()
{
	$node = wa$(".wa-sharebar");
	if(ResponsiveBootstrapToolkit.is('xs') || (wa$('.wa-menu-small').length && wa$('.wa-menu-small').parent().is(':visible'))) {
 		if(!$node.hasClass('wa-sharebar-compact'))
 			$node.addClass("wa-sharebar-compact")
 	}
   else
   {
 		if($node.hasClass('wa-sharebar-compact'))
 			$node.removeClass("wa-sharebar-compact")
   }

	if(ResponsiveBootstrapToolkit.is('xs'))
	{
		$node.css("padding-top","0px");
	}
	else
	{
		$node.css("padding-top","90px");
	}


}

wa$(document).ready(function(){
    var pageTitle	= document.title; //HTML page title
    var pageUrl		= location.href; //Location of this page
	
	wa$('.wa-sharebar li').click(function(event){
		OpenShareUrl(wa$(this).data("wa-url"));
	});
		
	function OpenShareUrl(openLink){
		if ((Math.max(document.documentElement.clientWidth, window.innerWidth || 0)<768) || (openLink.includes("mailto:") ))
		{
			location.href = openLink;
		}
		else
		{
			var win = window.open(openLink, '_blank');
			win.focus();
		}
	}



	wa$(".wa-sharebar .wa-button-sharebar").css("width",wa$(".wa-sharebar").data("wa-size"));
	wa$(".wa-sharebar .wa-button-sharebar").css("height",wa$(".wa-sharebar").data("wa-size"));
	wa$(".wa-sharebar .wa-button-sharebar").css("margin-bottom",wa$(".wa-sharebar").data("wa-spacing"));

	var edge = parseInt(wa$(".wa-sharebar").data("wa-size").replace("px",""));
	var time = 25;
	var factor = 1.10;
	wa$(".wa-sharebar .wa-button-sharebar").hover(
		function() {
	    	wa$(this).animate({
				width: edge*factor+"px", 
				height: edge*factor+"px"
	    	}, time ); 
		},
		function(){
			wa$(this).animate({
				width: edge+"px", 
				height: edge+"px"
	    	}, time );
		}
	);

	wa$(".wa-sharebar").fadeIn();




	wa$(window).resize(function() {
		checkShareBarState();
   });

	//first Check
   checkShareBarState();

});