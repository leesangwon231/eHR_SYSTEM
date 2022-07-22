function register(){
	if(document.frm.jgName.value == "0"){
		alert("직군을 선택해 주세요");
		document.frm.jgName.focus();
		return false;	
	}
	if(document.frm.jobName.value == "0"){
		alert("직종을 선택해 주세요");
		document.frm.jobName.focus();
		return false;	
	}
	if(document.frm.lNo.value == "0"){
		alert("대분류를 선택해 주세요");
		document.frm.lNo.focus();
		return false;	
	}
	if(document.frm.sName.value == ""){
		alert("소분류 명을 입력해 주세요");
		document.frm.jobName.focus();
		return false;	
	}
	if(document.frm.sYear.value == ""){
		alert("연을 입력해 주세요");
		document.frm.sYear.focus();
		return false;	
	}
	for(var i=0; i<document.frm.sYear.value.length; i++) {
		ch = document.frm.sYear.value.charAt(i)
		if(!(ch >= '0' && ch <='9')) {
			alert("연에는 숫자만 입력할 수 있습니다.");
			document.frm.sYear.value = "";
			document.frm.sYear.focus();
			return false;
		}
	}
	if(document.frm.sMonth.value == ""){
		alert("월을 입력해 주세요");
		document.frm.sMonth.focus();
		return false;	
	}
	for(var i=0; i<document.frm.sMonth.value.length; i++) {
		ch = document.frm.sMonth.value.charAt(i)
		if(!(ch >= '0' && ch <='9')) {
			alert("월에는 숫자만 입력할 수 있습니다.");
			document.frm.sMonth.value = "";
			document.frm.sMonth.focus();
			return false;
		}
	}
	if(document.frm.sQuarter.value == ""){
		alert("분기를 입력해 주세요");
		document.frm.sQuarter.focus();
		return false;	
	}
	for(var i=0; i<document.frm.sQuarter.value.length; i++) {
		ch = document.frm.sQuarter.value.charAt(i)
		if(!(ch >= '0' && ch <='9')) {
			alert("분기에는 숫자만 입력할 수 있습니다.");
			document.frm.sQuarter.value = "";
			document.frm.sQuarter.focus();
			return false;
		}
	}
	if(document.frm.sDay.value == ""){
		alert("일을 입력해 주세요");
		document.frm.sDay.focus();
		return false;	
	}
	for(var i=0; i<document.frm.sDay.value.length; i++) {
		ch = document.frm.sDay.value.charAt(i)
		if(!(ch >= '0' && ch <='9')) {
			alert("일에는 숫자만 입력할 수 있습니다.");
			document.frm.sDay.value = "";
			document.frm.sDay.focus();
			return false;
		}
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
		return false;	
	}
	if(document.frm.jobNo.value == "0"){
		alert("직종을 선택해 주세요");
		document.frm.jobNo.focus();
		return false;	
	}
	if(document.frm.lNo.value == ""){
		alert("대분류 명을 선택해 주세요");
		document.frm.lNo.focus();
		return false;	
	}
	if(document.frm.sName.value == ""){
		alert("소분류 명을 선택해 주세요");
		document.frm.sName.focus();
		return false;	
	}
	if(document.frm.sYear.value == ""){
		alert("연을 입력해 주세요");
		document.frm.sYear.focus();
		return false;	
	}
	for(var i=0; i<document.frm.sYear.value.length; i++) {
		ch = document.frm.sYear.value.charAt(i)
		if(!(ch >= '0' && ch <='9')) {
			alert("연에는 숫자만 입력할 수 있습니다.");
			document.frm.sYear.value = "";
			document.frm.sYear.focus();
			return false;
		}
	}
	if(document.frm.sMonth.value == ""){
		alert("월을 입력해 주세요");
		document.frm.sMonth.focus();
		return false;	
	}
	for(var i=0; i<document.frm.sMonth.value.length; i++) {
		ch = document.frm.sMonth.value.charAt(i)
		if(!(ch >= '0' && ch <='9')) {
			alert("월에는 숫자만 입력할 수 있습니다.");
			document.frm.sMonth.value = "";
			document.frm.sMonth.focus();
			return false;
		}
	}
	if(document.frm.sQuarter.value == ""){
		alert("분기를 입력해 주세요");
		document.frm.sQuarter.focus();
		return false;	
	}
	for(var i=0; i<document.frm.sQuarter.value.length; i++) {
		ch = document.frm.sQuarter.value.charAt(i)
		if(!(ch >= '0' && ch <='9')) {
			alert("분기에는 숫자만 입력할 수 있습니다.");
			document.frm.sQuarter.value = "";
			document.frm.sQuarter.focus();
			return false;
		}
	}
	if(document.frm.sDay.value == ""){
		alert("일을 입력해 주세요");
		document.frm.sDay.focus();
		return false;	
	}
	for(var i=0; i<document.frm.sDay.value.length; i++) {
		ch = document.frm.sDay.value.charAt(i)
		if(!(ch >= '0' && ch <='9')) {
			alert("일에는 숫자만 입력할 수 있습니다.");
			document.frm.sDay.value = "";
			document.frm.sDay.focus();
			return false;
		}
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