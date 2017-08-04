<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<%@ include file="../base.jsp" %>

<%--<div class="container well-lg">--%>
    <%--<div class="row item">--%>
        <%--<div class="col-md-10 col-md-offset-1 container">--%>
            <%--<c:forEach items="${supply_paths}" var="item">--%>
                <%--<div class="row item well-sm bg-info">--%>
                    <%--<div class="col-md-2 col-md-offset-1 text-center">${item.id}</div>--%>
                    <%--<div class="col-md-2 text-center">${item.time}</div>--%>
                    <%--<div class="col-md-2 text-center">${item.cost}</div>--%>
                    <%--<a href="/path/update_supply_path/${item.id}"><button class="btn btn-primary col-md-1 col-md-offset-1">update</button></a>--%>
                    <%--<a href="/path/delete_supply_path/${item.id}"><button class="btn btn-danger col-md-1 col-md-offset-1">delete</button></a>--%>
                <%--</div>--%>
            <%--</c:forEach>--%>
            <%--<div class="row item">--%>
                <%--<a href="/path/add_supply_path"><button class="btn btn-primary col-md-1 col-md-offset-1">New</button></a>--%>
            <%--</div>--%>
        <%--</div>--%>
    <%--</div>--%>
<%--</div>--%>


<div class="panel panel-default margin-large-top">
    <div class="panel-heading text-center text-bold">all supply chains</div>
    <div class="panel-body">
        <table class="table table-hover table-striped">
            <thead>
            <tr>
                <th class="text-center">id</th>
                <th  class="text-center">time</th>
                <th class="text-center">cost</th>
                <th class="text-center"></th>
                <th class="text-center"></th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${supply_paths}" var="item">
                <tr>
                    <td class="text-center">${item.id}</td>
                    <td class="text-center">${item.time}</td>
                    <td class="text-center">${item.cost}</td>
                    <td class="text-center"><a href="/path/update_supply_path/${item.id}" class="btn btn-primary">update</a></td>
                    <td class="text-center"><a href="/path/delete_supply_path/${item.id}" class="btn btn-danger">delete</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        <a href="/path/add_supply_path" class="btn btn-primary">New</a>
    </div>
</div>
