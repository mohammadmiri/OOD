<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<form method="POST" action="/user/testadd" modelAttribute="employee">
    <table>
        <tr>
            <td><label>total cost</label></td>
            <td><input name="total-cost"/></td>
        </tr>
        <tr>
            <td><label>date</label></td>
            <td><input name="date"/></td>
        </tr>
        <tr>
            <td><label>number</label></td>
            <td><input name="number"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form>

</body>
</html>