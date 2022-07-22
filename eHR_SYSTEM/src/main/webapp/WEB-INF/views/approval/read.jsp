<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@include file="../include/header.jsp"%>
<script type="text/javascript" src="/resources/js/lcategory.js"></script>
<script src="https://code.jquery.com/jquery-2.2.1.js"></script>
<div id="layoutSidenav_content">
   <main>
	   <div class="container-fluid px-4">
	      <h1 class="mt-4" style='text-align: left; margin-bottom: 30px;'>업무일지 상세보기</h1>
				<div class="container-fluid px-5">
	                <form role="form" method="post" name="frm" >    
	                    <div class="pt-5 px-5">
			                    	<div class="row ">
			                    		<div class="col-1 text-center">
			                    			<label for="exampleInputEmail1">사원번호</label>
			                    		</div>
			                    		<div class="col-3">
			                    			<input type="text" id = "memNo" name="memNo" class = "form-select" readonly="readonly" value="${login.memNo }">
			                    		</div>
			                    		<div class="col-1 text-center">
			                    			<label for="exampleInputEmail1">사원명</label>
			                    		</div>
			                    		<div class="col-3">
			                    			<input type="text" id = "memName" name="memName" class = "form-select" readonly="readonly" value="${login.memName}">
			                    		</div>
			                    		<div class="col-1 text-center">
			                    			<label for="exampleInputEmail1">근무 일자</label>
			                    		</div>
			                    		<div class="col-3">
			                    			<input type="text" id = "jnWdate" name="jnWdate" class = "form-select" readonly="readonly" value="${J.jnWdate}">
			                    		</div>
  									</div>
  									<div class="row pt-5">
			                    		<div class="col-1 text-center">
			                    			<label for="exampleInputEmail1">직군</label>
			                    		</div>
			                    		<div class="col-3">
			                    			<input type="text" id = "jgName" name="jgName" class = "form-select" readonly="readonly">
			                    		</div>
			                    		<div class="col-1 text-center">
			                    			<label for="exampleInputEmail1">직종</label>
			                    		</div>
			                    		<div class="col-3">
			                    			<input type="text" id = "jobName" name="jobName" class = "form-select" readonly="readonly">
			                    		</div>
			                    		<div class="col-1 text-center">
			                    			<label for="exampleInputEmail1">평가점수</label>
			                    		</div>
			                    		<div class="col-3">
			                    			<input type="text" id = "jnSatisfaction" name="jnSatisfaction" class = "form-select" readonly="readonly" value="${J.jnSatisfaction}">
			                    		</div>
  									</div>
				          </div>	
	                        <div class="mt-4">
	                       	 	<div class="offset-9" style="position: absolute; right: 6%;">
			                       	<input type="button" class="btn btn-primary" id = "btn_submit" name ="btn_submit" value="등록">
			                    	<input type="button" class="btn btn-primary" onclick="location.href='/lcategory/list'" value="취소">
			                	</div>
	                        </div>
	                  </form>      
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
		$("#btn_submit").on("click", function() {
			register();
		});
	});
</script>




<%@include file="../include/footer.jsp"%>