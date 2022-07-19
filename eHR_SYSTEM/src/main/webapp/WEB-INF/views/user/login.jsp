<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<script type="text/javascript" src="/resources/js/lcategory.js"></script>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Login - SB Admin</title>
        <link href="../resources/css/styles.css" rel="stylesheet" />
        <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/js/all.min.js" crossorigin="anonymous"></script>
    </head>
    <body class="bg-primary">
        <div id="layoutAuthentication">
            <div id="layoutAuthentication_content">
                <main>
                    <div class="container">
                        <div class="row justify-content-center">
                            <div class="col-lg-5">
                                <div class="card shadow-lg border-0 rounded-lg mt-5">
                                    <div class="card-header"><h3 class="text-center font-weight-light my-4">Login</h3></div>
                                    <div class="card-body">
                                        <form role="form" method="post" name="frm" action="/user/loginPost" >
                                            <div class="form-floating mb-3">
                                                <input class="form-control" id="memNo" name="memNo" type="text" placeholder="사원번호를 입력하세요" />
                                                <label for="inputEmail">사원번호</label>
                                            </div>
                                            <div class="form-floating mb-3">
                                                <input class="form-control" id="memPw" name="memPw" type="password" placeholder="비밀번호를 입력하세요" />
                                                <label for="inputPassword">비밀번호</label>
                                            </div>
                                            <div class="form-check mb-3">
                                            </div>
                                            
                                        </form>
                                        <div class="d-flex align-items-center justify-content-between mt-4 mb-0">
                                               <input type="button" class="btn btn-primary" id = "btn_submit" name ="btn_submit" value="로그인"/>
                                            </div>
                                    </div>
                                    <div class="card-footer text-center py-3">
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </main>
            </div>
            <div id="layoutAuthentication_footer">
                <footer class="py-4 bg-light mt-auto">
                    <div class="container-fluid px-4">
                        <div class="d-flex align-items-center justify-content-between small">
                            <div class="text-muted">Copyright &copy; Your Website 2021</div>
                            <div>
                                <a href="#">Privacy Policy</a>
                                &middot;
                                <a href="#">Terms &amp; Conditions</a>
                            </div>
                        </div>
                    </div>
                </footer>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
        <script type="text/javascript" src="/resources/js/scripts.js"></script>
    </body>
</html>
<script src="https://code.jquery.com/jquery-2.2.1.js"></script>
<script>
	$(document).ready(function() {
		var formObj = $("form[role='form']");
		
		$("#btn_submit").on("click", function() {
			formObj.submit();
		});
	});
</script>