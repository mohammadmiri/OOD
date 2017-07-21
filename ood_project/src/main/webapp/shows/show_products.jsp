<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ include file="../base.jsp" %>

    <div class="container well-lg">
        <div class="row item">
            <div class="col-md-10 col-md-offset-1 container">
                <c:forEach items="${products}" var="item" >
                    <div class="row item well-sm bg-info">
                        <a href="/product/show_one_product/${item.id}"><div class="col-md-2 col-md-offset-1 text-center">${item.name}</div></a>
                        <div class="col-md-2 col-md-offset-2 text-center">${item.price}</div>
                        <a href="/product/update_product/${item.id}"><button class="btn btn-danger col-md-1 col-md-offset-1">update</button></a>
                        <a href="/product/delete_product/${item.id}"><button class="btn btn-danger col-md-1 col-md-offset-1">delete</button></a>
                    </div>
                </c:forEach>
                <div class="row item">
                    <a href="/product/add_product"><button class="btn btn-primary col-md-1 col-md-offset-1">New</button></a>
                </div>
            </div>
        </div>
    </div>
