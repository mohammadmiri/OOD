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
            <td><label>username</label></td>
            <td><input name="username"/></td>
        </tr>
        <tr>
            <td><label>password</label></td>
            <td><input name="password"/></td>
        </tr>
        <tr>
            <td><label>firstname</label></td>
            <td><input name="firstname"/></td>
        </tr>
        <tr>
            <td><label>lastname</label></td>
            <td><input name="lastname"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form>

</body>
</html>