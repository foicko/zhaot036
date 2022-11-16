<%@ page contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Index</title>
</head>
<body>
<table border=1>
  <tr>
    <td>编号</td>
    <td>教师名称</td>
    <td>编号</td>
    <td>专业</td>
    <td>部门</td>
    <td>职称</td>
    <td>备注</td>
    <td>操作</td>
  </tr>

  <c:forEach items="${Teachers}" var="teacher">
    <tr>
      <td>${teacher.id}</td>
      <td>${teacher.teachername}</td>
      <td>${teacher.teachernum}</td>
      <td>${teacher.profession}</td>
      <td>${teacher.department}</td>
      <td>${teacher.title}</td>
      <td>${teacher.remark}</td>
      <td><a href="${pageContext.request.contextPath}/toUpdateTeacher?id=${teacher.id}">修改</a><a href="${pageContext.request.contextPath}/DeleteTeacher?id=${teacher.id}">删除</a></td>
    </tr>
  </c:forEach>

</table>
<a href="${pageContext.request.contextPath}/toAddTeacher">添加用户</a>
</body>
</html>