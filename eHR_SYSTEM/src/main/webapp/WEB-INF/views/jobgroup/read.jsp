<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@include file="../include/header.jsp"%>
<script type="text/javascript" src="/resources/js/jobgroup.js"></script>
<script src="https://code.jquery.com/jquery-2.2.1.js"></script>
<div id="layoutSidenav_content">
   <main>
	   <div class="container-fluid px-4">
	      <h1 class="mt-4" style='text-align: left; margin-bottom: 30px;'>직군 상세보기</h1>
				<div class="container-fluid px-5">
	                    <div class="pt-5">
	                        <div class="row" >
		                        <div class="col-lg-1">
								</div>
								<form role="form" method="post" name="frm" action="delete">
			                        <div class="col-lg-10">
			                        	<div class="row p-5">
				                        	<div class="col-2">
				                        		<label for="exampleInputEmail1">직군 번호</label>
				                        	</div>
		                        			<div class="col-8">
				                        		<input type="text" id = "jgNo" name="jgNo" class = "form-control" readonly="readonly" value="${jgVo.jgNo}">
				                        	</div>
			                        	</div>
			                        	<div class="row p-5">
				                        	<div class="col-2">
				                        		<label for="exampleInputEmail1">직군명</label>
				                        	</div>
		                        			<div class="col-8">
				                       			<input type="text" id = "jgName" name="jgName" class = "form-control" readonly="readonly" value="${jgVo.jgName}">
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
                       	 		
		                       	<input type="button" class="btn btn-outline-primary" id = "btn_modify" onclick="location.href='./modify?jgNo=${jgVo.jgNo}'"name ="btn_update" value="수정">
		                    	<input type="button" class="btn btn-outline-dark" onclick="location.href='/jobgroup/list'" value="취소">
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
  

  
  $(document).ready(function() {
		var formObj = $("form[role='form']");
		console.log(formObj);
		$("#btn_delete").on("click", function() {
			remove();
			formObj.attr("action", "/jobgroup/delete");
			
		});
		
		
	});
  
  
</script>


<%@include file="../include/footer.jsp"%>