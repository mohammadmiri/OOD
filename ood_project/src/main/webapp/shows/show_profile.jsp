<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ include file="../base.jsp" %>

    <%--<div class="container well-lg">--%>
        <%--<div class="row">--%>
            <%--<div class="col-md-offset-3 col-md-6 bg-info main-container img-rounded">--%>
                <%--<div class="row item">--%>
                    <%--<div class="col-md-offset-3 col-md-3">--%>
                        <%--<div class="text-font pull-right">Username:</div>--%>
                    <%--</div>--%>
                    <%--<div class="col-md-3">--%>
                        <%--<div class="">${customer.username}</div>--%>
                    <%--</div>--%>
                <%--</div>--%>
                <%--<div class="row item">--%>
                    <%--<div class="col-md-offset-3 col-md-3">--%>
                        <%--<div class="text-font pull-right">FirstName:</div>--%>
                    <%--</div>--%>
                    <%--<div class="col-md-3">--%>
                        <%--<div class="">${customer.firstName}</div>--%>
                    <%--</div>--%>
                <%--</div>--%>
                <%--<div class="row item">--%>
                    <%--<div class="col-md-offset-3 col-md-3">--%>
                        <%--<div class="text-font pull-right">Lastname:</div>--%>
                    <%--</div>--%>
                    <%--<div class="col-md-3">--%>
                        <%--<div class="last name">${customer.lastName}</div>--%>
                    <%--</div>--%>
                <%--</div>--%>
                <%--<div class="row item">--%>
                    <%--<button type="submit" class="btn btn-success col-md-offset-5">submit</button>--%>
                <%--</div>--%>
            <%--</div>--%>
        <%--</div>--%>

        <%--&lt;%&ndash;    show   orders  &ndash;%&gt;--%>
        <%--<div class="panel panel-default">--%>
            <%--<div class="panel-heading">Orders:</div>--%>
            <%--<div class="panel-body">--%>
                <%--<div class="row item">--%>
                    <%--<div class="col-md-10 col-md-offset-1 container">--%>
                        <%--<c:forEach items="${orders}" var="item">--%>
                            <%--<div class="row item well-sm bg-info">--%>
                                <%--<div class="col-md-1 col-md-offset-1 text-center">${item.id}</div>--%>
                                <%--<div class="col-md-1 col-md-offset-1 text-center">${item.totalCost}</div>--%>
                                <%--<c:forEach items="${item.products}" var="product">--%>
                                    <%--<p>${product.name}</p>--%>
                                <%--</c:forEach>--%>
                                <%--<a href="/product/delete_product_order/${item.id}"><button class="btn btn-danger col-md-1 col-md-offset-1">delete</button></a>--%>
                                <%--<a href="/product/update_product_order/${item.id}"><button class="btn btn-primary col-md-1 col-md-offset-1">update</button> </a>--%>
                            <%--</div>--%>
                        <%--</c:forEach>--%>
                        <%--<div class="row item">--%>
                            <%--<a href="/product/add_product_order"><button class="btn btn-primary col-md-1 col-md-offset-1">New</button></a>--%>
                        <%--</div>--%>
                    <%--</div>--%>
                <%--</div>--%>
            <%--</div>--%>
        <%--</div>--%>

    <%--</div>--%>



<div class="panel panel-default margin-large-top">
    <div class="panel-heading text-center text-bold">profile</div>
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
                    <td class="text-center">username:</td>
                    <td class="text-center">${customer.username}</td>
                </tr>
                <tr>
                    <td class="text-center">password:</td>
                    <td class="text-center">${customer.password}</td>
                </tr>
                <tr>
                    <td class="text-center">first name:</td>
                    <td class="text-center">${customer.firstName}</td>
                </tr>
                <tr>
                    <td class="text-center">lastName:</td>
                    <td class="text-center">${customer.lastName}</td>
                </tr>
                <tr>
                    <td class="text-center"></td>
                    <td class="text-center"><a href="/user/update_profile/${customer.id}" class="btn btn-primary">edit</a></td>
                </tr>
                </tbody>
            </table>
        </form>
    </div>
</div>


<div class="panel panel-default margin-large-top">
    <div class="panel-heading text-center text-bold">Orders</div>
    <div class="panel-body">
        <c:forEach items="${orders}" var="item">
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
                    <td class="text-center">${item.id}</td>
                </tr>
                <tr>
                    <td class="text-center">total cost:</td>
                    <td class="text-center">${item.totalCost}</td>
                </tr>
                <tr>
                    <td class="text-center">date:</td>
                    <td class="text-center">${item.date}</td>
                </tr>
                <tr>
                    <td class="text-center">requirement:</td>
                    <td class="text-center">${item.requirements}</td>
                </tr>
                <tr>
                    <td class="text-center">products:</td>
                    <td class="text-center">
                        <c:forEach items="${item.products}" var="product">
                            <p>${product.toString()}</p>
                        </c:forEach>
                    </td>
                </tr>
                <tr>
                    <td class="text-center"></td>
                    <td class="text-center"><a class="btn btn-primary" href="/product/update_product_order/${item.id}">edit</a></td>
                </tr>
                </tbody>
            </table>
        </c:forEach>
        <a href="/product/add_product_order" class="btn btn-primary">New</a>
    </div>
</div>