<%--
  Created by IntelliJ IDEA.
  User: liuku
  Date: 2020/9/23
  Time: 8:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>edit</title>
    <link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css'>
    <link rel="stylesheet" href="/static/css/bootstrap-grid.min.css">
    <script type="text/javascript" src="/static/js/jquery.min.js"></script>
    <script>
        function submitResume() {
            $.ajax({
                type: "POST",
                url: "/edit",
                data: $('#form1').serialize(),
                success: function (result) {
                    alert(result);
                    window.location.href = '/list'
                },
                error: function () {
                    alert("异常");
                }
            });
        }
    </script>
</head>
<body>
<form id="form1" action="" onsubmit="return false;">
    <input type="hidden" class="form-control" id="id" name="id" value="${resume.id}">
    <label for="name">姓名:</label><input type="text" class="form-control" id="name" name="name" value="${resume.name}">
    <label for="address">地址:</label><input type="text" class="form-control" id="address" name="address"
                                           value="${resume.address}">
    <label for="phone">电话号码:</label><input type="text" class="form-control" id="phone" name="phone"
                                           value="${resume.phone}">
    <button class="btn-primary" onclick="submitResume()">提交</button>
</form>
</body>
</html>
