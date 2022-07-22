<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@include file="../include/header.jsp"%>
<!-- <script type="text/javascript" src="/resources/js/journal.js"></script> -->
<script src="https://code.jquery.com/jquery-2.2.1.js"></script>
<div id="layoutSidenav_content">
   <main>
	   <div class="container-fluid px-4">
	      <h1 class="mt-4" style='text-align: left; margin-bottom: 30px;'>업무일지 등록</h1>
				<div class="container-fluid px-5">
	                <form role="form" method="post" name="frm">
	                	 
	                    <div class="pt-5 px-5">
			                    	<div class="row ">
			                    		<div class="col-1 text-center">
			                    			<label for="exampleInputEmail1">사원번호</label>
			                    		</div>
			                    		<div class="col-3">
			                    			<input type="text" id = "memNo" name="memNo" class = "form-control" readonly="readonly" value="${login.memNo}">
			                    		</div>
			                    		<div class="col-1 text-center">
			                    			<label for="exampleInputEmail1">사원명</label>
			                    		</div>
			                    		<div class="col-3"> 
			                    			<input type="text" id = "memName" name="memName" class = "form-control" readonly="readonly" value="${jDto.memName}">
			                    		</div>
			                    		<div class="col-1 text-center">
			                    			<label for="exampleInputEmail1">근무 일자</label>
			                    		</div>
			                    		<div class="col-3">
			                    			<input type="date" id = "jnWdate" name="jnWdate" class = "form-control">
			                    		</div>
  									</div>
  									<div class="row pt-5">
			                    		<div class="col-1 text-center">
			                    			<label for="exampleInputEmail1">직군</label>
			                    		</div>
			                    		<div class="col-3">
			                    			<input type="text" id = "jgName" name="jgName" class = "form-control" readonly="readonly" value="${jDto.jgName}">
			                    		</div>
			                    		<div class="col-1 text-center">
			                    			<label for="exampleInputEmail1">직종</label>
			                    		</div>
			                    		<div class="col-3">
			                    			<input type="text" id = "jobName" name="jobName" class = "form-control" readonly="readonly" value="${jDto.jobName}">
			                    		</div>
			                    		<div class="col-1 text-center">
			                    			<label for="exampleInputEmail1"></label>
			                    		</div>
			                    		<div class="col-3">
			                    			
			                    		</div>
  									</div>
  								 </div>	
  									<%-- <div class="row pt-5">
  										<c:forEach items="${sList}" var="sVo" varStatus="status">
		                     				<input type = "hidden" name = "sNo" id ="sNo" value= "${sVo.sNo}">
		                     				<tr>
						                        
						                        <td>할일 => ${sVo.sName}</td>
						                        
						                     </tr>
	                 					 </c:forEach>
  									</div> --%>
  									<div class="row pt-5 ">
								            <table id="datatablesSimple" class="dataTable-table">
								               <thead>
								                  <tr>
								                     <th>업무내용</th>
								                     <th>진척도</th>
								                     <th>비고</th>
								                  </tr>
								               </thead>
								               <tbody>
								              	<c:forEach items="${sList}" var="sVo" varStatus="status">
		                     					<input type = "hidden" name = "jnLIst[${status.index}].sNo" id ="sNo" value= "${sVo.sNo}">
								                     <tr>
								                        <td>${sVo.sName}</td>
								                        <td><input type="text" id="jndProgress" name="<c:url value='jnLIst[${status.index}].'/>jndProgress" class="form-control"></td>
								                        <td><input type="text" id="jndNote" name="<c:url value='jnLIst[${status.index}].'/>jndNote" class="form-control"></td>
								                        <!-- <td><input type="text" id="jndProgress" name="jndProgress" class="form-control"></td>
								                        <td><input type="text" id="jndNote" name="jndNote" class="form-control"></td> -->
								                     </tr>
								           		</c:forEach>
								               </tbody>
								            </table>

								         </div>
	                        <div class="mt-4">
	                       	 	<div class="offset-9" align="right">
			                       	<input type="button" class="btn btn-primary" id = "btn_submit" name ="btn_submit" value="등록">
			                    	<input type="button" class="btn btn-primary" onclick="location.href='/journal/list'" value="취소">
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
			/* register(); */
			document.frm.submit();
		});
	});
</script>




<%@include file="../include/footer.jsp"%>