<%--
  Created by IntelliJ IDEA.
  User: docrob
  Date: 9/17/21
  Time: 7:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cat Detail</title>
</head>
<body>

<table>
    <tr>
        <td><b>Cat Id</b></td>
        <td>${cat.id}</td>
    </tr>
    <tr>
        <td><b> Name</b></td>
        <td>${cat.catName}</td>
    </tr>
    <tr>
        <td><b>Age</b></td>
        <td>${cat.age}</td>
    </tr>
</table>

<a href="/cats">Back</a>
</body>
</html>
