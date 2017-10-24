<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <body>
	<form action="updatebook" method="post">
		<h1 align="center">图书信息修改</h1>
		<table align="center" border="1">
			<tr>
				<td>
				图书编号
				<s:textarea name="bookInfo.bookCode" readonly="redonly"/></td>
			
			
				<td>图书分类
				<s:select name="bookInfo.bookType.id" list="list2" listKey="bookType.id" listValue="typeName"/></td>
			</tr>
			<tr>
				<td>图书名称
				<s:textarea name="bookInfo.bookName"/></td>
			
				<td>作者
				<s:textarea name="bookInfo.bookAuthor"/></td>
			</tr>
			<tr>
				<td>出版社
				<s:textarea name="bookInfo.publishPress"/></td>
			
				<td>入库时间
				<s:textarea name="bookInfo.creationTime"/></td>
			</tr>
			<tr>
				<td>是否借阅
				<s:select name="bookInfo.borrowed" list="#{'1':'已借阅','0':'未借阅'}"/></td>
			</tr>
			<tr align="center">
				<td colspan="2">
					<input type="submit" value="提交"/>
					<input type="reset" value="重置"/>
				</td>
			</tr>
		</table>
	</form>
</body>

</body>
</html>