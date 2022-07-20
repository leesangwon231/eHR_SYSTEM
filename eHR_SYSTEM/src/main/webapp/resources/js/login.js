function check(){
	 var patternMemNo = new RegExp("[0-9]{5,6}");
	
	if(document.frm.memNo.value == ""){
		alert("사원번호를 입력해주세요");
		document.frm.memNo.focus();
		return;	
	}
	
	if(isNaN(document.frm.memNo.value)){
		alert("사원번호를 숫자로 입력해 주세요");
		document.frm.memNo.focus();
		return;	
	}
	
	if(!patternMemNo.test(document.frm.memNo.value)){
	    alert('사원번호를 5글자로 입력 해주세요');
	    document.frm.memNo.focus();
	    return ;
	} 

	if(document.frm.memPw.value == ""){
		alert("비밀번호를 입력해주세요");
		document.frm.memPw.focus();
		return;	
	}
	
	
	document.frm.submit();
	
	
}


	
