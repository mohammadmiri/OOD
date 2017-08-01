<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ include file="../base.jsp" %>

<div class="container well-lg">
    <div class="row item">
        <div class="col-md-10 col-md-offset-1 container">
            <c:forEach items="${warehouses}" var="item">
                <div class="row item well-sm bg-info">
                    <div class="col-md-2 col-md-offset-1 text-center">${item.id}</div>
                    <div class="col-md-2 text-center">${item.code}</div>
                    <div class="col-md-2 text-center">${item.name}</div>
                    <a href="/warehouse/update_warehouse/${item.id}"><button class="btn btn-primary col-md-1 col-md-offset-1">update</button></a>
                    <a href="/warehouse/delete_warehouse/${item.id}"><button class="btn btn-danger col-md-1 col-md-offset-1">delete</button></a>
                </div>
            </c:forEach>
        </div>
    </div>
    <div class="row item">
        <a href="/warehouse/add_warehouse"><button class="btn btn-primary col-md-1 col-md-offset-1">New</button></a>
    </div>
</div>