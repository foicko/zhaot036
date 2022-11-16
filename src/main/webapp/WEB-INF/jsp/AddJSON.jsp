<%--
  Created by IntelliJ IDEA.
  User: 48174
  Date: 2022/11/4
  Time: 18:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="http://libs.baidu.com/jquery/2.1.4/jquery.min.js"></script>
    <script type="text/javascript">
        function fetch_post(){
            var teachername = $("#teachername").val();
            var teachernum = $("#teachernum").val();
            var profession = $("#profession").val();
            var department = $("#department").val();
            var title = $("#title").val();
            var remark = $("#remark").val();
            console.log(teachername,teachernum,profession)
            $.ajax({
                url:'${pageContext.request.contextPath }/AddTeacherJSON',
                type : "post",
                // data表示发送的数据
                data :JSON.stringify({
                    teachername:teachername,
                    teachernum:teachernum,
                    profession:profession,
                    department:department,
                    title:title,
                    remark:remark
                }),
                // 定义发送请求的数据格式为JSON字符串
                contentType : "application/json;charset=UTF-8",
                //定义回调响应的数据格式为JSON字符串,该属性可以省略
                dataType : "json",
                //成功响应的结果
            })
        }
    </script>
</head>
<body>
<div>使用JSON添加Teacher</div>
<form>
    <label for="teachername">教师名</label><input type="text" name="teachername" id="teachername">
    <label for="teachernum">教师编号</label><input type="text" name="teachernum" id="teachernum">
    <label for="profession">专业</label><input type="text" name="profession" id="profession">
    <label for="department">部门</label><input type="text" name="department" id="department">
    <label for="title">职称</label><input type="text" name="title" id="title">
    <label for="remark">备注</label><input type="text" name="remark" id="remark">
    <input type="button" value="添加" onclick="fetch_post()">
</form>

</body>
</html>
