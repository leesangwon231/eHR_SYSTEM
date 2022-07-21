<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@include file="../include/header.jsp"%>
<script type="text/javascript" src="/resources/js/member.js"></script>
<script src="https://code.jquery.com/jquery-2.2.1.js"></script>
<div id="layoutSidenav_content">
   <main>
	   <div class="container-fluid px-4">
	      <h1 class="mt-4" style='text-align: left; margin-bottom: 30px;'>사원 등록</h1>
				<div class="container-fluid px-5">
	                    <div class="pt-5">
	                        <div class="row" >
		                        <div class="col-lg-1">
								</div>
								<form role="form" method="post" name="frm" >
			                        <div class="col-lg-10">
			                        	<div class="row p-4">
				                        	<div class="col-2">
				                        		<label for="exampleInputEmail1">사원 번호</label>
				                        	</div>
		                        			<div class="col-7">
				                        		<input type="text" id = "memNo" name="memNo" class = "form-control" readonly="readonly" value= 1>
				                 			</div>
			                        	</div>
			                        	
			                        	<div class="row p-4">
				                        	<div class="col-2">
				                        		<label for="exampleInputEmail1">사원명</label>
				                        	</div>
		                        			<div class="col-7">
				                       			<input type="text" id = "memName" name="memName" class = "form-control">
				                       		</div>
			                        	</div>
			                        	
			                        	<div class="row p-4">
				                        	<div class="col-2">
				                        		<label for="exampleInputEmail1">비밀번호</label>
				                        	</div>
		                        			<div class="col-7">
				                       			<input type="password" id = "memPw" name="memPw" class = "form-control" maxlength="20">
				                       		</div>
			                        	</div>
			                        	
			                        	<div class="row p-4">
				                        	<div class="col-2">
				                        		<label for="exampleInputEmail1">비밀번호 확인</label>
				                        	</div>
		                        			<div class="col-7">
				                       			<input type="password" id = "memPwfm" name="memPwfm" class = "form-control" maxlength="20">
				                       		</div>
			                        	</div>
			                        	
			                        	<div class="row p-4">
				                        	<div class="col-2">
				                        		<label for="exampleInputEmail1">이메일</label>
				                        	</div>
		                        			<div class="col-7">
				                       			<input type="text" id = "memEmail" name="memEmail" class = "form-control">
				                       		</div>
			                        	</div>
			                        	
			                        	<div class="row p-4">
				                        	<div class="col-2">
				                        		<label for="exampleInputEmail1">우편번호</label>
				                        	</div>
		                        			<div class="col-7">
				                       			<input type="text" id="memZipcode" name="memZipcode" class = "form-control" readonly="readonly">
				                       		</div>
				                       		<div class="col-1">
				                        		<input type="button" class="btn btn-primary" onclick="sample6_execDaumPostcode()" value="우편번호 찾기">
				                        	</div>
				                    	</div>  
				                    	
				                    	<div class="row p-4">
				                        	<div class="col-2">
				                        		<label for="exampleInputEmail1">주소</label>
				                        	</div>
		                        			<div class="col-7">
				                       			<input type="text" id="memAddr1" name="memAddr1" class = "form-control" readonly="readonly">
				                       		</div>
			                        	</div>
			                        	
			                        	<div class="row p-4">
				                        	<div class="col-2">
				                        		<label for="exampleInputEmail1">상세주소</label>
				                        	</div>
		                        			<div class="col-7">
				                       			<input type="text" id = "memAddr2" name="memAddr2" class = "form-control">
				                       		</div>
			                        	</div>
			                        	
			                        	<div class="row p-4">
				                        	<div class="col-2">
				                        		<label for="exampleInputEmail1">입사일자</label>
				                        	</div>
		                        			<div class="col-7">
				                       			<input type="date" id = "memHiredate" name="memHiredate">
				                       		</div>
			                        	</div>
			                        	
			                        	<div class="row p-4">
				                    		<div class="col-2">
				                        		<label for="exampleInputEmail1">부서</label>
				                        	</div>
		                        			<div class="col-7">
				                        		<select name="deptNo" id="deptNo" class = "form-select" onchange="selectDept(value);">
			                                    	<option value="0">부서를 선택해 주세요</option>
			                                        <c:forEach items="${Dept}" var="DeptVO">
														<option value=${DeptVO.deptNo}>${DeptVO.deptName}</option>
													</c:forEach>
												</select>
				                        	</div>
			                        	</div>
			                        	
			                        	<div class="row p-4">
				                    		<div class="col-2">
				                        		<label for="exampleInputEmail1">직군</label>
				                        	</div>
		                        			<div class="col-7">
				                        		<select name="jgNo" id="jgNo" class = "form-select" onchange="selectJobGroup(value);">
			                                    	<option value="0">직군을 선택해 주세요</option>
			                                        <c:forEach items="${jobGroup}" var="JobgroupVO">
														<option value=${JobgroupVO.jgNo}>${JobgroupVO.jgName}</option>
													</c:forEach>
												</select>
				                        	</div>
			                        	</div>
			                        	
			                        	<div class="row p-4">
				                        	<div class="col-2">
				                        		<label for="exampleInputEmail1">직위</label>
				                        	</div>
		                        			<div class="col-7">
				                       			<input type="text" id = "memPosition" name="memPosition" class = "form-control">
				                       		</div>
			                        	</div>
			                        	
			                        	<div class="row p-4">
				                        	<div class="col-2">
				                        		<label for="exampleInputEmail1">직책</label>
				                        	</div>
		                        			<div class="col-7">
				                       			<input type="text" id = "memRes" name="memRes" class = "form-control">
				                       		</div>
			                        	</div>        	 		
			                        </div>
			                    <div class="offset-7">
		                     		<input type="button" class="btn btn-primary" id = "btn_submit" name ="btn_submit" value="등록">
		                    		<input type="button" class="btn btn-primary" onclick="location.href='/member/list'" value="취소">
		                		</div>
			               	</form>
	                   	</div>
	                </div>
                 </div>
           	 </div>              
	   	</div>
	</main>
<script src="https://code.jquery.com/jquery-2.2.1.js"></script>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>

<script>
	$(document).ready(function() {
		var formObj = $("form[role='form']");
		console.log(formObj);
		$("#btn_submit").on("click", function() {
			register();
		});
	});
	
	function sample6_execDaumPostcode() {
        new daum.Postcode({
            oncomplete: function(data) {
               
                var addr = ''; 

                if (data.userSelectedType === 'R') { 
                    addr = data.roadAddress;
                } else { 
                    addr = data.jibunAddress;
                }

                document.getElementById('memZipcode').value = data.zonecode;
                document.getElementById("memAddr1").value = addr;
                document.getElementById("memAddr2").focus();
            }
        }).open();
    }
</script>

<%@include file="../include/footer.jsp"%>