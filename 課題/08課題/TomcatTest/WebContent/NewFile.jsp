<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form >  
	<input 
		type=text 
		name="my_text" 
		placeholder="表示したい文字列"
		autofocus=autofocus
		/>
		<input type="text" placeholder="asin" value="4797327030" name="asin"/>
	<input type=submit value="表示" />
</form>

<%
String text = "";
text = request.getParameter("my_text");
if ( text == null ){  text = "";}
//String text = "hello world";
String asin = "";asin = request.getParameter("asin");
				if ( asin == null )
				{ 
					asin = "4844335804";
				}
String url = "http://ecx.images-amazon.com/images/I/51E74hRiuOL.MZZZZZZZ._PU45_._PA10,10,20,10_.jpg"
			 +asin+".09._ZA"+text+",0,65,95,120,times,14,255,0,0_.jpg";

				"http://ec2.images-amazon.com"+
				"/images/I/41K1i8aKbEL."+
				"_SS400_OU02_HL155,300,60,60,250"+
				"ZA@katoyuu1,40,300,300,300,arial,45,0,0,0_ "+
				".jpg";
%>
<img src=/>
</body>
</html>