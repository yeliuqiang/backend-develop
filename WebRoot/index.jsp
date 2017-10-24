<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'index.jsp' starting page</title>
  </head>
  
  <body>
    <h1 align="center">图书借阅系统-后台管理</h1>
    <table border="1" align="center">
    	<tr>
    		<td>图书编号</td>
    		<td>图书分类</td>
    		<td>图书名称</td>
    		<td>作者</td>
    		<td>出版社</td>
    		<td>入库时间</td>
    		<td>是否借阅</td>
    		<td>操作</td>
    	</tr>
    	<s:iterator var="b" value="list">
    	<tr>
    		<td><s:property value="#b.bookCode"/></td>
    		<td><s:property value="#b.bookType.typeName"/></td>
    		<td><s:property value="#b.bookName"/></td>
    		<td><s:property value="#b.bookAuthor"/></td>
    		<td><s:property value="#b.publishPress"/></td>
    		<td><s:property value="#b.creationTime"/></td>
    		<td>
    			<s:if test="#b.borrowed==0">未借阅</s:if>
    			<s:if test="#b.borrowed==1">已借阅</s:if>
    		</td>
           <td>
           <a href="#">查看</a>
           <a href="editbook?bookId=<s:property value="#b.bookId"/>">修改</a>
           <a href="delbook?bookId=<s:property value="#b.bookId"/>">删除</a>
           </td>
        </tr>
        </s:iterator>
        
        
        </table>
  </body>
</html>
