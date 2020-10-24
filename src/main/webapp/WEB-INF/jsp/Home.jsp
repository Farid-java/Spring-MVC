<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"  %>  
<%@page isELIgnored="false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<script type="text/javascript">
function update(id,email,password){
	document.getElementById('id1').value=id;
	document.getElementById('exampleInputEmail1').value=email;
	document.getElementById('exampleInputPassword1').value=password;
	document.getElementById('button').innerHTML="update";
	document.getElementById('button').value="update";
	
}

</script>

<body>

<form action="registered" method="post">

<label for="exampleInputEmail1">User Registration</label>

  <div class="form-group col-md-5  "  >
    <input type="hidden" form-control" id="id1" aria-describedby="emailHelp" placeholder="Enter Id"  required="required" name="id"  >
  </div>
  
 
  <div class="form-group col-md-5  "  >
    <label for="exampleInputEmail1">Email address</label>
    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email"  required="required" name="email" >
  </div>
  
  <div class="form-group col-md-5">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password" required="required" name="password" >
  </div>
  
  
  
  <button type="submit" class="btn btn-primary text-center" id="button" name="submitButton" value="save">Submit</button>
  <hr />
  
 <table class="table table-dark col-md-5">
  <thead>
    <tr>
      <th scope="col">id</th>
      <th scope="col">Email</th>
      <th scope="col">Password</th>
      <th scope="col">Delete</th>
      <th scope="col">Update</th>
    </tr>
  </thead>
  <c:forEach  items="${list}"  var="Rlist">
  <tbody>
    <tr>
      <th scope="row">${Rlist.id}</th>
      <td>${Rlist.email}</td>
      <td>${Rlist.password}</td>
  <td> <a href=delete/${Rlist.id}><input  type="button" value="Delete" /></a></td>
  <td> <a href=#><input  type="button" value="update"  onClick="update(${Rlist.id},'${Rlist.email}','${Rlist.password}')"/></a></td>
    </tr>
    <tr>
    </tbody>
    </c:forEach>
 </table> 
 
</form>

</body>
</html>