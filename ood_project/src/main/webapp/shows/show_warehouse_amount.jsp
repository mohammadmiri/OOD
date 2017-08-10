<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../base.jsp" %>

    <%--<div class="container item">--%>
        <%--{% for warehouse in warehouses %}--%>
            <%--<div class="well-lg bg-info item">--%>
                <%--<div class="row item">--%>
                    <%--<div class="col-md-10 col-md-offset-1 container">--%>
                        <%--<div class="col-md-2">--%>
                            <%--<div class="text-center">id warehouse</div>--%>
                        <%--</div>--%>
                        <%--<div class="col-md-2">--%>
                            <%--<div class="text-center">code warehouse</div>--%>
                        <%--</div>--%>
                        <%--<div class="col-md-2">--%>
                            <%--<div class="text-center">name warehouse</div>--%>
                        <%--</div>--%>
                    <%--</div>--%>
                <%--</div>--%>
                <%--<div class="row item container-fluid">--%>
                    <%--<div class="row item">components:</div>--%>
                    <%--{% for item in items %}--%>
                        <%--<div class="row item well ">--%>
                            <%--<div class="text-center col-md-2">components name</div>--%>
                            <%--<div class="text-center col-md-2">components price</div>--%>
                            <%--<div class="text-center col-md-2">number</div>--%>
                            <%--<button class="btn btn-primary col-md-offset-1 col-md-1">update</button>--%>
                            <%--<button class="btn btn-danger col-md-offset-1 col-md-1">delete</button>--%>
                        <%--</div>--%>
                    <%--{% endfor %}--%>
                <%--</div>--%>
                <%--<div class="row item container-fluid">--%>
                    <%--<div class="row item">products:</div>--%>
                    <%--{% for item in items %}--%>
                        <%--<div class="row item well ">--%>
                            <%--<div class="text-center col-md-2">product name</div>--%>
                            <%--<div class="text-center col-md-2">product price</div>--%>
                            <%--<div class="text-center col-md-2">number</div>--%>
                            <%--<button class="btn btn-primary col-md-offset-1 col-md-1">update</button>--%>
                            <%--<button class="btn btn-danger col-md-offset-1 col-md-1">delete</button>--%>
                        <%--</div>--%>
                    <%--{% endfor %}--%>
                <%--</div>--%>
            <%--</div>--%>
        <%--{% endfor %}--%>
    <%--</div>--%>


<div class="panel panel-default margin-large-top">
    <div class="panel-heading text-center text-bold">all items</div>
    <div class="panel-body">
        <table class="table table-hover table-striped">
            <thead>
            <tr>
                <th class="text-center">id</th>
                <th  class="text-center">amount</th>
                <th class="text-center">min amount</th>
                <th class="text-center">max amount</th>
                <th class="text-center"></th>
                <th class="text-center"></th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${store_data}" var="item">
                <tr>
                    <td class="text-center">${item.id}</td>
                    <td class="text-center">${item.amount}</td>
                    <td class="text-center">${item.min}</td>
                    <td class="text-center">${item.max}</td>
                    <td class="text-center"><a href="/warehouse/update_store_data/${item.id}" class="btn btn-primary">update</a></td>
                    <td class="text-center"><a href="/warehouse/delete_store_data/${item.id}" class="btn btn-danger">delete</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        <a href="/warehouse/add_store_data/${warehouse_id}" class="btn btn-primary">New</a>
    </div>
</div>