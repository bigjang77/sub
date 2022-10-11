<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ include file="../layout/header.jsp" %>

        <div>
            <input id="id" type="hidden" value="${detailDto.homeId}" />
            <input id="lovesId" type="hidden" value="${detailDto.subId}" />
            <h3>집정보</h3>
            <div>구독 <i id="iconSub" class="fa-regular fa-heart"></i></div>
            <div>집이름 <span>${detailDto.homeName}</span></div>
            <div>전화번호 <span>${detailDto.homeTel}</span></div>
            <div>지역 <span>${detailDto.homeLocation}</span></div>
        </div>
        </body>

        <script>
            // $("#iconHeart").click(() => {
            //     let check = $("#iconHeart").hasClass("fa-regular");
            //     console.log(check);

            //     if (check == true) {
            //         $("#iconHeart").removeClass("fa-regular");
            //         $("#iconHeart").addClass("fa-solid");
            //         $("#iconHeart").css("color", "red");
            //     } else {
            //         $("#iconHeart").removeClass("fa-solid");
            //         $("#iconHeart").addClass("fa-regular");
            //         $("#iconHeart").css("color", "black");
            //     }
            // });


            $("#iconSub").click(() => {
                let isSubedState = $("#iconSub").hasClass("fa-solid");
                console.log("클릭함")
                if (isSubedState) {
                    deleteSub();
                } else {
                    insertSub();
                }
                renderSub(isSubedState);
            });

            function insertSub() {

            }
            function deleteSub() {

            }

            function renderSub(isSubedState) {
                if (isSubedState == true) {
                    $("#iconSub").removeClass("fa-regular");
                    $("#iconSub").addClass("fa-solid");
                    $("#iconSub").css("color", "red");
                } else {
                    $("#iconSub").removeClass("fa-solid");
                    $("#iconSub").addClass("fa-regular");
                    $("#iconSub").css("color", "black");
                }
            }
        </script>

        </html>