<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@include file="../include/header.jsp"%>
<script type="text/javascript" src="/resources/js/member.js"></script>
<script src="https://code.jquery.com/jquery-2.2.1.js"></script>
<div id="layoutSidenav_content">
   <main>
	   <div class="container-fluid px-4">
	      <h1 class="mt-4" style='text-align: left; margin-bottom: 30px;'>사원 상세보기</h1>
				<div class="container-fluid px-5">
	                    <div class="pt-5">
	                        <div class="row" >
		                        <div class="col-lg-1">
								</div>
								<form role="form" method="post" name="frm" action="delete">
								
			                         <div class="col-lg-10">
			                        	<div class="row p-4">
				                        	<div class="col-2">
				                        		<label for="exampleInputEmail1">사원 번호</label>
				                        	</div>
		                        			<div class="col-7">
				                        		<input type="text" id = "memNo" name="memNo" class = "form-control" readonly="readonly" value="${memberVO.memNo}">
				                 			</div>
			                        	</div>
			                        	
			                        	<div class="row p-4">
				                        	<div class="col-2">
				                        		<label for="exampleInputEmail1">사원명</label>
				                        	</div>
		                        			<div class="col-7">
				                       			<input type="text" id = "memName" name="memName" class = "form-control" readonly="readonly" value="${memberVO.memName}">
				                       		</div>
			                        	</div>
			                       
			                        	<div class="row p-4">
				                        	<div class="col-2">
				                        		<label for="exampleInputEmail1">이메일</label>
				                        	</div>
		                        			<div class="col-7">
				                       			<input type="text" id = "memEmail" name="memEmail" class = "form-control" readonly="readonly" value="${memberVO.memEmail}">
				                       		</div>
			                        	</div>
			                        	
			                        	<div class="row p-4">
				                        	<div class="col-2">
				                        		<label for="exampleInputEmail1">우편번호</label>
				                        	</div>
		                        			<div class="col-7">
				                       			<input type="text" id="memZipcode" name="memZipcode" class = "form-control" readonly="readonly" value="${memberVO.memZipcode}">
				                       		</div>
				                       	</div>  
				                    	
				                    	<div class="row p-4">
				                        	<div class="col-2">
				                        		<label for="exampleInputEmail1">주소</label>
				                        	</div>
		                        			<div class="col-7">
				                       			<input type="text" id="memAddr1" name="memAddr1" class = "form-control" readonly="readonly" value="${memberVO.memAddr1}">
				                       		</div>
			                        	</div>
			                        	
			                        	<div class="row p-4">
				                        	<div class="col-2">
				                        		<label for="exampleInputEmail1">상세주소</label>
				                        	</div>
		                        			<div class="col-7">
				                       			<input type="text" id = "memAddr2" name="memAddr2" class = "form-control" readonly="readonly"  value="${memberVO.memAddr2}">
				                       		</div>
			                        	</div>
			                        	
			                        	<div class="row p-4">
				                        	<div class="col-2">
				                        		<label for="exampleInputEmail1">입사일자</label>
				                        	</div>
		                        			<div class="col-7">
				                       			<input type="text" id = "memHiredate" name="memHiredate" class = "form-control" readonly="readonly" value="${memberVO.memHiredate}">
				                       		</div>
			                        	</div>
			                        	
			                        	<div class="row p-4">
				                    		<div class="col-2">
				                        		<label for="exampleInputEmail1">부서</label>
				                        	</div>
		                        			<div class="col-7">
				                        	<input type="text" id = "deptName" name="deptName" class = "form-control" readonly="readonly" value="${memberVO.deptName}">	
				                        	</div>
			                        	</div>
			                        	
			                        	<div class="row p-4">
				                    		<div class="col-2">
				                        		<label for="exampleInputEmail1">직렬</label>
				                        	</div>
		                        			<div class="col-7">
				                        		<input type="text" id = "lName" name="lName" class = "form-control" readonly="readonly" value="${memberVO.lName}">	
				                        	</div>
			                        	</div>
			                        	
			                        	<div class="row p-4">
				                        	<div class="col-2">
				                        		<label for="exampleInputEmail1">직위</label>
				                        	</div>
		                        			<div class="col-7">
				                       			<c:if test="${0 eq memberVO.memPosition}">
													<input type="text" class="form-control" value="사용자" readonly="readonly">
												</c:if>
												<c:if test="${1 eq memberVO.memPosition}">
													<input type="text" class="form-control" value="부장" readonly="readonly">
												</c:if>
				                       		</div>
			                        	</div>
			                        	
			                        	<div class="row p-4">
				                        	<div class="col-2">
				                        		<label for="exampleInputEmail1">직책</label>
				                        	</div>
		                        			<div class="col-7">
				                       			<c:if test="${0 eq memberVO.memRes}">
													<input type="text" class="form-control" value="사용자" readonly="readonly">
												</c:if>
												<c:if test="${1 eq memberVO.memRes}">
													<input type="text" class="form-control" value="부장" readonly="readonly">
												</c:if>
				                       		</div>
			                        	</div>        	 		
			                        </div>
		                      	<div class="mt-4">
                       	 	<div class="offset-8">
		                       	<input type="button" class="btn btn-outline-primary" id = "btn_modify" onclick="location.href='./modify?memNo=${memberVO.memNo}'"name ="btn_update" value="수정">
		                    	<input type="button" class="btn btn-outline-dark" onclick="location.href='/member/list'" value="취소">
		                	</div>
                        </div>      
		                </form>
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
		console.log(formObj);
		$("#btn_delete").on("click", function() {
			remove();
			formObj.attr("action", "/member/delete");
			
		});
		
		
	});
  
  
</script>


<%@include file="../include/footer.jsp"%>