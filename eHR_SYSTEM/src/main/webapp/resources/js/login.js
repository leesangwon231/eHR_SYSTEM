function check(){
	var msg = "<c:out value ='${msg}'/>"
	
	
	if(document.frm.memNo.value == ""){
		alert("사원번호를 입력해주세요");
		document.frm.memNo.focus();
		return;	
	}
	if(document.frm.memPw.value == ""){
		alert("비밀번호를 입력해주세요");
		document.frm.memPw.focus();
		return;	
	}
	
	
	document.frm.submit();
	
	
}


	
