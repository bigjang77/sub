<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="UTF-8">
            <title>Insert title here</title>
            <script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.js"></script>
            <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" rel="stylesheet">
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
        </head>

        <body>
            <div class="d-flex justify-content-between">
                <h3>제목</h3>
                <div>구독 <i id="iconHeart" class="fa-regular fa-heart"></i></div>
                <div>회사명 <input type="text" placeholder="회사명을 입력하세요" readonly></div>
                <div>설립연도 <input type="text" placeholder="2011.11.12" readonly></div>
                <div>주요업무 <input type="text" placeholder="서버관리/프로그램설계" readonly></div>
                <div>평균연봉 <input type="text" placeholder="연 4000" readonly></div>
                <div>기업복지 <input type="text" placeholder="과자줌" readonly></div>
                <div>회사소개 <input type="text" placeholder="회사조타" readonly></div>
            </div>
        </body>

        <script>
            $("#iconHeart").click(() => {
                let check = $("#iconHeart").hasClass("fa-regular");
                console.log(check);

                if (check == true) {
                    $("#iconHeart").removeClass("fa-regular");
                    $("#iconHeart").addClass("fa-solid");
                    $("#iconHeart").css("color", "red");
                } else {
                    $("#iconHeart").removeClass("fa-solid");
                    $("#iconHeart").addClass("fa-regular");
                    $("#iconHeart").css("color", "black");
                }
            });
        </script>

        </html>