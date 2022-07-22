function register(){
	if(document.frm.jgNo.value == "0"){
		alert("직군을 선택해 주세요");
		document.frm.jgNo.focus();
		return;	
	}
	if(document.frm.jobName.value == ""){
		alert("직종 명을 입력해 주세요");
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
	if(document.frm.jobName.value == ""){
		alert("직종 명을 입력해 주세요");
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
	
	if(confirm("해당 직종의 하위 데이터까지 모두 삭제됩니다. \n정말 삭제 하시겠습니까?")){
		document.frm.submit();
	}
	else{
		return;
	}
	
}