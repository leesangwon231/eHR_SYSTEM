<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@include file="../include/header.jsp"%>
<script type="text/javascript" src="/resources/js/dept.js"></script>
<script src="https://code.jquery.com/jquery-2.2.1.js"></script>
<div id="layoutSidenav_content">
   <main>
	   <div class="container-fluid px-4">
	      <h1 class="mt-4" style='text-align: left; margin-bottom: 30px;'>부서 수정</h1>
				<div class="container-fluid px-5">
	                    <div class="pt-5">
	                        <div class="row" >
		                        <div class="col-lg-1">
								</div>
								<form role="form" method="post" name="frm" action="modify">
			                        <div class="col-lg-10">
			                        	<div class="row p-5">
				                        	<div class="col-2">
				                        		<label for="exampleInputEmail1">부서 번호</label>
				                        	</div>
		                        			<div class="col-8">
				                        		<input type="text" id = "deptNo" name="deptNo" class = "form-control" readonly="readonly" value="${DeptVO.deptNo}">
				                        	</div>
			                        	</div>
			                        	<div class="row p-5">
				                        	<div class="col-2">
				                        		<label for="exampleInputEmail1">부서명</label>
				                        	</div>
		                        			<div class="col-8">
				                       			<input type="text" id = "deptName" name="deptName" class = "form-control" value="${DeptVO.deptName}">
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
		                       	<input type="button" class="btn btn-primary" id = "btn_submit" name ="btn_submit" value="수정">
		                    	<input type="button" class="btn btn-primary" onclick="location.href='/dept/read?deptNo=${DeptVO.deptNo}'" value="취소">
		                	</div>
                        </div>      
               		</div>
           	 	</div>              
	   		</div>
		</main>
<script src="https://code.jquery.com/jquery-2.2.1.js"></script>
<script>
  
	$(document).ready(function() {
		var formObj = $("form[role='form']");
		var deptNo = "<c:out value ='${DeptVO.deptNo}'/>"
				
		$("#btn_submit").on("click", function() {
			modify();
		});
	});
</script>

<%@include file="../include/footer.jsp"%>