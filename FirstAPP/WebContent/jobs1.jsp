<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
   th,td{
     background-color: darkred;
     color: white;
     height: 30px;
     width: 150px;
   }
   
   td{
     background-color: lightgray;
     color:black;
   }
</style>
</head>
<body>
<table>
	    <tr>
	       <th>Job ID</th>
	       <th>Job Title</th>
	       <th>Min Salary</th>
	       <th>Max Salary</th>
	    </tr>
	 
	    <c:forEach items="${jlist}" var="x">
	       <tr>
	          <td>${x.job_id}</td>
	          <td>${x.job_title}</td>
	          <td>${x.min_salary}</td>
	          <td>${x.max_salary}</td>
	       
	       </tr>
	    
	    </c:forEach>
	    
	</table>

</body>
</html>