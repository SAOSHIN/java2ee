<%@ page language="java"contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ page import="java.util.Date,java.text.SimpleDateFormat" %>
<%@ page contentType="text/html; charset=UTF-8" import= "model.Employee" %>
<%Employee emp = new Employee("0001","俺") %>
<%
	//運勢リスト
	//String[] luckArray = {"超すっきり","すっきり","最悪"};
	//乱数
	//int index = (int) (Math.random()*3);
	//String luck = luckArray[index];
	
	//実行日
	//Date date = new Date();
	//SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
	//String today = sdf.format(date);
	
	//byte model;
	//public class Employee
	//{
		//private String id;
		//private String name;
		//public Employee(String id, String name)
		//{
		//	this.id = id; this.name = name;
		//}
		//public String getId(){return id;}
		//public String getName(){return name;}
	//}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<% for(int i = 0; i < 10; i++) { %>
<% if(i % 3 == 0) { %>
<p style="color:red">
<% }else { %>
<p>
<% }%>
IDは<%= emp.getId()%>、名前は<%= emp.getName()%></p>
<% }%>
</body>
</html>