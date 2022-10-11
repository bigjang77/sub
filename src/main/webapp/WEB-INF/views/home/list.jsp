<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ include file="../layout/header.jsp" %>
        <div class="container">
            <br />
            <div class="d-flex justify-content-end">
                <div style="width: 300px">
                </div>
            </div>
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>번호</th>
                        <th>집이름</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="home" items="${homeList}">
                        <tr>
                            <td>${home.homeId}</td>
                            <td><a href="/home/${home.homeId}">${home.homeName}</a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
        </body>

        </html>