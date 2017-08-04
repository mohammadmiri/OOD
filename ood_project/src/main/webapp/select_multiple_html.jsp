<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<% Boolean is_selected = false; %>
<select name="${requestScope.input_name}" multiple="true" class="form-control">
    <c:forEach var="item" items="${requestScope.list}">
        <c:forEach var="item_selected" items="${requestScope.selected_list}">
            <c:if test="${item.id==item_selected.id}">
                <% is_selected = true; %>
                <option selected value="${item.id}">${item.toString()}</option>
            </c:if>
        </c:forEach>
        <% if(is_selected == false){ %>
            <option value=${item.id}>${item.toString()}</option>
        <% }
        else{ is_selected = false; } %>
    </c:forEach>
</select>
