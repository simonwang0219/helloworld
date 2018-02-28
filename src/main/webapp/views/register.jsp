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
    <title>Register Page</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/signin.css" rel="stylesheet">
</head>
<body style>
  <form class="form-horizontal register" action="/register" method="post" enctype="multipart/form-data">
      <div class="form-group">
          <label class="col-lg-2 control-label" for="username">用户名<small>（必填）</small></label>
          <div class="col-lg-4">
              <input class="form-control" id="username" name="username" type="text" />
              <span class="help-block">用户以字母、数字、下划线开头，且不能以数字开头！</span>
          </div>
      </div>
      <div class="form-group">
          <label class="col-lg-2 control-label" for="password">密码<small>（必填）</small></label>
          <div class="col-lg-4">
              <input class="form-control" id="password" name="password" type="password" />
          </div>
          <div class="col-lg-5">
              <div class="btn-group" role="group">
                  <button type="button" class="btn btn-success active">密文</button>
                  <button type="button" class="btn btn-default">明文</button>
              </div>
          </div>
      </div>
      <div class="form-group">
          <label class="col-lg-2 control-label" for="portrait">头像</label>
          <div class="col-lg-4">
              <input class="form-control" id="portrait" name="portrait" type="file" />
              <img id="showPortrait" src="" alt="" />
              <span class="help-block">支持上传GIF,JPG,PNG图片， 尺寸为70*70</span>
          </div>
      </div>
      <div class="form-group">
          <label class="col-lg-2 control-label" for="phone">电话<small>（必填）</small></label>
          <div class="col-lg-4">
              <input class="form-control" id="phone" name="phone" type="text" />
              <span class="help-block">电话号码为11位</span>
          </div>
      </div>
      <div class="form-group">
          <label class="col-lg-2 control-label" for="email">邮箱<small>（必填）</small></label>
          <div class="col-lg-4">
              <input class="form-control" id="email" name="email" type="text" />
              <span class="help-block">邮箱格式***123456@qq.com</span>
          </div>
      </div>
      <div class="form-group">
          <div class="col-lg-offset-2 col-lg-4">
              <button class="btn btn-primary btn-block" type="button">注册</button>
          </div>
      </div>
  </form>

  <script src = "js/jquery-3.2.1.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
  <script src="js/signin.js"></script>
</body>
</html>
