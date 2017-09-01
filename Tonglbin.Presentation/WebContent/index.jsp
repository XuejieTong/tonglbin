<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="../js/jquery-1.7.1.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Index</title>
<script type="text/javascript">
$(function(){
    $.ajax({
        type: "post",
        url: "getUserById?id=297ec4525d602974015d602ac0480001",
        beforeSend: function () {

        },
        success: function (oRes) {
        	$("#divTest").text(oRes);
        },
        error: function (error) {
            $("#divTest").text(error);
        }
    });
});
</script>
</head>
<body>
AAA，<div id="divTest"></div>
</body>
</html>