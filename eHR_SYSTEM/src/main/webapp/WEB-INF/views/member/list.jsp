<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@include file="../include/header.jsp"%>

<div id="layoutSidenav_content">
	<main>
	<div class="container-fluid px-4">
		<h1 class="mt-4" style='text-align: center; margin-bottom: 30px;'>사원</h1>

		<div class="card mb-4">
			<div class="card-header">
				<i class="bi bi-megaphone"></i> 사원 목록
				<button class="btn btn-outline-dark btn-sm" id="newBtn"
					style="float: right; padding: 0 auto 0 auto;">사원 등록</button>
			</div>
			<div class="card-body">
				<c:if test="${empty list}">
					<table id="datatablesSimple" class="dataTable-table">
						<thead>
							<tr>
								<th style="text-align: center;">등록된 직원이 없습니다</th>
							</tr>
						</thead>
					</table>
				</c:if>
				<c:if test="${!empty list}">
					<table id="datatablesSimple">
						<thead>
							<tr>
								<th style="width: 10px">사원번호</th>
								<th>사원명</th>
								<th>부서</th>
								<th>직렬</th>
								<th>직위</th>
								<th>직책</th>
								<th>입사일자</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${list}" var="MemberVO" varStatus="status">
								<tr>
									<td><a href='/member/read?memNo=${MemberVO.memNo}'>${MemberVO.memNo}</a></td>
									<td>${MemberVO.memName}</td>
									<td>${MemberVO.deptName}</td>
									<td>${MemberVO.lName}</td>
									<%--  <td>${MemberVO.memPosition}</td> --%>
									<td><c:if test="${0 eq MemberVO.memPosition}">
										사용자
									</c:if> <c:if test="${1 eq MemberVO.memPosition}">
										부장
									</c:if></td>
									<%-- <td>${MemberVO.memRes}</td> --%>
									<td><c:if test="${0 eq MemberVO.memRes}">
										사용자
									</c:if> <c:if test="${1 eq MemberVO.memRes}">
										부장
									</c:if></td>
									<td>${MemberVO.memHiredate}</td>
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

		$(document).ready(function() {
			$('#newBtn').on("click", function(evt) {
				self.location = "register";
			});
		});
	</script>

	<%@include file="../include/footer.jsp"%>