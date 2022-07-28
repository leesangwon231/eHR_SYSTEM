<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<script type="text/javascript" src="/resources/js/journal.js"></script>
<script src="https://code.jquery.com/jquery-2.2.1.js"></script>
<%@include file="../include/header.jsp"%>  
<!-- <script type="text/javascript" src="/resources/js/journal.js"></script> -->
<div id="layoutSidenav_content">
   <main>
   <div class="container-fluid px-4">
      <h1 class="mt-4" style='text-align: left; margin-bottom: 30px;'>업무일지
         등록</h1>
      <div class="container-fluid px-5">
         <form role="form" method="post" name="frm" action="register">

            <div class="pt-5 px-5">
               <div class="row ">
                  <div class="col-1 text-center">
                     <label for="exampleInputEmail1">사원번호</label>
                  </div>
                  <div class="col-3">
                     <input type="text" id="memNo" name="memNo" class="form-control"
                        readonly="readonly" value="${login.memNo}">
                  </div>
                  <div class="col-1 text-center">
                     <label for="exampleInputEmail1">사원명</label>
                  </div>
                  <div class="col-3">
                     <input type="text" id="memName" name="memName"
                        class="form-control" readonly="readonly" value="${jDto.memName}">
                  </div>
                  <div class="col-1 text-center">
                     <label for="exampleInputEmail1">근무 일자</label>
                  </div>
                  <div class="col-3">
                     <input type="date" id="jnWdate" name="jnWdate"
                        class="form-control">
                  </div>
               </div>
               <div class="row pt-5">
                  <div class="col-1 text-center">
                     <label for="exampleInputEmail1">직군</label>
                  </div>
                  <div class="col-3">
                     <input type="text" id="jgName" name="jgName" class="form-control"
                        readonly="readonly" value="${jDto.jgName}">
                  </div>
                  <div class="col-1 text-center">
                     <label for="exampleInputEmail1">직종</label>
                  </div>
                  <div class="col-3">
                     <input type="text" id="jobName" name="jobName"
                        class="form-control" readonly="readonly" value="${jDto.jobName}">
                  </div>
                  <div class="col-1 text-center">
                     <label for="exampleInputEmail1"></label>
                  </div>
                  <div class="col-3"></div>
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
								<th>시간</th>
								<th>직무</th>
								<th>진척도(%)</th>
								<th>비고</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${time}" var="time" varStatus="status">
								<tr>
									<td>${time}</td>
								
									<td><select id="ssNo${status.index}" class="form-select" onchange="change('${status.index}')">
									    <option id="ssNo${status.index}" value= "">직무를 선택해주세요</option>
										<c:forEach items="${sList}" var="s">
									    	<option id="ssNo${status.index}" value="${s.sNo}">${s.sName}</option>	
										</c:forEach>
									    </select>
									    <input type="hidden" name="jnLIst[${status.index}].sNo" id="jnLIst[${status.index}].sNo" class="s${status.index}">
									    </td>
										<td><input type="text" id="jndProgress${status.index}"
										name="<c:url value='jnLIst[${status.index}].'/>jndProgress"
										class="form-control"></td>
									<td><input type="text" id="jndNote${status.index}"
										name="<c:url value='jnLIst[${status.index}].'/>jndNote"
										class="form-control"></td>
									

									
									</tr>
								</c:forEach>
						</tbody>
					</table>
					<div id='mydropzone' class="dropzone">

						<input type="file" id="fileUpload" name="fileUpload"
							style="visibility: hidden;" />

						<div class="fileDrop">
							<input type="hidden" id="uploadCount">
							<div class="dz-message needsclick">
								<i class="h1 text-muted dripicons-cloud-upload"></i>
								<h3>Drop files here or click to upload.</h3>
								<span class="text-muted font-13">첨부파일을 업로드하려면 여기에 첨부파일
									파일을 끌어 넣거나 클릭해주세요</span>
							</div>
						</div>
					</div>
					<div>
						<ul class="dropzone-previews clearfix uploadedList">
						</ul>
					</div>
				
            </div>
            <div class="mt-4">
               <div class="offset-9" align="right">
                  <input type="button" class="btn btn-outline-primary" id="btn_submit"
                     name="btn_submit" value="등록"> <input type="button"
                     class="btn btn-outline-dark" onclick="location.href='/journal/list'"
                     value="취소">
               </div>
            </div>
         </form>
      </div>
   </div>
</div>
</main>
<script src="https://code.jquery.com/jquery-2.2.1.js"></script>

<script
   src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<script type="text/javascript" src="/resources/upload.js"></script>
<script
   src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js"></script>
<script id="template" type="text/x-handlebars-template">
<li class="dropzone-previews mt-3">
<div class="card mt-1 mb-0 shadow-none border dz-processing dz-image-preview dz-success dz-complete">
<div class="p-2">
<div class="row align-items-center">
 <div class="col-auto">
    <img data-dz-thumbnail="" class="avatar-sm rounded bg-light" src="{{imgsrc}}">
 </div>
 <div class="col pl-0">
   <a href="/displayFile?fileName={{fullName}}" text-muted font-weight-bold" data-dz-name="">{{fileName}}</a>
 </div>
 <div class="col-auto">
   <a href="{{fullName}}" class="btn btn-default btn-xs pull-right delbtn"><i class="far fa-trash-alt"></i></a>
 </div>
</div>
</div>
</div>
</li>
</script>
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
                  formObj.submit(function(event) {
                           event.preventDefault();
                           //유효성 검사
                          
                    
                              var that = $(this);
                              var str = "";
                              $(".uploadedList .delbtn")
                                    .each(
                                          function(index) {
                                             str += "<input type='hidden' name='files'"
                                                   + " value='"
                                                   + $(this)
                                                         .attr(
                                                               "href")
                                                   + "'> ";
                                          });

                              that.append(str);
                             

                              that.get(0).submit();

                         

                        });

                  $(".btn-cancel")
                        .on(
                              "click",
                              function() {
                                 self.location = "list&page=${cri.page}&perPageNum=${cri.perPageNum}"
                                       + "&searchType=${cri.searchType}&listType=${cri.listType}&keyword=${cri.keyword}";
                              });

               });

   $('#mydropzone').click(function(event) {

      let fileUpload = document.getElementById("fileUpload");
      fileUpload.click();

   });

   var template = Handlebars.compile($("#template").html());

   //dragenter dragover, drop 기본 동작 막기(기본적인 이벤트 처리 제한 preventDefault) 끌어다 놓으면 새로운 창이 열리는 동작
   $(".fileDrop").on("dragenter dragover", function(event) {
      event.preventDefault();
   });

   $(".fileDrop").on("drop", function(event) {
      event.preventDefault();

      var uploaded = $("#uploadCount").val();

      //event.dataTransfer=이벤트와 같이 전달된 데이터   
      //dataTransfer.files= 그안 에 포함된 전달된 파일 데이터를 찾아 가져오는 부분
      //jQuery를 이용하는 경우 envent가 순수한 DOM 이벤트가 아니기때문에 
      var files = event.originalEvent.dataTransfer.files;

      var file = files[0];

      //formData를 이용한 서버 호출 (기존 <form>태그로 만든 데이터 전송방식과 동일)
      var formData = new FormData();

      //file 이름으로 파일 객체 추가
      formData.append("file", file);

      //$.post()를 사용하지 않고 $.ajax() 사용하는 대신 processData,contentType: false로 지정
      $.ajax({
         url : '/uploadAjax',
         data : formData,
         dataType : 'text',
         processData : false, //데이터를 자동 변환 할 것인지(true:일반적인 query string / false:자동 변환 없이)
         contentType : false, //기본값(true) application/urlcod 타입으로 전송 / 파일의 경우(false) multipart/form_data 방식으로 전송
         type : 'POST',
         success : function(data) {

            var fileInfo = getFileInfo(data);
            var html = template(fileInfo);

            var str = "";

            $(".uploadedList").append(html);

            uploaded++;
            $("#uploadCount").attr("value", uploaded);

            $(".uploadedList").append(str);
         }
      });
   });

   //클릭으로 파일 업로드할 때 호출되는 함수
   $("#fileUpload").on("change", function(event) {
      event.preventDefault();

      var uploaded = $("#uploadCount").val();

      if (uploaded >= 3) {
         alert('첨부파일은 3개 까지 업로드할 수 있습니다.');
         return;
      }

      // 파일업로드 인풋에서 파일을 받음
      var file = document.getElementById("fileUpload").files[0];

      // 새로운 폼데이터를 생성
      var formData = new FormData();

      // 폼데이터에 파일을 붙임
      formData.append("file", file);

      // AJAX로 uploadAjax 메소드를 호출해서 파일을 업로드함
      $.ajax({
         url : '/uploadAjax',
         data : formData,
         dataType : 'text',
         processData : false,
         contentType : false,
         type : 'POST',
         success : function(data) {

            var fileInfo = getFileInfo(data);
            var html = template(fileInfo);

            var str = "";

            $(".uploadedList").append(html);
            

            uploaded++;
            $("#uploadCount").attr("value", uploaded);

            $(".uploadedList").append(str);
         }
      });
   });

   //첨부파일 삭제 처리
   $(".uploadedList").on("click", ".delbtn", function(event) {
      event.preventDefault();

      var that = $(this);
      var uploaded = $("#uploadCount").val();

      $.ajax({
         url : "/deleteFile",
         type : "post",
         data : {
            fileName : $(this).attr("href")
         },
         dataType : "text",
         success : function(result) {

            if (result == 'deleted') {

               that.closest("li").remove();
               uploaded--;
               $("#uploadCount").attr("value", uploaded);

            }
         }

      });

   });
   //파일링크 처리(길이를 줄여줌)
   function getOriginalName(jnfileName) {

      if (checkImageType(jnfileName)) {
         return;
      }

      var idx = jnfileName.indexOf("_") + 1;
      return jnfileName.substr(idx);

   }
   //이미지파일 원본 파일 찾기
   function getImageLink(jnfileName) {

       if (!checkImageType(jnfileName)) {
         return;
      }
      //noticeFileName.substring(0,12)/년/월/일 경로 추출  
      //noticeFileName.substring(14) 파일 이름앞의 's_'제거
      var front = jnfileName.substr(0, 12);
      var end = jnfileName.substr(14);

      return front + end;

   }
</script>






<script>
   $(document).ready(function() {
      var formObj = $("form[role='form']");
      
      $("#btn_submit").on("click", function() {
    	  if(checkJn()){
    		  formObj.submit();
    		  
    	  }
    	
    	  
      });
   });
</script>

<script>
function change(a){
			var index = a;
			var ssNo = ""; 
    		ssNo = $('#ssNo'+index).val();
    		var jlistIndex = 'jnLIst['+index+'].sNo';
    		
    		if(ssNo == 999){
    			
    			document.getElementById('jndProgress'+index).readOnly = true;
    			document.getElementById('jndNote'+index).readOnly = true;
    			 $(".s"+index).val(ssNo);

    		}
    		else{
    			 $(".s"+index).val(ssNo);  
    		}
    		
    		
    		 
    		 
    	}
</script>
<script>
$("#jnWdate").change(function(){    
	var jnWdate = $('#jnWdate').val();
	
	 $.ajax({
		type : 'GET',
		url : "/journal/checkDate",
		data : {
			jnWdate : jnWdate,
		},
		success : function(data) {
			if(data==1){
				alert("이미 등록된 날짜 입니다 ");	
				$('#jnWdate').val("");
			}
			
          
		},
		error : function(jqXHR, textStatus, errorThrown) {
			alert("ERROR : " + textStatus + " : " + errorThrown);
		}

	});
});
</script>

<%@include file="../include/footer.jsp"%>