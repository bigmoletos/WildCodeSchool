//Menu auto sizing
function MenuShaper(id){
	this.id = "#"+id;
	this.content = 0;
	this.container = 0;
	this.isTypeCentered = false;
	this.isAlignRight= false;
	this.isCentered = false;
}

MenuShaper.prototype.setCentered = function(active)
{
	var space = this.container-this.content;
	var pad = space/2+15;// 15-> negative margin .navbar-brand
	this.waInMenu$(".navbar-header").css("padding-left", pad+"px");
};

MenuShaper.prototype.setAlignRight = function()
{
	var space = this.container-this.content;
	var pad = space-2;
	this.waInMenu$(".navbar-header").css("padding-left", pad+"px");
};


MenuShaper.prototype.clearAlign= function()
{
	this.waInMenu$(".navbar-header").css("padding-left","");
};


MenuShaper.prototype.waInMenu$ = function(selector)
{
	if(selector === undefined)
		return wa$(this.id);
	return wa$(this.id).find(selector);
};

MenuShaper.prototype.updateMenuShape = function()
{
	if(this.content>-1)
	{
		var $menu = this.waInMenu$();
		this.container = this.waInMenu$("nav > div").first().width();

		var $containerAdjusted = this.container;

		if(this.isTypeCentered || this.isAlignRight)
			$containerAdjusted -=30; //cancel 15 margin centered case

		if(this.content>$containerAdjusted && !$menu.hasClass("wa-menu-small") && ($menu.css('display')!=='none'))
		{
			$menu.addClass("wa-menu-small");
			this.clearAlign();
		}

		else if(this.content<$containerAdjusted)
		{
			if($menu.hasClass("wa-menu-small"))
				$menu.removeClass("wa-menu-small");
			
			if(this.isTypeCentered)
				this.setCentered();
			if(this.isAlignRight)
				this.setAlignRight();
		}
	}
	else
	{
		this.trySetContentSize();
	}

	this.updateVerticalAlign();
};

MenuShaper.prototype.trySetContentSize = function()
{
	var $this = this;
	if(this.waInMenu$("nav > div > .navbar-collapse").css("display") !=="none" && this.waInMenu$().css("display") !=="none" )
	{
		this.content = this.waInMenu$("nav > div > .navbar-header .navbar-brand").first().outerWidth()
		this.waInMenu$("nav > div > .navbar-collapse >ul > li").each(function(){
			$this.content += $this.waInMenu$(this).outerWidth();
		});

		$searchBar = this.waInMenu$("nav > div > .navbar-collapse > .navbar-form");
		if($searchBar.length)
			this.content +=$searchBar.first().outerWidth()
		this.updateMenuShape();
	}
	else
		this.content=-1;

	this.waInMenu$().removeClass("wa-menu-init");
};

MenuShaper.prototype.updateVerticalAlign = function()
{
	var $navbar = this.waInMenu$(".navbar-nav");
	var $SB = this.waInMenu$(".navbar-form.navbar-right");
	var $header = this.waInMenu$(".navbar-header a.navbar-brand");
	if(!this.waInMenu$().hasClass("wa-menu-small"))
	{
		$header.css("line-height","1.43");

		var diffNavbar = $header.outerHeight()/2 - $navbar.height()/2;
		$navbar.css("margin-top",diffNavbar);

		var diffSB = $header.outerHeight()/2 - $SB.height()/2;
		$SB.css("margin-top",diffSB);

		$header.css("line-height",$header.height()+"px");
	}
	else
	{
		$navbar.css("margin-top",0);
		$SB.css("margin-top",8);
	}
}

MenuShaper.prototype.handle = function()
{
	var $this = this;
	this.isTypeCentered = this.waInMenu$(".navbar").hasClass("wa-menu-centered");
	this.isAlignRight = this.waInMenu$(".navbar").hasClass("wa-menu-alignright");

	this.trySetContentSize();
	this.updateVerticalAlign();
	wa$(window).resize(function() {	
		$this.updateMenuShape();
		$this.updateVerticalAlign();
	});
};


//----------------------------------------------------------------------------------------------------------//

//Menu always on top
var MenuFixedHandler = {
	
	msi:0,
	fixedMenuShaper:0,

	$fixedMenu:0,
	isFluid : true,

	isUsed:false,
	margin:16,

	isMenuVisible:function()
	{
		var $window = wa$(window);
		var docViewTop = $window.scrollTop();
		var docViewBottom = docViewTop + $window.height();

		$elem = this.msi.waInMenu$(".navbar");
		menuTop = $elem.offset().top;
		menuBottom = menuTop + $elem.height();



		if(menuBottom-this.margin <= docViewTop)
			return false;
		else if(menuTop+this.margin >= docViewBottom)
			return false;
		else
			return true;
	},

	setMenuFixed: function(fixed)
	{
		if(fixed && ResponsiveBootstrapToolkit.is('>xs'))
		 	this.$fixedMenu.fadeIn();

		else
			this.$fixedMenu.fadeOut();

		this.fixedMenuShaper.updateMenuShape();
	},

	init: function()
	{
		this.msi.waInMenu$().css('visibility','visible');

		//Clone Menu
		this.isFluid = this.msi.waInMenu$('.navbar').hasClass("wa-aot-fluid");
		this.$fixedMenu = this.msi.waInMenu$().clone().hide().addClass("navbar-fixed-top");
		this.$fixedMenu.attr("id",this.$fixedMenu.attr("id")+"-fixed");
		this.$fixedMenu.find("button").attr("data-target", this.$fixedMenu.find("button").attr("data-target")+"-fixed");
		this.$fixedMenu.find(".navbar-collapse").attr("id", this.$fixedMenu.find(".navbar-collapse").attr("id")+"-fixed");
		this.$fixedMenu.removeClass("wa-menu-small");
		if(!this.isFluid)
		{
			this.$fixedMenu.css("right", "auto");
			this.$fixedMenu.css("left", "auto");
			this.$fixedMenu.css("width", this.msi.waInMenu$().width()+"px");
			var self = this;
			wa$(window).resize(function() {	
				self.$fixedMenu.css("width", self.msi.waInMenu$().width()+"px");
			});
		}			

		this.msi.waInMenu$().parent().append(this.$fixedMenu);

		this.fixedMenuShaper = new MenuShaper(this.$fixedMenu.attr("id"));
		this.fixedMenuShaper.handle();

		var $elem = this.msi.waInMenu$(".navbar");
	},

	handle: function(menuShaperInst)
	{
		//Only first
		if(!this.isUsed)
		{

			this.msi = menuShaperInst;
			this.init();
			this.setMenuFixed(!this.isMenuVisible());
			var self = this;
			wa$(window).scroll(function(){
				self.setMenuFixed(!self.isMenuVisible());
			});
			this.isUsed = true;
		}
	},

}


function resizeCollapseButton(id)
{

	var $menu = wa$('#'+id);
	var coef = $menu.outerHeight()/52;

	var $bar = $menu.find(".navbar-default .navbar-toggle .icon-bar");
	var bar_padding_top = $bar.eq(1).css("margin-top").replace("px","");
	var bar_height = $bar.first().height();
	var bar_width = $bar.first().width();
	$bar.eq(1).css("margin-top",bar_padding_top*coef+"px")
	$bar.eq(2).css("margin-top",bar_padding_top*coef+"px")

	$bar.height(bar_height*coef);
	$bar.width(bar_width*coef);

	var $button = $menu.find(".navbar-toggle");

	$button.css("margin-top",($button.first().css("margin-top").replace("px","")*coef)+"px");
	$button.css("padding-top",($button.first().css("padding-top").replace("px","")*coef)+"px");

	$button.css("margin-bottom",($button.first().css("margin-bottom").replace("px","")*coef)+"px");
	$button.css("padding-bottom",($button.first().css("padding-bottom").replace("px","")*coef)+"px");

	$button.css("border-width",($button.first().css("border-width").replace("px","")*coef)+"px");

}

function resizeSearchButton(id)
{
	var $menu = wa$('#'+id);
	if($menu.find(".navbar-form .input-group .wa-srch-input").length)		
		$menu.find(".wa-srch-button").height(Math.floor($menu.find(".navbar-form .input-group .wa-srch-input").css("line-height").replace("px","")));
}

function searchParentDisplayNone($el)
{
	if($el.length === 0 || $el.is('html'))
		return false;
	else if ($el.css("display")==="none")
		return true;
	else
		return searchParentDisplayNone($el.parent());
}



wa$( document ).ready(function() {
	wa$(window).bind("load", function() {
		wa$(".wa-compmenu").each(function(){
			var $menu = wa$(this);


			var tmp = new MenuShaper($menu.attr("id"));
			tmp.handle();

			resizeCollapseButton($menu.attr("id"));
			resizeSearchButton($menu.attr("id"));
			
			if($menu.find(".navbar").hasClass("wa-always-on-top") && !searchParentDisplayNone($menu) )
				MenuFixedHandler.handle(tmp);
			


			//Menu visible uniquement apres gestion
 			//wa$(this).css('visibility','visible').hide().fadeIn(100);
			wa$(this).css('visibility','visible');
			
		});


		/*Fermeture menu au clic*/
		wa$(".navbar-header>a.navbar-brand,.navbar-collapse>ul>li>a").click(function( event ) { //Level 0
			if(  ResponsiveBootstrapToolkit.is('xs') || wa$(this).closest(".wa-compmenu").hasClass("wa-menu-small") )
			{
				if(wa$(this).siblings("ul").length===0)
				{
					wa$(this).closest(".navbar").find(".navbar-collapse").removeClass("in");
					//console.log("level 0");
				}
			}
		});
		wa$(".dropdown-menu a").click(function( event ) { // Level 1
			if(  ResponsiveBootstrapToolkit.is('xs') || wa$(this).closest(".wa-compmenu").hasClass("wa-menu-small") )
			{
				if(wa$(this).siblings("ul").length===0)
				{
					//console.log("level 1");
					wa$(this).closest("li.dropdown").removeClass("open");
					wa$(this).closest(".navbar-collapse").removeClass("in");
				}
				else
					event.preventDefault();//Floating menu small
			}
			else //if >XS ans !menu-small
			{
				if(wa$(this).siblings("ul").length===0)
					wa$(this).closest("li.dropdown").removeClass("open");
				else
					event.preventDefault();//Floating menu
			}
		});





		wa$("li.dropdown-header").click(function( event ) {event.stopPropagation();}); // Désactivation fermeture Menu sur click dropdownHeader
		wa$(".dropdown-toggle").click(function( event ) {// Gestion ouverture popup menu mode right si besoin
			if(!ResponsiveBootstrapToolkit.is('xs') &&  !wa$(this).closest(".wa-compmenu").hasClass("wa-menu-small"))
			{
				var $parent = wa$(this).parent();
				$parent.find(".dropdown-menu").removeClass("dropdown-menu-right");
				if($parent.hasClass("open"))
					return;
				

				$parent.addClass("open");
				$parent.find(".dropdown-menu").css("visibility","hidden");
				var rightPosMenu = $parent.find(".dropdown-menu").offset().left + $parent.find(".dropdown-menu").outerWidth();
				var rightPosViewport = wa$(window).width();
				var diff = rightPosViewport-rightPosMenu
				waDebug(diff);
				if(diff<0)
					$parent.find(".dropdown-menu").addClass("dropdown-menu-right");
				else
					$parent.find(".dropdown-menu").removeClass("dropdown-menu-right");

				$parent.removeClass("open");
				$parent.find(".dropdown-menu").css("visibility","visible");
			}
			else
			{
				var parent = this;
				setTimeout(function (){
					var menu_offset = 0;
					var diff = wa$(parent).offset().top - wa$(window).scrollTop();
					if(diff<0)
					{
						var speed = 200;
						wa$('html, body').animate( { scrollTop:wa$(parent).offset().top}, speed );
					}
					
				},0);
			}
		}); 

		bindSmoothScroll(".wa-compmenu"); // bind smooth scroll menu

		//binding search toolbar
		bindSearch();
		if(typeof bindGalleries === "function") //rebind gallery
			bindGalleries();

		if(typeof checkShareBarState === "function") //rebind gallery
			checkShareBarState();
	});

});