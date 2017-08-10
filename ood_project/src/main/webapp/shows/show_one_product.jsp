<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ include file="../base.jsp" %>

<%--<div class="container">--%>
    <%--<div class="row well-lg container bg-success item">--%>
        <%--<div class="row item">--%>
            <%--<div class="text-font col-md-2 col-md-offset-1 text-right">Name:</div>--%>
            <%--<div class="text-font col-md-1 text-left">productName</div>--%>
        <%--</div>--%>
        <%--<div class="row item">--%>
            <%--<div class="text-font col-md-2 col-md-offset-1 text-right">Price:</div>--%>
            <%--<div class="text-font col-md-1 text-left">productPrice</div>--%>
        <%--</div>--%>
        <%--<div class="row item">--%>
            <%--<div class="text-font col-md-2 col-md-offset-1 text-right">Description:</div>--%>
            <%--<div class="text-font col-md-1 text-left">productDescription</div>--%>
        <%--</div>--%>
        <%--<div class="row item">--%>
            <%--<div class="text-font col-md-2 col-md-offset-1 text-right">ProductionSteps:</div>--%>
            <%--<div class="text-font col-md-1 text-left">productionSteps</div>--%>
        <%--</div>--%>
    <%--</div>--%>
    <%--<div class="row container well-lg bg-info item">--%>
        <%--<div class="row">Comments:</div>--%>
        <%--<c:forEach items="${comments}" var="comment">--%>
            <%--<div class="row item well">${comment.message}</div>--%>
        <%--</c:forEach>--%>
    <%--</div>--%>
    <%--<div class="row container well item">--%>
        <%--<form action="/product/submit/add_comment/${product.id}">--%>
            <%--<div class="row item">--%>
                <%--<div class="col-md-1 text-right">Name:</div>--%>
                <%--<div class="col-md-8">--%>
                    <%--<input class="form-control" type="text" name="name">--%>
                <%--</div>--%>
            <%--</div>--%>
            <%--<div class="row item">--%>
                <%--<div class="col-md-1 text-right">Comment:</div>--%>
                <%--<div class="col-md-8">--%>
                    <%--<input class="form-control" type="text" name="message">--%>
                <%--</div>--%>
            <%--</div>--%>
            <%--<div class="row item">--%>
                <%--<button class="btn btn-primary col-md-offset-1">submit</button>--%>
            <%--</div>--%>
        <%--</form>--%>
    <%--</div>--%>
<%--</div>--%>



<div class="panel panel-default margin-large-top">
    <div class="panel-heading text-center text-bold">product</div>
    <div class="panel-body">
        <table class="table table-hover table-striped">
            <thead>
            <tr>
                <th class="text-center">title</th>
                <th class="text-center">value</th>
            </tr>
            </thead>
            <tbody>
                <tr>
                    <td class="text-center">id:</td>
                    <td class="text-center">${product.id}</td>
                </tr>
                <tr>
                    <td class="text-center">name:</td>
                    <td class="text-center">${product.name}</td>
                </tr>
                <tr>
                    <td class="text-center">price:</td>
                    <td class="text-center">${product.price}</td>
                </tr>
                <tr>
                    <td class="text-center">description:</td>
                    <td class="text-center">${product.description}</td>
                </tr>
                <tr>
                    <td class="text-center">default supply chain:</td>
                    <td class="text-center">${product.defaultSupplyChain.toString()}</td>
                </tr>
                <tr>
                    <td class="text-center">supply chains:</td>
                    <td class="text-center">
                        <c:forEach items="${product.supplyChains.toString()}" var="item">
                            <p>${item.toString()}</p>
                        </c:forEach>
                    </td>
                </tr>
                <tr>
                    <td class="text-center">default sale chain:</td>
                    <td class="text-center">${product.defaultSaleChain.toString()}</td>
                </tr>
                <tr>
                    <td class="text-center">sale chains:</td>
                    <td class="text-center">
                        <c:forEach items="${product.saleChains.toString()}" var="item">
                            <p>${item}</p>
                        </c:forEach>
                    </td>
                </tr>
            </tbody>
        </table>
    </div>
</div>


<div class="panel panel-default margin-large-top">
    <div class="panel-heading text-center text-bold">comments:</div>
    <div class="panel-body">
        <table class="table">
            <c:forEach items="${product.comments}" var="comment">
                <tr>
                    <td>${comment.message}</td>
                </tr>
            </c:forEach>
        </table>
    <hr/>
    <form action="/product/submit/add_comment/${product.id}">
        <div class="col-md-8">
            <input class="form-control" type="text" name="message" placeholder="write comment">
        </div>
        <div class="">
            <button class="btn btn-primary col-md-offset-1">submit</button>
        </div>
    </form>
</div>







