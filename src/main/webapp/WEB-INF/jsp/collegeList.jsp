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
    <td>学院名称</td>
    <td>学院英文名称</td>
    <td>编号</td>
    <td>是否有效</td>
    <td>添加时间</td>
    <td>描述</td>
    <td>操作</td>
  </tr>

  <c:forEach items="${Colleges}" var="college">
    <tr>
      <td>${college.id}</td>
      <td>${college.collegename}</td>
      <td>${college.englishname}</td>
      <td>${college.collegenum}</td>
      <td>${college.inuse}</td>
      <td>${college.addtime}</td>
      <td>${college.remark}</td>
      <td><a href="${pageContext.request.contextPath}/toUpdateCollege?id=${college.id}">修改</a><a href="${pageContext.request.contextPath}/DeleteCollege?id=${college.id}">删除</a></td>
    </tr>
  </c:forEach>

</table>
<a href="${pageContext.request.contextPath}/toAddCollege">添加学院信息</a>
<a href="${pageContext.request.contextPath}/toJSON">使用JSON添加学院信息</a>
</body>
</html>