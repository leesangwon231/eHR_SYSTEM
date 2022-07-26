function checkJn(){
	
	if(document.frm.jnWdate.value == ""){
		alert("근무 일자를 선택해주세요.");
		document.frm.jnWdate.focus();
		return false;	
	}

	for (var i = 0; i < 10; i++) {
			
		if(document.getElementById("jnLIst["+i+"].sNo").value==""){
				alert("직무를 선택해 주세요");
				document.getElementById("ssNo"+i).focus();
				return false;
				
			}	
		
		
			if(isNaN(document.getElementById("jndProgress"+i).value)){
				alert("진척도를 숫자로 입력해 주세요");
				document.getElementById("jndProgress"+i).focus();
				return false;
			}
			
			if(document.getElementById("jndProgress"+i).value > 100){
				alert("진척도를 100이하로 작성해 주세요");
				document.getElementById("jndProgress"+i).focus();
				return false;
			}
			

	
}
	
	for (var i = 0; i < 10; i++) {
		
		if(document.getElementById("jndProgress"+i).value ==""){
			$("#jndProgress"+i).val(0);
			return true;
		}
		
	   
	 	if(document.getElementById("jndNote"+i).value==""){
		   $("#jndNote"+i).val("-");
		   return true;
	 	}
	   	  
	}

	

}


