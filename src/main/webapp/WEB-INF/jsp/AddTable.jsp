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
    <title>Title</title>
</head>
<body>
AddUser here
<form action="${pageContext.request.contextPath}/AddTeacher">
    <label>教师名
        <input name="teachername">
    </label>
    <label>教师编号
        <input name="teachernum">
    </label>
    <label>专业
        <input name="profession">
    </label>
    <label>部门
        <input name="department">
    </label>
    <label>职称
        <input name="title">
    </label>
    <label>备注
        <input name="remark">
    </label>
    <button type="submit">提交</button>
</form>
</body>
</html>
