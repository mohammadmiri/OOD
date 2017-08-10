<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ include file="../base.jsp" %>

<%--<div class="container well-lg">--%>
    <%--<div class="row item">--%>
        <%--<div class="col-md-12  container">--%>
            <%--<c:forEach items="${warehouses}" var="item">--%>
                <%--<div class="row item well-sm bg-info">--%>
                    <%--<div class="col-md-2 text-center">${item.id}</div>--%>
                    <%--<div class="col-md-2 text-center">${item.code}</div>--%>
                    <%--<div class="col-md-2 text-center">${item.name}</div>--%>
                    <%--<a href="/warehouse/update_warehouse/${item.id}"><button class="btn btn-primary">update</button></a>--%>
                    <%--<a href="/warehouse/delete_warehouse/${item.id}"><button class="btn btn-danger">delete</button></a>--%>
                    <%--<a href="/warehouse/show_existing_products/${item.id}"><button class="btn btn-primary col-md-2">showProducts</button></a>--%>
                <%--</div>--%>
            <%--</c:forEach>--%>
        <%--</div>--%>
    <%--</div>--%>
    <%--<div class="row item">--%>
        <%--<a href="/warehouse/add_warehouse"><button class="btn btn-primary col-md-1 col-md-offset-1">New</button></a>--%>
    <%--</div>--%>
<%--</div>--%>

<div class="panel panel-default margin-large-top">
    <div class="panel-heading text-center text-bold">all warehouses</div>
    <div class="panel-body">
        <table class="table table-hover table-striped">
            <thead>
            <tr>
                <th class="text-center">id</th>
                <th  class="text-center">name</th>
                <th class="text-center">code</th>
                <th class="text-center"></th>
                <th class="text-center"></th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${warehouses}" var="item">
                <tr>
                    <td class="text-center">${item.id}</td>
                    <td class="text-center">${item.name}</td>
                    <td class="text-center">${item.code}</td>
                    <td class="text-center"><a href="/warehouse/update_warehouse/${item.id}" class="btn btn-primary">update</a></td>
                    <td class="text-center"><a href="/warehouse/delete_warehouse/${item.id}" class="btn btn-danger">delete</a></td>
                    <td class="text-center"><a href="/warehouse/show_store_data/${item.id}" class="btn btn-info">show items</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        <a href="/warehouse/add_warehouse" class="btn btn-primary">New</a>
    </div>
</div>
