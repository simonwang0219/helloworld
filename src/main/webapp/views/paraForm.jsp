<%--
  Created by IntelliJ IDEA.
  User: wlq
  Date: 2017/12/29
  Time: 16:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring MVC Param Test</title>

    <!--Bootstrap-->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/signin.css" rel="stylesheet">
    <script src = "js/jquery-3.2.1.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</head>
<body style>
<div class="container">
    <form action ="<%=request.getContextPath()%>/addUser3" method="get">
        用户名:&nbsp;<input type="text" name="username"/><br/>
        密&nbsp;&nbsp;码:&nbsp;<input type="password" name="password"/><br/>
        <input type="submit" value="提交"/>
        <input type="reset" value="重置"/>
    </form>
</div>
</body>
</html>
