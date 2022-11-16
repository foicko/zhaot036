<%--
  Created by IntelliJ IDEA.
  User: 48174
  Date: 2022/11/2
  Time: 15:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Modify here
<form action="${pageContext.request.contextPath}/UpdateCollege">
    <label>ID
        <input name="id" value="${College.id}" readonly>
    </label>
    <label>学院名
        <input name="collegename" value="${College.collegename}">
    </label>
    <label>编号
        <input name="collegenum" value="${College.collegenum}">
    </label>
    <label>学院英文名
        <input name="englishname" value="${College.englishname}">
    </label>
    <label>是否有效
        <input name="inuse" value="${College.inuse}">
    </label>
    <label>描述
        <input name="remark" value="${College.remark}">
    </label>
  <button>提交</button>
</form>
</body>
</html>
