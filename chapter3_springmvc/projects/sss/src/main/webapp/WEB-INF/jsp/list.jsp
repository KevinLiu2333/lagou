<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: liuku
  Date: 2020/9/22
  Time: 23:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>list</title>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<script>
    function deleteResume(id) {
        if (confirm("确认删除?")) {
            $.ajax({
                url: '/delete?id=' + id,
                type: 'POST',
                contentType: 'application/json;charset=utf-8',
                success: function (data) {
                    alert(data);
                    location.reload();
                }
            })
        }
    }
</script>
<body>
<div>
    <button class="btn-primary" style="float: right;margin:10px" onclick="window.location.href = '/edit'">新增</button>
</div>
<table class="table table-striped table-bordered table-hover table-condensed table-responsive">
    <thead class="active">
    <tr>
        <th>id</th>
        <th>address</th>
        <th>name</th>
        <th>phone</th>
        <th>编辑</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="resume">
        <tr class="success">
            <td>${resume.id}</td>
            <td>${resume.address}</td>
            <td>${resume.name}</td>
            <td>${resume.phone}</td>
            <td>
                <button class="btn-primary" onclick="window.location.href = '/edit?id=${resume.id}'">修改</button>
                <button class="btn-primary" onclick="deleteResume(${resume.id})">删除</button>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
