function register(){
	if(document.frm.jgName.value == ""){
		alert("부서명을 입력해 주세요");
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
		alert("부서명을 입력해 주세요");
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
	
	if(confirm("삭제 하시겠습니까?")){
		document.frm.submit();
	}
	else{
		return;
	}
	
}