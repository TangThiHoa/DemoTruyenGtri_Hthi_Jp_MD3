<%--
  Created by IntelliJ IDEA.
  User: AE
  Date: 5/23/2022
  Time: 2:13 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Name :${list.name} , Country /:${list.country}, Age :${list.age}</h1>
<c:forEach items="${list}" var="s">
    <h1>${s}</h1>
</c:forEach>

</body>
</html>
