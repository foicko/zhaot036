<%--
  Created by IntelliJ IDEA.
  User: 48174
  Date: 2022/11/2
  Time: 15:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add</title>
</head>
<body>
AddUser here
<form action="${pageContext.request.contextPath}/AddCollege">
    <label>学院名
        <input name="collegename">
    </label>
    <label>编号
        <input name="collegenum">
    </label>
    <label>学院英文名
        <input name="englishname">
    </label>
    <label>是否有效
        <input name="inuse" >
    </label>
    <label>描述
        <input name="remark">
    </label>
    <button type="submit">提交</button>
</form>
</body>
</html>
