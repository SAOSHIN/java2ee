<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Health"%>
<% 
Health health = (Health)request.getAttribute("health");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>すっきり健康診断</title>
</head>
<body>
<h1>すっきり健康診断の結果</h1>
<form action="./HealthCheck" method=post >
    <input name="height" placeholder="身長" /> <br>
    <input name="weight" placeholder="体重" /> <br>
    <input type=submit />
</form>
<p>
身長:<%= health.getHeight() %><br>
体重:<%= health.getWeight() %><br>
BMI::<%= health.getBmi() %><br>
体型:<%= health.getBodyType() %><br>
</p>
<a href="/example/HealthCheck">戻る</a>
</body>
</html>