<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>  
<%@page isELIgnored="false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC</title>
<style type="text/css"  >
header{ color: blue; text-align: center; font-size: 120%; }
#form{background-color: #E6E6FA;text-align: center;padding: 2%; align-content: center;  }
</style>

<!-- not working <link type="text/css"  rel="stylesheet"  href="webapp/css/style.css"  /> -->
</head>
<header>Welcome to Jsoft</header>
<body>
<div id="form">
 <form:form action="register"   method="post"  modelAttribute="user" >
 <table>
 <tr><td>Name</td><td><input type="text"  required="required" name="name"> </td></tr>
 <tr><td>password</td><td><input type="password"  required="required" name="password"> </td></tr>
 
 <tr><td><input  type="submit"  value="SUBMIT"> </td> </tr>
 
 </table>
 </form:form>
 </div>
 
 <table border="3">
 <tr><td>Id</td><td>Name</td><td>Password</td> </tr>
 
 <c:forEach var="l"  items="${list}">
 <tr>
 
 <td>${l.id}</td>
 <td>${l.name}</td>
 <td>${l.password}</td>
 <td> <a href=delete/${l.id}><input  type="submit" value="Delete" /></a></td>
  <td> <a href=update/${l.id}><input  type="submit" value="update" /></a></td>
 </tr>
 </c:forEach>
 
 </table>
</body>
</html>