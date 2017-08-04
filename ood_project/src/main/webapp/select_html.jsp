<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<select name="${requestScope.input_name}" id="${requestScope.id_name}" class="form-control">
    <c:forEach var="item" items="${requestScope.list}">
        <c:if test="${item.id==active.id}">
            <option selected value="${item.id}">${item.toString()}</option>
        </c:if>
        <c:if test="${item.id!=active.id}">
            <option value="${item.id}">${item.toString()}</option>
        </c:if>
    </c:forEach>
</select>
