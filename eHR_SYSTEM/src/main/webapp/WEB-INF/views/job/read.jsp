<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@include file="../include/header.jsp"%>
<script type="text/javascript" src="/resources/js/job.js"></script>
<script src="https://code.jquery.com/jquery-2.2.1.js"></script>
<div id="layoutSidenav_content">
   <main>
	   <div class="container-fluid px-4">
	      <h1 class="mt-4" style='text-align: left; margin-bottom: 30px;'>직종 상세보기</h1>
				<div class="container-fluid px-5">
	                    <div class="pt-5">
	                        <div class="row" >
		                        <div class="col-lg-1">
								</div>
								<form role="form" method="post" name="frm">
			                        <div class="col-lg-10">
			                        	<div class="row p-5">
				                    		<div class="col-1">
				                        		<label for="exampleInputEmail1">직군</label>
				                        	</div>
		                        			<div class="col-9">
		                        				<input type="text" id = "jgName" name="jgName" class = "form-control" readonly="readonly" value="${jobVo.jgName}">
				                        	</div>
			                        	</div>
			                        	<div class="row p-5">
				                        	<div class="col-2">
				                        		<label for="exampleInputEmail1"> 직종 번호</label>
				                        	</div>
		                        			<div class="col-8">
				                        		<input type="text" id = "jobNo" name="jobNo" class = "form-control" readonly="readonly" value="${jobVo.jobNo}">
				                        	</div>
			                        	</div>
			                        	<div class="row p-5">
				                        	<div class="col-2">
				                        		<label for="exampleInputEmail1">직종 명</label>
				                        	</div>
		                        			<div class="col-8">
				                       			<input type="text" id = "jobName" name="jobName" class = "form-control" value="${jobVo.jobName}">
				                       		</div>
			                        	</div>
			                       	</div>
		                       	</form>
		                       	<div class="col-lg-1" >
		                       	</div>
	                   		</div>
	                  	</div>
                        <div class="mt-4">
                       	 	<div class="offset-9">
                       	 		<input type="button" class="btn btn-primary" id = "btn_delete"  name ="btn_delete" value="삭제">
		                       	<input type="button" class="btn btn-primary" id = "btn_modify" onclick="location.href='./modify?jobNo=${jobVo.jobNo}'"name ="btn_update" value="수정">
		                    	<input type="button" class="btn btn-primary" onclick="location.href='./list'" value="취소">
		                	</div>
                        </div>      
               		</div>
           	 	</div>              
	   		</div>
		</main>
<script src="https://code.jquery.com/jquery-2.2.1.js"></script>
<script>
   var result = '${msg}';

   if (result == 'REGISTER') {
      alert("등록되었습니다.");
   }

   if (result == 'MODIFY') {
      alert("수정되었습니다.");
   }

   if (result == 'REMOVE') {
      alert("삭제되었습니다.");
   }
   
   if (result == 'CANNOT') {
		alert("로그인 정보가 일치하지 않아 수정 불가능합니다.");
	}
  
  if (result == 'CANTDELETE') {
		alert("로그인 정보가 일치하지 않아 삭제 불가능합니다.");
	}
</script>

<script>
	$(document).ready(function() {
		
		var formObj = $("form[role='form']");
		console.log(formObj);
		$("#btn_delete").on("click", function() {
			formObj.attr("action", "/job/remove");
			remove();
			
		});
		
		
	});
</script>

<script>
	function selectJobGroup(jgNo) {
	   
		var jgNo = jgNo;
	    
	   	if(jgNo === "0"){
            $("#jobNo option").remove();
            job = "<option value='0'>직종을 선택해주세요</option>";
            $("#jobNo").append(job);
            return false;
        }
 
	   	$.ajax({
			type : 'GET',
			url : "/lcategory/jobList",
			data : {
				jgNo : jgNo,
			},
			success : function(data) {
				job = "<option value='0'>직종을 선택해주세요</option>"; 
				$("#jobNo option").remove(); 
				$.each(data , function (key, value) {
					job += "<option value=" + value.jobNo + ">" + value.jobName + "</option>";
	                }); 
	                $("#jobNo").append(job);
              
			},
			error : function(jqXHR, textStatus, errorThrown) {
				alert("ERROR : " + textStatus + " : " + errorThrown);
			}

		});
	   }                           
	

</script>


<%@include file="../include/footer.jsp"%>