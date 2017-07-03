<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<form method="POST" action="/product/submit/advanceSearch/form">
    <table>
        <tr>
            <td><label>name of product</label></td>
            <td><input name="productName"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form>

</body>
</html>