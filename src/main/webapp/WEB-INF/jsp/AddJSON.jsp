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
            var collegename = $("#collegename").val();
            var collegenum = $("#collegenum").val();
            var englishname = $("#englishname").val();
            var inuse = $("#inuse").val();
            var remark = $("#remark").val();
            $.ajax({
                url:'${pageContext.request.contextPath }/AddCollegeJSON',
                type : "post",
                // data表示发送的数据
                data :JSON.stringify({
                    collegename:collegename,
                    collegenum:collegenum,
                    englishname:englishname,
                    inuse:inuse,
                    remark:remark
                }),
                // 定义发送请求的数据格式为JSON字符串
                contentType : "application/json;charset=UTF-8",
                //定义回调响应的数据格式为JSON字符串,该属性可以省略
                dataType : "json",
                //成功响应的结果
                success:window.location.href='findAllCollege'
            })
        }
    </script>
</head>
<body>
<div>使用JSON添加College</div>
<form>
    <label for="collegename">学院名</label><input type="text" name="collegename" id="collegename">
    <label for="collegenum">编号</label><input type="text" name="collegenum" id="collegenum">
    <label for="englishname">学院英文名</label><input type="text" name="englishname" id="englishname">
    <label for="inuse">是否有效</label><input type="text" name="inuse" id="inuse">
    <label for="remark">描述</label><input type="text" name="remark" id="remark">

    <input type="button" value="添加" onclick="fetch_post()">
</form>

</body>
</html>
