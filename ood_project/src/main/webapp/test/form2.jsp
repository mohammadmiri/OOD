<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
</head>
<body>
<h3>Welcome, Enter The Employee Details</h3>
<form:form method="POST" action="/user/form" modelAttribute="order">
    <table>
        <tr>
            <td><form:label path="totalCost">Name</form:label></td>
            <td><form:input path="totalCost"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>












