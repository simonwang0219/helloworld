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
  <title>Hello World</title>

  <!--Bootstrap-->
  <link href="css/bootstrap.min.css" rel="stylesheet">
  <link href="css/signin.css" rel="stylesheet">
  <script src = "js/jquery-3.2.1.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
</head>
<body style>
<div class="container">
  <form class="form-signin" action="/index">
    <h2 class="form-signin-heading">Please sign in</h2>
    <label for="inputEmail" class="sr-only">Email address</label>
    <input type="email" id="inputEmail" class="form-control" placeholder="Email address" required autofocus>
    <label for="inputPassword" class="sr-only">Password</label>
    <input type="password" id="inputPassword" class="form-control" placeholder="Password" required>
    <div class="checkbox">
      <label>
        <input type="checkbox" value="remember-me"> Remember me
      </label>
    </div>
    <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
  </form>
</div>
</body>
</html>
