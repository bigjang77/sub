<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ include file="../layout/header.jsp" %>
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