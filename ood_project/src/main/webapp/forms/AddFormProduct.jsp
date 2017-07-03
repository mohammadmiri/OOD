<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<form method="POST" action="/product/submit/add/form/product">
    <table>
        <tr>
            <td><label>name</label></td>
            <td><input name="name"/></td>
        </tr>
        <tr>
            <td><label>price</label></td>
            <td><input name="price"/></td>
        </tr>
        <tr>
            <td><label>description</label></td>
            <td><input name="description"/></td>
        </tr>
        <tr>
            <td><label>productionSteps</label></td>
            <td><input name="productionSteps"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form>

</body>
</html>