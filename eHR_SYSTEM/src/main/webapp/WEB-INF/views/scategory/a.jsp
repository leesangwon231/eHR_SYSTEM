<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Login - SB Admin</title>
        <link href="../resources/css/styles.css" rel="stylesheet" />
        <script src="jquery-3.3.1.min.js"></script>
        <script src="https://code.jquery.com/jquery-2.2.1.js"></script>
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
                                        <form>
                                            <div class="form-floating mb-3">
                                                <input class="form-control" id="inputEmail" type="email" placeholder="name@example.com" />
                                                <label for="inputEmail">Email address</label>
                                            </div>
                                            <div class="form-floating mb-3">
                                             <select name="jobGroup" id="jobGroup" onchange="selectJobGroup(value);">
                                             	<option value="0">직군을 선택해 주세요</option>
                                            		<c:forEach items="${jobGroup}" var="jobGroupVO">
														  <option value=${jobGroupVO.jgNo}>${jobGroupVO.jgName}</option>
													</c:forEach>
											</select>
											
											<select name="job" id="job" onchange="selectLcategory(value);">
                                             	<option value="0">직종을 선택해 주세요</option>	
											</select>
											
											<select name="lcategory" id="lcategory">
                                             	<option value="0">대분류를 선택해 주세요</option>	
											</select>
                                            </div>
                                            <div class="form-check mb-3">
                                                <input class="form-check-input" id="inputRememberPassword" type="checkbox" value="" />
                                                <label class="form-check-label" for="inputRememberPassword">Remember Password</label>
                                            </div>
                                            <div class="d-flex align-items-center justify-content-between mt-4 mb-0">
                                                <a class="small" href="password.html"></a>
                                                <a class="btn btn-primary" href="index.html">Login</a>
                                            </div>
                                        </form>
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
        <script src="../resources/js/scripts.js"></script>
    </body>
    
</html>
<script src="https://code.jquery.com/jquery-2.2.1.js"></script>

<script>
	function selectJobGroup(jgNo) {
	   
		var jgNo = jgNo;
	    
	   	if(jgNo === "0"){
            $("#job option").remove();
            job = "<option value='0'>직종을 선택해주세요</option>";
            $("#job").append(job);
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
				$("#job option").remove(); 
				$.each(data , function (key, value) {
					job += "<option value=" + value.jobNo + ">" + value.jobName + "</option>";
	                }); 
	                $("#job").append(job);
              
			},
			error : function(jqXHR, textStatus, errorThrown) {
				alert("ERROR : " + textStatus + " : " + errorThrown);
			}

		});
	   }        
	   
	   function selectLcategory(jobNo) {
		   
			var jobNo = jobNo;
		    
		   	if(jobNo === "0"){
	            $("#lcategory option").remove();
	            lcategory = "<option value='0'>대분류를 선택해주세요</option>";
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
					lcategory = "<option value='0'>대분류를 선택해주세요</option>"; 
					$("#lcategory option").remove(); 
					$.each(data , function (key, value) {
						lcategory += "<option value=" + value.lNo + ">" + value.lName + "</option>";
		                }); 
		                $("#lcategory").append(lcategory);
	              
				},
				error : function(jqXHR, textStatus, errorThrown) {
					alert("ERROR : " + textStatus + " : " + errorThrown);
				}

			});
		   }                                              
	

</script>
   
