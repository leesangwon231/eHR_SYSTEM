<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fmt2" uri="http://java.sun.com/jstl/fmt_rt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<%@include file="../include/header.jsp"%>
<script type="text/javascript" src="/resources/js/lcategory.js"></script>
<script src="https://code.jquery.com/jquery-2.2.1.js"></script>
<div id="layoutSidenav_content">
   <main>
	   <div class="container-fluid px-4">
	      <h1 class="mt-4" style='text-align: left; margin-bottom: 30px;'>업무일지 상세보기</h1>
				<div class="container-fluid px-5">
	                <form role="form" method="post" name="frm" action="read">    
	                    <div class="pt-5 px-5">
	                    		<input type ="hidden" id = "jnNo" name = "jnNo" value="${J.jnNo}">
			                    	<div class="row ">
			                    		<div class="col-1 text-center">
			                    			<label for="exampleInputEmail1">부서명</label>
			                    		</div>
			                    		<div class="col-3">
			                    			<input type="text" id = "dept" name="dept" class = "form-control" readonly="readonly" value="${dto.deptName}">
			                    		</div>
			                    		<div class="col-1 text-center">
			                    			<label for="exampleInputEmail1">사원번호</label>
			                    		</div>
			                    		<div class="col-3">
			                    			<input type="text" id = "memNo" name="memNo" class = "form-control" readonly="readonly" value="${dto.memNo }">
			                    		</div>
			                    		<div class="col-1 text-center">
			                    			<label for="exampleInputEmail1">사원명</label>
			                    		</div>
			                    		<div class="col-3">
			                    			<input type="text" id = "memName" name="memName" class = "form-control" readonly="readonly" value="${dto.memName}">
			                    		</div>
			                    		
  									</div>
  									<div class="row pt-5">
  										<div class="col-1 text-center">
			                    			<label for="exampleInputEmail1">근무 일자</label>
			                    		</div>
			                    		<div class="col-3">
			                    			<input type="text" id = "jnWdate" name="jnWdate" class = "form-control" readonly="readonly" value="${J.jnWdate}">
			                    		</div>
			                    		<div class="col-1 text-center">
			                    			<label for="exampleInputEmail1">직군</label>
			                    		</div>
			                    		<div class="col-3">
			                    			<input type="text" id = "jgName" name="jgName" class = "form-control" readonly="readonly" value="${dto.jgName}">
			                    		</div>
			                    		<div class="col-1 text-center">
			                    			<label for="exampleInputEmail1">직종</label>
			                    		</div>
			                    		<div class="col-3">
			                    			<input type="text" id = "jobName" name="jobName" class = "form-control" readonly="readonly" value="${dto.jobName}">
			                    		</div>
			                    		
  									</div>
  									<div class="row pt-5 ">
								            <table id="datatablesSimple" class="dataTable-table">
								               <thead>
								                  <tr>
								                    <th>시간</th>
													<th>직무</th>
													<th>진척도(%)</th>
													<th>비고</th>
								                  </tr>
								               </thead>
								               <tbody>
								              	<c:forEach items="${JD}" var="jd" varStatus="status">
								              	
								                     <tr>
								                       	<td>${time[status.index]}</td>
								                        <td>${names[status.index]}</td>
								                        <td>${jd.jndProgress} %</td>
								                        <td>${jd.jndNote}</td>
								                     </tr>
								           		</c:forEach>
								               </tbody>
								            </table>
								      </div>
								      
				          </div>	
				          
				          <c:if test="${!empty jnfileVO}">
										<div class="form-group">
											<label for="exampleInputEmail1" class="col-form-label">첨부파일</label>
										</div>

										<ul class="dropzone-previews">

											<c:forEach items="${jnfileVO}" var="jnfileVO"
												varStatus="status">
												<c:set var="jnfileName"
													value="${jnfileVO.jnfileName}" />
												<c:set var="jnfileNo"
													value="${fn:toLowerCase(jnfileName)}" />

												<li class="dropzone-previews mt-3">
													<div
														class="card mt-1 mb-0 shadow-none border dz-processing dz-image-preview dz-success dz-complete">
														<div class="p-2">
															<div class="row align-items-center">
																<c:forTokens var="token" items="${jnfileNo}"
																	delims="." varStatus="status">
																	<c:if test="${status.last}">
																		<c:choose>
																			<c:when test="${token eq 'hwp'}">
																				<img data-dz-thumbnail=""
																					class="avatar-sm rounded bg-light"
																					alt="${jnfileName}" />
																			</c:when>
																			<c:when test="${token eq 'xls' || token eq 'xlsx' }">
																				<img data-dz-thumbnail=""
																					class="avatar-sm rounded bg-light"/>
																			</c:when>
																			<c:when
																				test="${token eq 'jpg' || token eq 'gif' || token eq 'png' || token eq 'bmp' }">
																				<img data-dz-thumbnail=""
																					class="avatar-sm rounded bg-light"
																					src="/displayFile?fileName=${jnfileVO.fileLocation}">
																			</c:when>
																			<c:when test="${token eq 'pdf'}">
																				<img data-dz-thumbnail=""
																					class="avatar-sm rounded bg-light"
																					alt="${jnfileName}" />
																			</c:when>
																			<c:when test="${token eq 'ppt' }">
																				<img data-dz-thumbnail=""
																					class="avatar-sm rounded bg-light"
																					alt="${jnfileName}" />
																			</c:when>
																			<c:otherwise>
																				<img data-dz-thumbnail=""
																					class="avatar-sm rounded bg-light"
																					alt="${jnfileName}" />
																			</c:otherwise>
																		</c:choose>
																	</c:if>
																</c:forTokens>
																<div class="col pl-0">
																	<a href="/displayFile?fileName=${jnfileVO.fileLocation}" text-muted font-weight-bold data-dz-name="">
																		${jnfileVO.jnfileName}</a>
																</div>
															</div>
														</div>
													</div>
												</li>
											</c:forEach>
										</ul>
									</c:if>
									<c:if test="${empty jnfileVO}">
									</c:if>
	                        <div class="mt-4">
	                       	 	<div class="offset-9" style="position: absolute; right: 6%;">
			                       	<input type="button" class="btn btn-outline-primary" onclick="location.href='/journal/modify?jnNo=${J.jnNo}'" value="수정">
			                    	<input type="button" class="btn btn-outline-dark" onclick="location.href='/journal/list'" value="취소">
			                	</div>
	                        </div>
	                  </form>        
               		</div>
           	 	</div>              
			</main>
	   	</div>
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
$(".btn-success").on("click", function() {
	formObj.attr("action", "/notice/modify");
	formObj.attr("method", "get");
	formObj.submit();
});
	
	function checkImageType(fileName) {

		var pattern = /jpg|gif|png|jpeg/i;

		return jnfileName.match(pattern);

	}
</script>




<%@include file="../include/footer.jsp"%>