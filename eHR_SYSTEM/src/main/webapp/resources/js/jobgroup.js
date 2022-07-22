function register(){
	if(document.frm.jgName.value == ""){
		alert("직군명을 입력해 주세요");
		document.frm.jgName.focus();
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
	if(document.frm.jgName.value == ""){
		alert("직군명을 입력해 주세요");
		document.frm.jgName.focus();
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
	
	if(confirm("해당 직군의 하위 데이터까지 모두 삭제됩니다. \n정말 삭제 하시겠습니까?")){
		document.frm.submit();
	}
	else{
		return;
	}
	
}