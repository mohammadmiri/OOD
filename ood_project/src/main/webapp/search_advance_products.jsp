<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<%@ include file="base.jsp" %>


<%--<div class="container well-lg">--%>
    <%--<div class="row item well">--%>
        <%--<div class="col-md-2 text-right">--%>
            <%--<div class="text-font"><h4>Search:</h4></div>--%>
        <%--</div>--%>
        <%--<div class="col-md-10">--%>
            <%--<form action="#" class="form-group-lg">--%>
                <%--<input class="form-control" type="text">--%>
            <%--</form>--%>
        <%--</div>--%>
    <%--</div>--%>
    <%--<div class="row item">--%>
        <%--<div class="col-md-10 col-md-offset-1 container">--%>
            <%--{% for item in items %}--%>
                <%--<div class="row">--%>
                    <%--<a href="#"><div class="bg-info col-md-6 col-md-offset-3 item well-sm text-center">{{ item }}</div></a>--%>
                <%--</div>--%>
            <%--{% endfor %}--%>
        <%--</div>--%>
    <%--</div>--%>
<%--</div>--%>



<div class="panel panel-default margin-large-top">
    <div class="panel-heading text-center text-bold">all products</div>
    <div class="panel-body">
        <div class="well">
            <form action="/product/submit/advance_search" class="clearfix">
                <div class="form-group">
                    <label>search:</label>
                    <input class="form-control" type="text" placeholder="enter product name" name="productName">
                </div>
                <button type="submit" class="btn btn-primary pull-right">submit</button>
            </form>
        </div>
        <table class="table table-hover table-striped">
            <thead>
            <tr>
                <th class="text-center">id</th>
                <th  class="text-center">name</th>
                <th class="text-center">price</th>
                <th class="text-center"></th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${products}" var="item">
                <tr>
                    <td class="text-center">${item.id}</td>
                    <td class="text-center"><a href="/product/show_one_product/${item.id}">${item.name}</a></td>
                    <td class="text-center">${item.price}</td>
                    <td class="text-center"><a href="/product/show_one_product/${item.id}" class="btn btn-primary">details</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>