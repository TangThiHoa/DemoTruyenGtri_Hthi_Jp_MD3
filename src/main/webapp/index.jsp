<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Calculator!" %>
</h1>
<br/>
<form action="/SumServlet" method="post">
<input type="text" name="a" placeholder="Enter in a"><br>
<br>
<input type="text" name="b" placeholder="Enter in b"><br>
<br>
<button>Result</button>
</form>
<br>
<hr>
<br>

<form action="/L" method="post">
    <input type="text" placeholder="Enter in list">
    <button>Click</button>
</form>
<br>
<hr>
<form action="/S" METHOD="post">
    <input type="text" name="name" placeholder="Enter in name"><br>
    <br>
    <input type="text" name="country" placeholder="Enter in country"><br>
    <br>
    <input type="text" name="age" placeholder="Enter in age"><br>
    <br>
    <button>Click</button>
    <br>
    <hr>
    <h1>Currency conversion </h1>

</form>
<form action="/C" method="get">
    <input type="text" name="rate" placeholder="Enter in number"><br>
    <br>
    <input type="text" name="usd" placeholder="Enter in number"><br>
    <br>
    <button>Converter</button>
</form>
</body>
</html>