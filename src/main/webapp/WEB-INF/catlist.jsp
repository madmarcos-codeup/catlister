<%--
  Created by IntelliJ IDEA.
  User: docrob
  Date: 9/17/21
  Time: 6:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List of Cats!</title>
</head>
<body>

<table class="table">
    <thead>
    <tr>
        <th>Cat Name</th>
        <th>Age</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${cats}" var="cat">
        <tr>
            <td><a href="cat/${cat.id}">${cat.catName}</a></td>
            <td>${cat.age}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
