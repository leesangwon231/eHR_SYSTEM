<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@include file="../include/header.jsp"%>
<script type="text/javascript" src="/resources/js/scategory.js"></script>
<script src="https://code.jquery.com/jquery-2.2.1.js"></script>
<div id="layoutSidenav_content">
	<main>
	<div class="container-fluid px-4">
		<h1 class="mt-4" style='text-align: left; margin-bottom: 30px;'>소분류
			상세보기</h1>
		<div class="container-fluid px-5">
			<div class="pt-5">
				<div class="row">
					<div class="col-lg-1"></div>
					<form role="form" method="post" name="frm" action="delete">
						<div class="col-lg-10">
							<div class="row p-4">
								<div class="col-2">
									<label for="exampleInputEmail1">직군</label>
								</div>
								<div class="col-8">
									<input type="text" id="jgName" name="jgName"
										class="form-select" readonly="readonly"
										value="${scategoryVO.jgName}">
								</div>
							</div>
							<div class="row p-4">
								<div class="col-2">
									<label for="exampleInputEmail1">직종</label>
								</div>
								<div class="col-8">
									<input type="text" id="jobName" name="jobName"
										class="form-select" readonly="readonly"
										value="${scategoryVO.jobName}">
								</div>
							</div>
							<div class="row p-4">
								<div class="col-2">
									<label for="exampleInputEmail1">대분류 </label>
								</div>
								<div class="col-8">
									<input type="text" id="lName" name="lName" class="form-select"
										readonly="readonly" value="${scategoryVO.lName}">
								</div>
							</div>
							<div class="row p-4">
								<div class="col-2">
									<label for="exampleInputEmail1">소분류 번호</label>
								</div>
								<div class="col-8">
									<input type="text" id="sNo" name="sNo" class="form-select"
										readonly="readonly" value="${scategoryVO.sNo}">
								</div>
							</div>
							<div class="row p-4">
								<div class="col-2">
									<label for="exampleInputEmail1">소분류명</label>
								</div>
								<div class="col-8">
									<input type="text" id="sName" name="sName" class="form-control"
										readonly="readonly" value="${scategoryVO.sName}">
								</div>
							</div>
							<br>
							
							<div class="row p-4">
								<div class="col-2">
									<label for="exampleInputEmail1">발생주기</label>
								</div>
								
								<div class="col-1">
									<label for="exampleInputEmail1">연</label>
								</div>
								
								<div class="col-3">
									<input type="text" id="sYear" name="sYear" class="form-control"
										readonly="readonly" value="${scategoryVO.sYear}">
								</div>
								
								<div class="col-1">
									<label for="exampleInputEmail1">월</label>
								</div>
								
								<div class="col-3">
									<input type="text" id="sMonth" name="sMonth"
										class="form-control" readonly="readonly"
										value="${scategoryVO.sMonth}">
								</div> 
							</div>
						
								<div class="row p-4">
									<div class="col-2">
									<label for="exampleInputEmail1"></label>
									</div>
								
									<div class="col-1">
									<label for="exampleInputEmail1">분기</label>
									</div>
								
									<div class="col-3">
										<input type="text" id="sQuarter" name="sQuarter"
											class="form-control" readonly="readonly"
											value="${scategoryVO.sQuarter}">
									</div>

									<div class="col-1">
										<label for="exampleInputEmail1">일</label>
									</div>
									
									<div class="col-3">
										<input type="text" id="sDay" name="sDay" class="form-control"
											readonly="readonly" value="${scategoryVO.sDay}">
									</div>
								</div>	
						
								
					
							
							
							
							
							
							

							<%-- <div class="row p-5"> 
				                        	<div class="col-1">
				                        		<label for="exampleInputEmail1">연</label>
				                        	</div>
		                        			<div class="col-2">
				                       			<input type="text" id = "sYear" name="sYear" class = "form-control" readonly="readonly" value="${scategoryVO.sYear}">
				                       		</div>
				                       		<div class="col-1">
				                        		<label for="exampleInputEmail1">월</label>
				                        	</div>
		                        			<div class="col-2">
				                       			<input type="text" id = "sMonth" name="sMonth" class = "form-control" readonly="readonly" value="${scategoryVO.sMonth}">
				                       		</div>
				                       		
			                        	</div> --%>


							<%-- <div class="row p-5">
				                        	<div class="col-1">
				                        		<label for="exampleInputEmail1">분기</label>
				                        	</div>
		                        			<div class="col-2">
				                       			<input type="text" id = "sQuarter" name="sQuarter" class = "form-control" readonly="readonly" value="${scategoryVO.sQuarter}">
				                       		</div>
				                       	
				                        	<div class="col-1">
				                        		<label for="exampleInputEmail1">일</label>
				                        	</div>
		                        			<div class="col-2">
				                       			<input type="text" id = "sDay" name="sDay" class = "form-control" readonly="readonly" value="${scategoryVO.sDay}">
				                       		</div>
			                        	</div> --%>


						</div>
					</form>
					<div class="col-lg-1"></div>
				</div>
			</div>
			<div class="mt-4">
				<div class="offset-9">
					<!-- <input type="button" class="btn btn-outline-danger" id = "btn_delete"  name ="btn_delete" value="삭제"> -->
					<input type="button" class="btn btn-outline-primary"
						id="btn_modify"
						onclick="location.href='./modify?sNo=${scategoryVO.sNo}'"
						name="btn_update" value="수정"> <input type="button"
						class="btn btn-outline-dark"
						onclick="location.href='/scategory/list'" value="취소">
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
			remove();
			formObj.attr("action", "/scategory/delete");

		});

	});
</script>

<script>
	function selectJobGroup(jgNo) {

		var jgNo = jgNo;

		if (jgNo === "0") {
			$("#jobName option").remove();
			job = "<option value='0'>직종을 선택해주세요</option>";
			$("#jobName").append(job);
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
				$("#jobName option").remove();
				$.each(data, function(key, value) {
					job += "<option value=" + value.jobNo + ">" + value.jobName
							+ "</option>";
				});
				$("#jobName").append(job);

			},
			error : function(jqXHR, textStatus, errorThrown) {
				alert("ERROR : " + textStatus + " : " + errorThrown);
			}

		});
	}

	function selectLcategory(jobNo) {

		var jobNo = jobNo;

		if (jobNo === "0") {
			$("#lNo option").remove();
			lcategory = "<option value='0'>대분류를 선택해주세요</option>";
			$("#lNo").append(lcategory);
			return false;
		}

		$.ajax({
			type : 'GET',
			url : "/scategory/lcList",
			data : {
				jobNo : jobNo,
			},
			success : function(data) {
				lcategory = "<option value='0'>대분류를 선택해주세요</option>";
				$("#lNo option").remove();
				$.each(data, function(key, value) {
					lcategory += "<option value=" + value.lNo + ">"
							+ value.lName + "</option>";
				});
				$("#lNo").append(lcategory);

			},
			error : function(jqXHR, textStatus, errorThrown) {
				alert("ERROR : " + textStatus + " : " + errorThrown);
			}

		});
	}
</script>


<%@include file="../include/footer.jsp"%>