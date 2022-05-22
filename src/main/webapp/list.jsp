<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: AE
  Date: 5/23/2022
  Time: 1:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%----items la ten mang  , var : tung phan tu--%>
    <c:forEach items="${dSach}" var="a">
        <h1>${a}</h1>
    </c:forEach>

</body>
</html>
