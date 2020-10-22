<%@page import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div id="form">
 <form  action= "${pageContext.request.contextPath}/register"   method="post"  >
 <table>
 <tr><td>Id</td><td><input type="text"  required="required" name="id"  value="${BeanObject.id} "> </td></tr>
 <tr><td>Name</td><td><input type="text"  required="required" name="name" value="${BeanObject.name}"> </td></tr>
 <tr><td>password</td><td><input type="password"  required="required" name="password" value="${BeanObject.password}"> </td></tr>
 
 <tr><td><input  type="submit"  value="Update"> </td> </tr>
 
 </table>
 </form >
 </div>
</body>
</html>