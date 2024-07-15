<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AllJoins</title>
</head>
	<style>
		table, th, td {
	border: 1px black solid;
}
		table{
			border-collapse: collapse;
		}
	</style>
<body>

<table>

    <tr>

      <th>Name</th>

      <th>Email</th>

      <th>MobileNumber</th>

      <th>Message</th>

    </tr>
<c:forEach var="joins" items="${ joins}">
    <tr>

      <td>${joins.name }</td>

      <td>${joins.mobile }</td>

      <td>${joins.email }</td>

      <td>${joins.message }</td>

    </tr>
          </br>
      </br>
    
    </c:forEach>

</table>




</body>
</html>
