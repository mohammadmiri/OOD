<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<form method="POST" action="/product/submit/add/form/productOrder">
    <table>
        <tr>
            <td><label>total cost</label></td>
            <td><input name="totalCost"/></td>
        </tr>
        <tr>
            <td><label>date</label></td>
            <td><input name="date"/></td>
        </tr>
        <tr>
            <td><label>products</label></td>
            <td><input name="products"/></td>
        </tr>
        <tr>
            <td><label>requirement</label></td>
            <td><input name="requirements"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form>

</body>
</html>















