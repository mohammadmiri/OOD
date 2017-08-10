<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ include file="../base.jsp" %>

<%--<div class="container well-lg">--%>
    <%--<div class="row item">--%>
        <%--<div class="col-md-10 col-md-offset-1 container">--%>
            <%--<c:forEach items="${componentOrders}" var="item">--%>
                <%--<div class="row item well-sm bg-info">--%>
                    <%--<div class="col-md-2 col-md-offset-1 text-center">${item.id}</div>--%>
                    <%--<div class="col-md-1 text-center">${item.totalCost}</div>--%>
                    <%--<div class="col-md-1 text-center">${item.amount}</div>--%>
                    <%--<div class="col-md-1 text-center">${item.source.name}</div>--%>
                    <%--<a href="/product/update_component_order/${item.id}"><button class="btn btn-primary col-md-1 col-md-offset-1">update</button></a>--%>
                    <%--<a href="/product/delete_component_order/${item.id}"><button class="btn btn-danger col-md-1 col-md-offset-1">delete</button></a>--%>
                <%--</div>--%>
            <%--</c:forEach>--%>
        <%--</div>--%>
    <%--</div>--%>
    <%--<div class="row item">--%>
        <%--<a href="/product/add_component_order"><button class="btn btn-primary col-md-1 col-md-offset-1">New</button></a>--%>
    <%--</div>--%>
<%--</div>--%>


<div class="panel panel-default margin-large-top">
    <div class="panel-heading text-center text-bold">all components orders</div>
    <div class="panel-body">
        <table class="table table-hover table-striped">
            <thead>
            <tr>
                <th class="text-center">id</th>
                <th  class="text-center">total cost</th>
                <th class="text-center">amount</th>
                <th class="text-center">source name</th>
                <th class="text-center"></th>
                <th class="text-center"></th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${componentOrders}" var="item">
                <tr>
                    <td class="text-center">${item.id}</td>
                    <td class="text-center">${item.totalCost}</td>
                    <td class="text-center">${item.amount}</td>
                    <td class="text-center">${item.source.name}</td>
                    <td class="text-center"><a href="/product/update_component_order/${item.id}" class="btn btn-primary">update</a></td>
                    <td class="text-center"><a href="/product/delete_component_order/${item.id}" class="btn btn-danger">delete</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        <a href="/product/add_component_order" class="btn btn-primary">New</a>
    </div>
</div>
