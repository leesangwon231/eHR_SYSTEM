<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@include file="../include/header.jsp"%>

<div id="layoutSidenav_content">
   <main>
	   <div class="container-fluid px-4">
	      <h1 class="mt-4" style='text-align: center; margin-bottom: 30px;'>직군</h1>
	
	      <div class="card mb-4">
	         <div class="card-header">
	            <i class="bi bi-megaphone"></i> 직군 목록
	            	<button class="btn btn-outline-dark btn-sm" id="newBtn" style="float: right; padding: 0 auto 0 auto;">새 게시글 작성</button>
	         </div>
	         <div class="card-body">
	         <c:if test="${empty list}">
				<table id="datatablesSimple" class="dataTable-table">
					<thead>
						<tr>
							<th style="text-align: center;">등록된 게시글이 없습니다.</th>
						</tr>
					</thead>
				</table>
			</c:if>
			<c:if test="${!empty list}">
	            <table id="datatablesSimple">
	               <thead>
	                  <tr>
	                     <th style="width: 10px">직군번호</th>
	                     <th>직군명</th>
	                     
	                  </tr>
	               </thead>
	               <tbody>
	                  <c:forEach items="${list}" var="jobgroupVO" varStatus="status">
	                     <tr>
	                        <td><a href='/jobgroup/read?jgNo=${jobgroupVO.jgNo}'>${jobgroupVO.jgNo}</a></td>
	                        <td>${jobgroupVO.jgName}</td>
	                        
	                     </tr>
	                  </c:forEach>
	               </tbody>
	            </table>
	           </c:if>
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
  

</script>

<script>
	$(document).ready(function() {
		$('#newBtn').on("click", function(evt) {
			self.location = "register";
		});
	});
</script>

<%@include file="../include/footer.jsp"%>