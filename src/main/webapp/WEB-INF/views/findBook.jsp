<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-10-25
  Time: 오전 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>findBook.jsp</title>
</head>
<body>
    <h2>조회결과</h2>
    bookDTO객체 : ${book}<br>
    번호 : ${book.bookId}<br>
    제목 : ${book.bookName}<br>
    저자 : ${book.bookAuthor}<br>
    가격 : ${book.bookPrice}<br>
    출판사 : ${book.bookPublisher}<br>
    <a href="/">index.jsp</a>

</body>
</html>
