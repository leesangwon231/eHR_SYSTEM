function register(){
	if(document.frm.jgNo.value == "0"){
		alert("직군을 선택해 주세요");
		document.frm.jgNo.focus();
		return;	
	}
	if(document.frm.jobNo.value == "0"){
		alert("직종을 선택해 주세요");
		document.frm.jobNo.focus();
		return;	
	}
	if(document.frm.lName.value == ""){
		alert("직렬명을 입력해 주세요");
		document.frm.lName.focus();
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
	if(document.frm.jgNo.value == "0"){
		alert("직군을 선택해 주세요");
		document.frm.jgNo.focus();
		return;	
	}
	if(document.frm.jobNo.value == "0"){
		alert("직종을 선택해 주세요");
		document.frm.jobNo.focus();
		return;	
	}
	if(document.frm.lName.value == ""){
		alert("직렬명을 입력해 주세요");
		document.frm.lName.focus();
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