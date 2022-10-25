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
    <title>bookSave.jsp</title>
</head>
<body>
<h2>신규도서등록</h2>
    <form action="/save" method="post">
        <input type="text" name="bookName" placeholder="도서명"><br>
        <input type="text" name="bookAuthor" placeholder="저자"><br>
        <input type="number" name="bookPrice" placeholder="도서가격"><br>
        <input type="text" name="bookPublisher" placeholder="출판사"><br>
        <input type="submit" value="등록">
    </form>
</body>
<script>

</script>
</html>
