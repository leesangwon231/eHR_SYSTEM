<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@include file="../include/header.jsp"%>

<div id="layoutSidenav_content">
   <main>
	   <div class="container-fluid px-4">
	      <h1 class="mt-4" style='text-align: left; margin-bottom: 30px;'>대분류 등록</h1>
			<div class="container-fluid px-4">
	                    <div class="pt-5">
	                        <div class="row" >
		                        <div class="col-lg-1">
									</div>
		                        		<div class="col-lg-10">
		                        			<div class="form-group">
                        						<label for="exampleInputEmail1">닉네임:</label>
                        						<textarea class="form-control" name="content" id="content"
									rows="3" placeholder="Enter ..."></textarea>
                     						</div>
		                        		</div>
		                        		<div class="col-lg-1" >
		                        		</div>
	                            	</div>
	                        	</div>
                        		<div class="mt-4">
                        			<div class="row">
                        				<div class="col-lg-4" >
		                        		</div>
		                        		<div class="col-lg-4" >
		                        		
		                        		</div>
		                        		<div class="col-lg-4" >
		                        	
		                        			<div >
		                        				<input type="button" class="end-95" value="등록"></div>
		                        				<input type="button" class="end-100" value="취소"></div>
		                        			</div>
		                        		</div>
                        			</div>
                        		<div>
                        	</div>
                		</div>
                	</div>               
	     
	   </div>
	</main>

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
		$('#newBtn').on("click", function(evt) {
			self.location = "register";
		});
	});
</script>

<%@include file="../include/footer.jsp"%>