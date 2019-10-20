/**
 *
 *
 */
function WaFxRippleEffect(element){
    this.element = element;
    this.element.addEventListener('click', this.run.bind(this), false);
}
WaFxRippleEffect.prototype = {
    run: function(event){

        let factor = WaFxWindow.currentScreen().factor();
    

        var ripplerContainer = this.element.querySelector('.ripple-container');
        if(ripplerContainer) {
            ripplerContainer.remove();
        }
        var rippleContainer = document.createElement('div');
        rippleContainer.style.position = 'absolute';
        rippleContainer.style.zIndex = 99999;
        rippleContainer.style.left = 0 + 'px';
        rippleContainer.style.top = 0 + 'px';
        rippleContainer.style.width = '100%';
        rippleContainer.style.height = '100%';
        rippleContainer.className = 'ripple-container';
        rippleContainer.style.overflow = 'hidden';
        
        this.element.appendChild(rippleContainer);

        let scroll  = WaFxWindow.scrollPosition();

        var offsetInfo = this.element.getBoundingClientRect();
        var maxLength = offsetInfo.width > offsetInfo.height ? offsetInfo.width : offsetInfo.height;
        var circleD = maxLength * 2;

        var ripple = document.createElement('div');
        ripple.style.position = 'absolute';
        ripple.style.width = circleD + 'px';
        ripple.style.height = circleD + 'px';
        ripple.style.borderRadius = '500px';
        ripple.style.left = ((event.pageX - offsetInfo.left - scroll.left)/factor - circleD/2) + 'px';
  
        ripple.style.top = ((event.pageY - offsetInfo.top - scroll.top)/factor - circleD/2) + 'px';

 
        // alert(ripple.style.transform)

        ripple.className = 'ripple';
        rippleContainer.appendChild(ripple);
        ripple.addEventListener('animationend', function(){
            rippleContainer.remove();
        }.bind(this), false);
    }
};
