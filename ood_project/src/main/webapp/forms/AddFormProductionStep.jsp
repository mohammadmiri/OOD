<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<form method="POST" action="/product/submit/add/form/productionStep" >
    <table>
        <tr>
            <td><label>cost</label></td>
            <td><input name="cost"/></td>
        </tr>
        <tr>
            <td><label>preCondition</label></td>
            <td><input name="preCondition"/></td>
        </tr>
        <tr>
            <td><label>postCondition</label></td>
            <td><input name="postCondition"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form>

</body>
</html>