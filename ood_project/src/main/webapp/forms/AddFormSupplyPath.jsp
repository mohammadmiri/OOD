<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<form method="POST" action="/path/submit/add/form/supplyPath">
    <table>
        <tr>
            <td><label>time</label></td>
            <td><input name="time"/></td>
        </tr>
        <tr>
            <td><label>cost</label></td>
            <td><input name="cost"/></td>
        </tr>
        <tr>
            <td><label>description</label></td>
            <td><input name="description"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form>

</body>
</html>