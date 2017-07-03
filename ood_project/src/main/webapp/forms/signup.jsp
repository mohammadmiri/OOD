<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<form method="POST" action="/user/submit/signup">
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
            <td><input name="firstName"/></td>
        </tr>
        <tr>
            <td><label>lastname</label></td>
            <td><input name="lastName"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form>

</body>
</html>