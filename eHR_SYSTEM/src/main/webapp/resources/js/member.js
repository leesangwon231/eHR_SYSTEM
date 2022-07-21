function register(){
	if(document.frm.memName.value == ""){
		alert("사원명을 입력해 주세요");
		document.frm.memName.focus();
		return;	
	}
	
	if(document.frm.memPw.value == ""){
		alert("비밀번호를 입력해주세요.");
		document.frm.memPw.focus();
		return;   
	}
		   
	/*if(document.frm.memPwfm.value == ""){
		alert("비밀번호를 확인해주세요.");
		document.frm.memPwfm.focus();
		return;   
	}
		   
	if(document.frm.memPw.value != document.frm.memPwfm.value){
		alert("비밀번호가 일치 하지 않습니다.");
		document.frm.memPwfm.value = "";
		document.frm.memPwfm.focus();
		return;   
	}*/
		   

	if(document.frm.memEmail.value == ""){
		alert("이메일을 입력해주세요.");
		document.frm.memEmail.focus();
		return;   
	}
		   
		   var str = document.frm.memEmail.value;
		   var atPos = str.indexOf('@');
		   var atLastPos = str.lastIndexOf('@');
		   var dotPos = str.indexOf('.');
		   var spacePos = str.indexOf(' ');
		   var commaPos = str.indexOf(',');
		   var eMailSize = str.length;
		   if(atPos > 1 && atPos == atLastPos &&
		      dotPos > 3 && spacePos == -1 && commaPos == -1 &&
		      atPos + 1 < dotPos && dotPos + 1 < eMailSize){
		      
		   }else{
		      alert("E-mail주소 형식이 잘못 되었습니다 \n\r다시 입력해주세요!");
		      document.frm.memEmail.focus();
		      return;
		   }
		   
	if(document.frm.memZipcode.value == ""){
		alert("우편번호를 검색해주세요.");
		document.frm.memZipcode.focus();
		return;
	}
		  
	if(document.frm.memAddr2.value == ""){
		alert("상세주소를 입력해주세요.");
		document.frm.memAddr2.focus();
		return;
	}
	
	if(document.frm.memHiredate.value == ""){
		alert("입사일자를 입력해주세요.");
		document.frm.memHiredate.focus();
		return;
	}
	
	if(document.frm.deptNo.value == "0"){
		alert("부서를 선택해주세요.");
		document.frm.deptNo.focus();
		return;
	}
	
	if(document.frm.jgNo.value == "0"){
		alert("직군을 선택해주세요.");
		document.frm.jgNo.focus();
		return;
	}
	
	if(document.frm.memPosition.value == ""){
		alert("직위를 선택해주세요.");
		document.frm.memPosition.focus();
		return;
	}
	
	if(document.frm.memRes.value == ""){
		alert("직책을 선택해주세요.");
		document.frm.memRes.focus();
		return;
	}
	  
	if(confirm("등록 하시겠습니까?")){
		document.frm.submit();
	}
	else{
		return;
	}
	
}



function modify(){

	if(document.frm.memName.value == ""){
		alert("사원명을 입력해 주세요");
		document.frm.memName.focus();
		return;	
	}
	
	if(document.frm.memPw.value == ""){
		alert("비밀번호를 입력해주세요.");
		document.frm.memPw.focus();
		return;   
	}
		   
	if(document.frm.memPwfm.value == ""){
		alert("비밀번호를 확인해주세요.");
		document.frm.memPwfm.focus();
		return;   
	}
		   
	if(document.frm.memPw.value != document.frm.memPwfm.value){
		alert("비밀번호가 일치 하지 않습니다.");
		document.frm.memPwfm.value = "";
		document.frm.memPwfm.focus();
		return;   
	}
		   

	if(document.frm.memEmail.value == ""){
		alert("이메일을 입력해주세요.");
		document.frm.memEmail.focus();
		return;   
	}
		   
		   var str = document.frm.memEmail.value;
		   var atPos = str.indexOf('@');
		   var atLastPos = str.lastIndexOf('@');
		   var dotPos = str.indexOf('.');
		   var spacePos = str.indexOf(' ');
		   var commaPos = str.indexOf(',');
		   var eMailSize = str.length;
		   if(atPos > 1 && atPos == atLastPos &&
		      dotPos > 3 && spacePos == -1 && commaPos == -1 &&
		      atPos + 1 < dotPos && dotPos + 1 < eMailSize){
		      
		   }else{
		      alert("E-mail주소 형식이 잘못 되었습니다 \n\r다시 입력해주세요!");
		      document.frm.memEmail.focus();
		      return;
		   }
		   
	if(document.frm.memZipcode.value == ""){
		alert("우편번호를 검색해주세요.");
		document.frm.memZipcode.focus();
		return;
	}
		  
	if(document.frm.memAddr2.value == ""){
		alert("상세주소를 입력해주세요.");
		document.frm.memAddr2.focus();
		return;
	}
	
	if(document.frm.memHiredate.value == ""){
		alert("입사일자를 입력해주세요.");
		document.frm.memHiredate.focus();
		return;
	}
	
	if(document.frm.deptNo.value == "0"){
		alert("부서를 선택해주세요.");
		document.frm.deptNo.focus();
		return;
	}
	
	if(document.frm.jgNo.value == "0"){
		alert("직군을 선택해주세요.");
		document.frm.jgNo.focus();
		return;
	}
	
	if(document.frm.memPosition.value == "0"){
		alert("직위를 선택해주세요.");
		document.frm.memPosition.focus();
		return;
	}
	
	if(document.frm.memRes.value == "0"){
		alert("직책을 선택해주세요.");
		document.frm.memRes.focus();
		return;
	}
	
	if(confirm("수정 하시겠습니까?")){
		document.frm.submit();
	}
	else{
		return;
	}
	
}

function remove(){
	
	if(confirm("삭제 하시겠습니까?")){
		document.frm.submit();
	}
	else{
		return;
	}
	
}