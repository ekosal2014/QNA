var Common;
if ( !Common ) Common = {};

Common.redirecUrlAfterLogin = function(){
	
	var path = window.location.pathname;
	$('#login').attr('href','/qanda/login/auth?redictUrl='+encodeURIComponent(path.substring(6)));

} 