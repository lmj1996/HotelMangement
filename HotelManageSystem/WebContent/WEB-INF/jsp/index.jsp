<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@page import="com.pojo.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<style type="text/css">
	.td td{
		width: 100px;
	}
	.table{
		text-align: center;
		margin: 0 auto;
	}
</style>
</head>
<body>
<%
	Room room = ((Room)request.getAttribute("var"));
%>
 
	<table class="table">
		<tr class="td">
			<td>ID</td>
			<td>类型</td>
			<td>状态</td>
			
		</tr>
<%if(room!=null){%>
		<tr class="td">
			<td><%=room.getRoomId()%></td>
			<td><%=room.getRoomType()%></td>
			<td><%=room.getRoomState()%></td>
			
		</tr>
	<%}else{ %>
		<tr class="td">
			<td style="color: red;">暂无相关数据</td>
		</tr>
<%} %>
	</table>
 
</body>
</html>
