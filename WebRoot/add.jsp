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
	<form action="doaddbook" method="post">
		<h1 align="center">新增图书信息</h1>
	<table align="center" width="600">
			<tr >
				<td>图书编号: <input type="text" name="bookInfo.bookId"
					readonly="readonly" /></td>
			</tr>
			<tr>
				<td>图书名称: <input type="text" name="bookInfo.bookName" /></td>
			</tr>
			<tr>
				<td>图书类型: 
				<select name="bookInfo.bookType.id">
						<s:iterator var="type" value="list2">
							<option value="<s:property value="#type.id"/>"><s:property
									value="#type.typeName" /></option>
						</s:iterator>
				</select>
				</td>
				</tr>
				<tr>
				<td>
					出版社:
					<input type="text" name="bookInfo.publishPress"/></td>
				<td>
					是否借阅:
					<select name="bookInfo.borrowed">
						<option value="1">已借阅</option>
						<option value="0">未借阅</option>
					</select>
				</td>
			</tr>
			<tr><td>作者:<input type="text" name="bookInfo.bookAuthor"/></td>
			 </tr>
			 <tr>
			 <td>入库人：<input type="text"name="bookInfo.createBy"/></td>
			</tr>
			<tr>
			 <td>入库时间：<input type="text"name="bookInfo.creationTime"/></td>
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
</html>
