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
		<h1 class="mt-4" style='text-align: left; margin-bottom: 30px;'>직무
			등록</h1>
		<div class="container-fluid px-5">
			<div class="pt-5">
				<div class="row">
					<div class="col-lg-1"></div>
					<form role="form" method="post" name="frm">
					<input type="hidden" id="sNo" name="sNo" value="1">
						<div class="col-lg-10">
							<div class="row p-4">
								<div class="col-2">
									<label for="exampleInputEmail1">직군</label>
								</div>
								<div class="col-8">
									<select name="jgName" id="jgName" class="form-select"
										onchange="selectJobGroup(value);">
										<option value="0">직군을 선택해 주세요</option>
										<c:forEach items="${jobGroup}" var="jobGroupVO">
											<option value=${jobGroupVO.jgNo}>${jobGroupVO.jgName}</option>
										</c:forEach>
									</select>
								</div>
							</div>
							<div class="row p-4">
								<div class="col-2">
									<label for="exampleInputEmail1">직종</label>
								</div>
								<div class="col-8">
									<select name="jobName" id="jobName" class="form-select"
										onchange="selectLcategory(value)">
										<option value="0">직종을 선택해 주세요</option>
									</select>
								</div>
							</div>
							<div class="row p-4">
								<div class="col-2">
									<label for="exampleInputEmail1">직렬</label>
								</div>
								<div class="col-8">
									<select name="lNo" id="lNo" class="form-select">
										<option value="0">직렬을 선택해 주세요</option>
									</select>
								</div>
							</div>

							<div class="row p-4">
								<div class="col-2">
									<label for="exampleInputEmail1">직무 번호</label>
								</div>
								<div class="col-8">
									<input type="text" id="sNo" name="sNo" class="form-control"
										readonly="readonly" placeholder = "직무 번호는 자동으로 부여됩니다">
								</div>
							</div>
							<div class="row p-4">
								<div class="col-2">
									<label for="exampleInputEmail1">직무 명</label>
								</div>
								<div class="col-8">
									<input type="text" id="sName" name="sName" class="form-control">
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
									<input type="text" id="sYear" name="sYear" class="form-control">
								</div>

								<div class="col-1">
									<label for="exampleInputEmail1">월</label>
								</div>

								<div class="col-3">
									<input type="text" id="sMonth" name="sMonth"
										class="form-control">
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
										class="form-control">
								</div>

								<div class="col-1">
									<label for="exampleInputEmail1">일</label>
								</div>

								<div class="col-3">
									<input type="text" id="sDay" name="sDay" class="form-control">
								</div>
							</div>

							<!-- <div class="row p-5">
				                        	<div class="col-2">
				                        		<label for="exampleInputEmail1">연</label>
				                        	</div>
		                        			<div class="col-3">
				                       			<input type="text" id = "sYear" name="sYear" class = "form-select" >
				                       		</div>
				                       		<div class="col-2">
				                        		<label for="exampleInputEmail1">월</label>
				                        	</div>
		                        			<div class="col-3">
				                       			<input type="text" id = "sMonth" name="sMonth" class = "form-select">
				                       		</div>
			                        	</div>
			                        	<div class="row p-5">
				                        	<div class="col-2">
				                        		<label for="exampleInputEmail1">분기</label>
				                        	</div>
		                        			<div class="col-3">
				                       			<input type="text" id = "sQuarter" name="sQuarter" class = "form-select" >
				                       		</div>
				                       		<div class="col-2">
				                        		<label for="exampleInputEmail1">일</label>
				                        	</div>
		                        			<div class="col-3">
				                       			<input type="text" id = "sDay" name="sDay" class = "form-select" >
				                       		</div>
			                        	</div> -->
						</div>
					</form>
					<div class="col-lg-1"></div>
				</div>
			</div>
			<div class="mt-4">
				<div class="offset-9">
					<input type="button" class="btn btn-outline-primary"
						id="btn_submit" name="btn_submit" value="등록"> <input
						type="button" class="btn btn-outline-dark"
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
		$("#btn_submit").on("click", function() {
			register();
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
			lcategory = "<option value='0'>직렬을 선택해주세요</option>";
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
				lcategory = "<option value='0'>직렬을 선택해주세요</option>";
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