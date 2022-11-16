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
<form action="${pageContext.request.contextPath}/UpdateTeacher">
    <label>ID
        <input name="id" value="${Teacher.id}" readonly>
    </label>
    <label>教师名
        <input name="teachername" value="${Teacher.teachername}">
    </label>
    <label>教师编号
        <input name="teachernum" value="${Teacher.teachernum}">
    </label>
    <label>专业
        <input name="profession" value="${Teacher.profession}">
    </label>
    <label>部门
        <input name="department" value="${Teacher.department}">
    </label>
    <label>职称
        <input name="title" value="${Teacher.title}">
    </label>
    <label>备注
        <input name="remark" value="${Teacher.remark}">
    </label>
  <button>提交</button>
</form>
</body>
</html>
