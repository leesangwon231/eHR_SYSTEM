function register(){
	if(document.frm.jgName.value == "0"){
		alert("직군을 선택해 주세요");
		document.frm.jgName.focus();
		return;	
	}
	if(document.frm.jobName.value == "0"){
		alert("직종을 선택해 주세요");
		document.frm.jobName.focus();
		return;	
	}
	if(document.frm.lNo.value == "0"){
		alert("대분류를 선택해 주세요");
		document.frm.lNo.focus();
		return;	
	}
	if(document.frm.sName.value == ""){
		alert("소분류 명을 선택해 주세요");
		document.frm.jobName.focus();
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
	if(document.frm.lNo.value == ""){
		alert("대분류 명을 선택해 주세요");
		document.frm.lNo.focus();
		return;	
	}
	if(document.frm.sName.value == ""){
		alert("소분류 명을 선택해 주세요");
		document.frm.sName.focus();
		return;	
	}
	if(document.frm.sYear.value == ""){
		alert("연을 입력해 주세요");
		document.frm.sYear.focus();
		return;	
	}
	if(document.frm.sQuarter.value == ""){
		alert("분기를 입력해 주세요");
		document.frm.sQuarter.focus();
		return;	
	}
	if(document.frm.sMonth.value == ""){
		alert("월을 입력해 주세요");
		document.frm.sMonth.focus();
		return;	
	}
	if(document.frm.sDay.value == ""){
		alert("일을 입력해 주세요");
		document.frm.sDay.focus();
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