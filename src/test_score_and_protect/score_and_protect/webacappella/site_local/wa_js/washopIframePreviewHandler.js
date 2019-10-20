wa$().ready(function() {
	iFrameResize({
		log:false,
		resizedCallback:function(){
			wa$("#wa-shop-preview-mode-iframe").show();
			wa$("#wa-shop-preview-mode-offline-image").hide();
		}
	},"#wa-shop-preview-mode-iframe");
});