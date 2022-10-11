<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ include file="../layout/header.jsp" %>

        <div>
            <input id="homeId" type="hidden" value="${detailDto.homeId}" />
            <span>집번호${detailDto.homeId}</span>
            <input id="subId" type="hidden" value="${detailDto.subId}" />
            <span>구독번호${detailDto.subId}</span>
            <h3>집정보</h3>
            <div>구독 <i id="iconSub"
                    class='${detailDto.subed ? "fa-solid" : "fa-regular"} fa-heart my_pointer my_red'></i></div>
            <div>집이름 <span>${detailDto.homeName}</span></div>
            <div>전화번호 <span>${detailDto.homeTel}</span></div>
            <div>지역 <span>${detailDto.homeLocation}</span></div>
        </div>
        </body>

        <script>

            //하트를 클릭햇을때 로직
            $("#iconSub").click(() => {
                let isSubedState = $("#iconSub").hasClass("fa-solid");
                console.log($("#homeId").val());
                console.log($("subId").val());
                console.log("클릭함");
                if (isSubedState) {
                    deleteSub();
                } else {
                    insertSub();
                }
            });

            //DB에 insert요청하기
            function insertSub() {
                let homeId = $("#homeId").val();
                console.log("입력확인용");
                console.log($("#homeId").val());
                console.log($("#subId").val());
                $.ajax("/home/" + homeId + "/sub", {
                    type: "POST",
                    dataType: "json"
                }).done((res) => {
                    if (res.code == 1) {
                        renderLoves();
                        $("subId").val(res.data.homeId);
                        console.log(res);
                    } else {
                        alert("구독을 실패했습니다");
                    }
                });
            }

            //DB에 delete요청하기
            function deleteSub() {
                let homeId = $("#homeId").val();
                let lovesId = $("subId").val();
                console.log("삭제확인용");
                $.ajax("/home/" + homeId + "/sub/" + subId, {
                    type: "DELETE",
                    dataType: "json"
                }).done((res) => {
                    if (res.code == 1) {

                        renderCancelLoves();
                    } else {
                        alert("구독취소에 실패했습니다")
                    }

                });
            }

            //빨강하트 그리기
            function renderSub() {
                $("#iconSub").removeClass("fa-regular");
                $("#iconSub").addClass("fa-solid");
            }
            //검정하트 그리기
            function renderCancelSub() {
                $("#iconSub").removeClass("fa-solid");
                $("#iconSub").addClass("fa-regular");
            }

        </script>

        </html>