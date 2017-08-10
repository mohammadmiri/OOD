<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ include file="../base.jsp" %>

    <%--<div class="container well-lg">--%>
        <%--<div class="row item">--%>
            <%--<div class="col-md-12 container">--%>
                <%--<c:forEach items="${employees}" var="item">--%>
                    <%--<div class="row item well-sm bg-info">--%>
                        <%--<div class="col-md-1 col-md-offset-1 text-center">${item.id}</div>--%>
                        <%--<div class="col-md-1 text-center">${item.username}</div>--%>
                        <%--<div class="col-md-1 text-center">${item.firstName}</div>--%>
                        <%--<div class="col-md-1 text-center">${item.lastName}</div>--%>
                        <%--<div class="col-md-1 text-center">${item.type}</div>--%>
                        <%--<a href="/user/update_employee/${item.id}"><button class="btn btn-primary col-md-1 col-md-offset-1">update</button></a>--%>
                        <%--<a href="/user/delete_employee/${item.id}"><button class="btn btn-danger col-md-1 col-md-offset-1">delete</button></a>--%>
                    <%--</div>--%>
                <%--</c:forEach>--%>
                <%--<div class="row item">--%>
                    <%--<a href="/user/add_employee"><button class="btn btn-primary col-md-1 col-md-offset-1">New</button></a>--%>
                <%--</div>--%>
            <%--</div>--%>
        <%--</div>--%>
    <%--</div>--%>



<div class="panel panel-default margin-large-top">
    <div class="panel-heading text-center text-bold">all employees</div>
    <div class="panel-body">
        <table class="table table-hover table-striped">
            <thead>
            <tr>
                <th class="text-center">id</th>
                <th  class="text-center">username</th>
                <th class="text-center">firstname</th>
                <th class="text-center">lastname</th>
                <th class="text-center">role</th>
                <th class="text-center"></th>
                <th class="text-center"></th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${employees}" var="item">
                <tr>
                    <td class="text-center">${item.id}</td>
                    <td class="text-center">${item.username}</td>
                    <td class="text-center">${item.firstName}</td>
                    <td class="text-center">${item.lastName}</td>
                    <td class="text-center">${item.type}</td>
                    <td class="text-center"><a href="/user/update_employee/${item.id}" class="btn btn-primary">update</a></td>
                    <td class="text-center"><a href="/user/delete_employee/${item.id}" class="btn btn-danger">delete</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        <a href="/user/add_employee" class="btn btn-primary">New</a>
    </div>
</div>