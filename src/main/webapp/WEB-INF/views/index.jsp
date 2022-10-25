<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-10-25
  Time: 오전 8:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index.jsp</title>
</head>
<body>
${result}<br>
<%--index.jsp 조회 링크 클릭
    findBook 주소 요청(get)
    DB에서 nookid가 2번인 책을 select
    findBook.jsp에 해당 정보 출력--%>
<a href="/save">도서저장</a><br>
<a href="/findBook">2번책 조회</a>
<a href="/books">책 조회</a>
</body>
</html>
