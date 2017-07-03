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
            <td style="width: 5cm;">${item.price}</td>
        </tr><br></div>
    </c:forEach>
</table>

</body>
</html>