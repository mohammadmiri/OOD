<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<table>
    <c:forEach items="${products}" var="item">
        <div><tr>
            <td style="width: 5cm;">${item.name}</td>
            <td style="width: 4cm;"><a href="/product/add/form/comment/${item.id}">comment</a></td>
            <td style="text-align: right"><a href="">delete</a></td>
        </tr><br></div>
    </c:forEach>
</table>

</body>
</html>