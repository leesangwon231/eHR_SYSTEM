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
			수정</h1>
		<div class="container-fluid px-5">
			<div class="pt-5">
				<div class="row">
					<div class="col-lg-1"></div>
					<form role="form" method="post" name="frm" action="modify">
						<div class="col-lg-10">
							<div class="row p-4">
								<div class="col-2">
									<label for="exampleInputEmail1">직군</label>
								</div>
								<div class="col-8">
									<select name="jgNo" id="jgNo" class="form-select"
										onchange="selectJobGroup(value);">
										<option value="0">직군을 선택해 주세요</option>
										<c:forEach items="${jobGroup}" var="jobGroupVO">
											<option value="${jobGroupVO.jgNo}"
												<c:if test ="${jobGroupVO.jgNo == sVo.jgNo}">selected="selected"</c:if>>${jobGroupVO.jgName}</option>
										</c:forEach>
									</select>
								</div>
							</div>
							<div class="row p-4">
								<div class="col-2">
									<label for="exampleInputEmail1">직종</label>
								</div>
								<div class="col-8">
									<select name="jobNo" id="jobNo" class="form-select"
										onchange="selectLcategory(value);">
										<option value="0">직종을 선택해 주세요</option>
									</select>
								</div>
							</div>
							<div class="row p-4">
								<div class="col-2">
									<label for="exampleInputEmail1">직렬 </label>
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
									<input type="text" id="sNo" name="sNo" class = "form-control"
										value="${sVo.sNo}" readonly="readonly">
								</div>
							</div>
							<div class="row p-4">
								<div class="col-2">
									<label for="exampleInputEmail1">직무명</label>
								</div>
								<div class="col-8">
									<input type="text" id="sName" name="sName" class = "form-control"
										value="${sVo.sName}">
								</div>
							</div>
							<div class="row p-4">
								<div class="col-2">
									<label for="exampleInputEmail1">발생주기</label>
								</div>
								<div class="col-1">
									<label for="exampleInputEmail1">연</label>
								</div>
								<div class="col-3">
									<input type="text" id="sYear" name="sYear" class = "form-control"
										value="${sVo.sYear}">
								</div>
								<div class="col-1">
									<label for="exampleInputEmail1">월</label>
								</div>
								<div class="col-3">
									<input type="text" id="sMonth" name="sMonth"
										class = "form-control" value="${sVo.sMonth}">
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
										class = "form-control" value="${sVo.sQuarter}">
								</div>

								<div class="col-1">
									<label for="exampleInputEmail1">일</label>
								</div>
								<div class="col-3">
									<input type="text" id="sDay" name="sDay" class = "form-control"
										value="${sVo.sDay}">
								</div>
							</div>


						</div>
					</form>
					<div class="col-lg-1"></div>
				</div>
			</div>
			<div class="mt-4">
				<div class="offset-9">
					<input type="button" class="btn btn-outline-primary"
						id="btn_submit" name="btn_submit" value="저장"> <input
						type="button" class="btn btn-outline-dark"
						onclick="location.href='./read?sNo=${sVo.sNo}'" value="취소">
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
	$(document)
			.ready(
					function() {
						var formObj = $("form[role='form']");
						var jgNo = "<c:out value ='${sVo.jgNo}'/>"
						var jobNo = "<c:out value ='${sVo.jobNo}'/>"
						var lNo = "<c:out value ='${sVo.lNo}'/>"
						console.log(jobNo);
						$("#btn_submit").on("click", function() {
							modify();
						});

						if (jgNo === "0") {
							$("#jobNo option").remove();
							job = "<option value='0'>직종을 선택해주세요</option>";
							$("#jobNo").append(job);
							return false;
						}

						$
								.ajax({
									type : 'GET',
									url : "/scategory/jobList",
									data : {
										jgNo : jgNo,
									},
									success : function(data) {
										job = "<option value='0'>직종을 선택해주세요</option>";
										$("#jobNo option").remove();
										$
												.each(
														data,
														function(key, value) {
															test = (jobNo == value.jobNo);
															if (test) {
																job += "<option value=" + value.jobNo + " selected='selected'>"
																		+ value.jobName
																		+ "</option>";
															} else {
																job += "<option value=" + value.jobNo + ">"
																		+ value.jobName
																		+ "</option>";
															}
														});
										$("#jobNo").append(job);
									},
									error : function(jqXHR, textStatus,
											errorThrown) {
										alert("ERROR : " + textStatus + " : "
												+ errorThrown);
									}

								});

						if (jobNo === "0") {
							$("#lNo option").remove();
							lcategory = "<option value='0'>직렬을 선택해주세요</option>";
							$("#lNo").append(lcategory);
							return false;
						}

						$
								.ajax({
									type : 'GET',
									url : "/scategory/lcList",
									data : {
										jobNo : jobNo,
									},
									success : function(data) {
										lcategory = "<option value='0'>직렬을 선택해주세요</option>";
										$("#lNo option").remove();
										$
												.each(
														data,
														function(key, value) {
															test = (lNo == value.lNo);
															if (test) {
																lcategory += "<option value=" + value.lNo + " selected='selected'>"
																		+ value.lName
																		+ "</option>";
															} else {
																lcategory += "<option value=" + value.lNo + ">"
																		+ value.lName
																		+ "</option>";
															}
														});
										$("#lNo").append(lcategory);

									},
									error : function(jqXHR, textStatus,
											errorThrown) {
										alert("ERROR : " + textStatus + " : "
												+ errorThrown);
									}

								});

					});
</script>



<script>
	function selectJobGroup(jgNo) {

		var jgNo = jgNo;
		var jobNo = "<c:out value ='${sVo.jobNo}'/>"

		if (jgNo === "0") {
			$("#jobNo option").remove();
			job = "<option value='0'>직종을 선택해주세요</option>";
			$("#jobNo").append(job);
			return false;
		}

		$.ajax({
			type : 'GET',
			url : "/scategory/jobList",
			data : {
				jgNo : jgNo,
			},
			success : function(data) {
				job = "<option value='0'>직종을 선택해주세요</option>";
				$("#jobNo option").remove();
				$.each(data, function(key, value) {
					job += "<option value=" + value.jobNo + ">" + value.jobName
							+ "</option>";
				});
				$("#jobNo").append(job);

			},
			error : function(jqXHR, textStatus, errorThrown) {
				alert("ERROR : " + textStatus + " : " + errorThrown);
			}

		});
	}

	function selectLcategory(jobNo) {

		var jobNo = jobNo;

		if (jobNo === "0") {
			$("#lcategory option").remove();
			lcategory = "<option value='0'>직렬을 선택해주세요</option>";
			$("#lcategory").append(lcategory);
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