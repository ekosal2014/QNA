/**
 * 
 */
$(document).ready(function(){
	$(document).ajaxStart(function () {     
		NProgress.start();
    });
    $(document).ajaxStop(function () {        
    	NProgress.done();
    });
    $(document).ajaxError(function () {       
    	NProgress.done();
    }); 
});

function listHomePage(){
	
}