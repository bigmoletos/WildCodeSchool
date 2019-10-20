/**
* Function de waDebug
* @param {string} text : text à afficher*/
function waDebug(text)
{
    var mDate = new Date();
    console.log('DEBUG : '+mDate.getUTCMinutes()+':'+mDate.getUTCSeconds()+':'+mDate.getUTCMilliseconds()+" \t"+text);
}

String.prototype.replaceAll = function(search, replacement) {
    var target = this;
    return target.replace(new RegExp(search, 'g'), replacement);
};

if (!String.prototype.startsWith) {
  String.prototype.startsWith = function (searchString, position) {
      position = position || 0;
      return this.substr(position, searchString.length) === searchString;
  };
}

if (!String.prototype.endsWith) {
  String.prototype.endsWith = function(searchString, position) {
    var subjectString = this.toString();
    if (typeof position !== 'number' || !isFinite(position) || Math.floor(position) !== position || position > subjectString.length) {
      position = subjectString.length;
    }
    position -= searchString.length;
    var lastIndex = subjectString.indexOf(searchString, position);
    return lastIndex !== -1 && lastIndex === position;
  };
}

var WaGui = {};
WaGui.alert = function(txt)
{
	alert(txt)
}

var waAlignResizeEvent = {}
waAlignResizeEvent.rtime = 0;
waAlignResizeEvent.timeout = false;
waAlignResizeEvent.delta = 30;
waAlignResizeEvent.resizeend = function() 
{
    if (new Date() - this.rtime < this.delta) 
    {
        setTimeout("waAlignResizeEvent.resizeend()", this.delta);
    } else 
    {
        this.timeout = false;
        waManageComVAlign("align","resize")
    }               
}
waAlignResizeEvent.restartTimer = function() 
{
	//alert(this.timeout )
    this.rtime = new Date();
    if (this.timeout === false) 
    {
        this.timeout = true;
        setTimeout("waAlignResizeEvent.resizeend()", this.delta);
    }             
}

function resizeUpdate()
{
	waManageComVAlign("reset","resize");
	waAlignResizeEvent.restartTimer();
}

wa$(window).resize(function() {
 	resizeUpdate();
});


function waBuildSubRowStructure()
{
	var list_global_rows = new Array();
	
	
		wa$.each(wa$('.row-align'), function( index, value ) {

		var row = wa$(value)
		var listObjs = new Array();
		listObjs.h_valid = 	false
		var heightSubRow = 0;
		var list = row.children();

		var list_global_sub_row = new Array();
		
		wa$.each(list, function( index, value ) {
			var obj = wa$(value)
			
		
			if (obj.filter(":visible").length>0)
			{
				var b_is_jump = obj.hasClass("clearfix");
				if (b_is_jump==false)
				{
					listObjs.push(obj);
				}
				else
				{
					if (listObjs.length>0)
					{
						list_global_sub_row.push(listObjs);
						listObjs = new Array();
						listObjs.h_valid = 	false
					}
				}
			}
		});
		
	//	alert("listObjs.length="+listObjs.length)

		if (listObjs.length>0)
		{
			list_global_sub_row.push(listObjs);
		}
		
		list_global_rows.push(list_global_sub_row);
		
		
		});
		return list_global_rows;
}

function waDumpSubRowStructure(rows)
{
	
	var s="";
	s+="row ("+rows.length+")"+"\n"
	for (var i=0;i<rows.length;i++)
	{
		var row = rows[i]
		s+="row:"+i+ " subrow ("+row.length+")"+"\n"
		for (var i2=0;i2<row.length;i2++)
		{
			var sub_row = row[i2]
			s+="sub_row:"+i2+ " elem "+sub_row.length+" valid h="+sub_row.h_valid+"\n"
			for (var i3=0;i3<sub_row.length;i3++)
			{
				var elem = sub_row[i3]
				var pos = elem.position()	
				var h = elem.data("wa-height")
				s+="elem:"+i3+" h="+h+" y="+pos.top+"\n"
			}	
		}
	}
	return s;
}


function waSetHeightElements(rows,event_type)
{
	for (var i=0;i<rows.length;i++)
	{
		var row = rows[i]
		for (var i2=0;i2<row.length;i2++)
		{
			var heightSubRow = 0;
			var sub_row = row[i2]
			var h_valid = true;
			for (var i3=0;i3<sub_row.length;i3++)
			{
				var elem = sub_row[i3]
				var h = elem.data("wa-height")
				if ((h==undefined)||(h<=0))
				{
					var typeCalculHeight = elem.attr("data-typeCalculHeight")
					var ratioWidth = elem.attr("data-ratioWidth")
					var ratioHeight = elem.attr("data-ratioHeight")
					h = elem.height();
					
					var typeCalcul = elem.attr("data-typeCalculHeight")
					if ((event_type!="load")&&(typeCalcul=="aft_load"))
					{
						h = 0;
						//alert(h)
					}
					
					
					
					
					if ((ratioWidth!=undefined) && (ratioWidth>0))
					{
						h = elem.width() * ratioHeight/ ratioWidth;
					}		
				}
				elem.data("wa-height",h)
				heightSubRow = Math.max(heightSubRow,h)
				if (h==0)
				{
					h_valid = false;
				}
			}
			
			sub_row.h_valid = 	h_valid
			
			sub_row.height = heightSubRow;
		}
	}
}

function waResetHeightElements(rows,event_type)
{
	
	for (var i=0;i<rows.length;i++)
	{
		var row = rows[i]
		for (var i2=0;i2<row.length;i2++)
		{
			var sub_row = row[i2]
			sub_row.h_valid = false;
			sub_row.height=0
			for (var i3=0;i3<sub_row.length;i3++)
			{
				var elem = sub_row[i3]
				elem.data("wa-height",elem.height());
				elem.css({"top":0,"opacity":1})
			}	

		}
	}
	
	
	
	rows = waBuildSubRowStructure();
	waSetHeightElements(rows,event_type)
	waAlignElements(rows)
	
//	alert(waDumpSubRowStructure(rows));
}


function waAlignElements(rows)
{
	for (var i=0;i<rows.length;i++)
	{
		var row = rows[i]
		for (var i2=0;i2<row.length;i2++)
		{
			var sub_row = row[i2]

			if (sub_row.h_valid)
			{
				for (var i3=0;i3<sub_row.length;i3++)
				{
					var elem = sub_row[i3]
					
					var h_elem = Math.round(elem.data("wa-height"));

					var b_apply = false;
					var new_y = 0;
					if (elem.hasClass("wa-valign-middle"))
					{
						//	alert(sub_row.height)
						new_y += (sub_row.height - h_elem)/2;
						b_apply = true;
					}
					else
					if (elem.hasClass("wa-valign-full"))
					{
						var paddingH = elem.css('padding-top').replace("px","")+elem.css('padding-bottom').replace("px","");
						elem.find(">div").css({"height":sub_row.height-paddingH,"opacity":1})
						elem.find(">div>div").css("height","100%");
						b_apply = true;
					}
					else
					if (elem.hasClass("wa-valign-bottom"))
					{
						new_y += (sub_row.height - h_elem);
						b_apply = true;
					}
			
				//	b_apply = false;
					
					if (b_apply)
					{
					
						new_y = Math.max(new_y,0)
						elem.css({"top":new_y,"opacity":1})
					}

				}	
			}
			else
			{
				for (var i3=0;i3<sub_row.length;i3++)
				{
					var elem = sub_row[i3]
					if (elem.hasClass("wa-valign-middle") || elem.hasClass("wa-valign-bottom"))
					{
						elem.css({"top":0,"opacity":0})
					}
				}	
			}
		}
	}
}

function waManageComVAlign(code,event_type)
{

//alert("waManageComVAlign"+code+" "+event_type)
	var rows = waBuildSubRowStructure();
	
	if (code=="reset")
	{
		wa$('.wa-valign-full > div').css("height","auto");
		waResetHeightElements(rows,event_type)	
	}
//	

 	rows = waBuildSubRowStructure();
	waSetHeightElements(rows,event_type)
	
	waAlignElements(rows)	
}



function getAnchor() {
    var currentUrl = document.URL,
	urlParts   = currentUrl.split('#');
		
    return (urlParts.length > 1) ? urlParts[1] : null;
}



wa$(window).on('load', function(){
	
	waManageComVAlign("align","load")
	
	waManageComVAlign('reset','resize')


	if(wa$(".wa-compmenu>.wa-always-on-top").length>0 && ResponsiveBootstrapToolkit.is('>xs'))
	{
		
		if (getAnchor()!=null)
		{
			let menu_offset = 52;

			var scrollPage = document.documentElement.scrollTop || document.body.scrollTop;
			//alert(scrollPage)
			document.documentElement.scrollTop = scrollPage-menu_offset

			document.body.scrollTop = scrollPage-menu_offset
			//wa$('html, body').animate( { scrollTop: wa$(page).offset().top-menu_offset}, speed ); // Go
		}
		
	}


//	setTimeout("waManageComVAlign('reset','resize')", 0);
});

function smoothScrollTo(href, speed,type)
{
	//return false;
	var menu_offset = 0;
	if(wa$(".wa-compmenu>.wa-always-on-top").length>0 && ResponsiveBootstrapToolkit.is('>xs'))
		menu_offset = 52;
	var page_target = href; // Page cible


	var offset_target0 = wa$(page_target).offset().top;


//alert("type="+type)
	wa$('html, body').animate( { scrollTop: offset_target0-menu_offset}, speed ,function() {

		//fix pour element calculé en retard qui decale le placement d e l'ancre
		var offset_target1 = wa$(page_target).offset().top;
		if (offset_target0!=offset_target1)
		{
			wa$('html, body').animate( { scrollTop: offset_target1-menu_offset}, speed);
		}

		//alert('scroll finish '+offset_target0 +" "+offset_target1);

	}); // Go
	return false;
}

 function bindSmoothScroll(selector)
 {
		if(selector === undefined) //All exept menu
		    selector = ".scrollTo:not(.wa-compmenu .scrollTo)"
		else
		    selector += " .scrollTo";


//alert('bindSmoothScroll '+selector)
		wa$(selector).click( function() { // Au clic sur un élément
			return smoothScrollTo(wa$(this).attr('href'),750,"clic");
		});
		
}


function createToTheTopButton(){

	var timer;
	wa$("body").append("<div id=\"wa_to_the_top\"><a id=\"wa_to_the_top_button\" class=\"scrollTo\" href=\"#wa-anchor-top\"></a></div>");
	wa$(window).scroll(function (event) {
		var $but = wa$("#wa_to_the_top");
		if(wa$(window).scrollTop()===0 || ResponsiveBootstrapToolkit.is("lg"))
		{
			clearTimeout(timer);
			$but.fadeOut(200);
		}
		else
		{
			$but.fadeIn(500,function(){
				clearTimeout(timer);
		    	timer =  setTimeout(function(){
	 				$but.fadeOut(500);
	 			},3000);
			});
		}
	});
}



wa$().ready(function() {
	
	///INI PARALLAX
	var conts = wa$(".wa-parallax")
        wa$.each(conts, function( index, value ) {
          var cont = wa$(value) 
			if (ResponsiveBootstrapToolkit.is("xs")) 
			{
				//////
			}
			else
			{
				cont.css({"background-image":"url()"})//importnt
			}
      });
});






	wa$(window).on('load', function(){
	
    wa$( ".g_recaptcha" ).each(function( index ) {
		grecaptcha.render(wa$( this ).attr('id'), {'sitekey' : wa$( this ).data("sitekey")});
	});
});


wa$().ready(function() {
	
	
	//	alert("ready")
		waManageComVAlign("align","ready")

		createToTheTopButton();

		///SMOOTH SCROLL
	
		bindSmoothScroll();

		///IMAGE ROLL OVER
		wa$(".wa-img-rollover").hover(
		function() 
		{
			//console.log("over")
			var img1 = wa$( this ).find(".wa-over1");
			var img2 = wa$( this ).find(".wa-over2");
			//img1.data("over",img2)
			
			var par = img1.parent();
		
		//	alert(img1.position().top)
			var lx = img1.width()
  			var ly = img1.height()

			img2.width(lx)
  			img2.height(ly)
  			img2.css({"opacity": "0"})
  			img2.css({"top":img1.position().top+"px","left":img1.position().left+"px"})
			img2.show()
  		
			img1.stop().animate({"opacity": "0"}, "slow");
			img2.stop().animate({"opacity": "1"}, "slow");

		},
		function() 
		{
			//console.log('out')
			var img1 = wa$( this ).find(".wa-over1");
			var img2 = wa$( this ).find(".wa-over2");

			//console.log('out ' +img1+" "+img2)
			img1.stop().animate({"opacity": "1"}, "slow");
			img2.stop().animate({"opacity": "0"}, "slow");
		
		
		});
		///END IMAGE ROLL OVER

		if (WaComponentContext.array_maps!=undefined)
		for (var i = 0;i<WaComponentContext.array_maps.length;i++)
		{
			var data_maps = WaComponentContext.array_maps[i]
			var latitude = data_maps["lat"];
			var longitude = data_maps["long"];
			var mapdId = data_maps["waid"];
	
			var latlng = new google.maps.LatLng(latitude,longitude);
			var myOptions = {
			zoom: 16,
			zoomControl: true,
			 panControl: true,
			center: latlng,
			 mapTypeId: google.maps.MapTypeId.ROADMAP
			};
			var map = new google.maps.Map(document.getElementById("wa-gmap-"+mapdId),myOptions);
			var marker = new google.maps.Marker({position: latlng});
			marker.setMap(map);
		}	
});