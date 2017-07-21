<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ include file="../base.jsp" %>

    <div class="container well-lg">
        <div class="row item">
            <div class="col-md-12 container">
                <c:forEach items="${employees}" var="item">
                    <div class="row item well-sm bg-info">
                        <div class="col-md-1 col-md-offset-1 text-center">${item.id}</div>
                        <div class="col-md-1 text-center">${item.username}</div>
                        <div class="col-md-1 text-center">${item.firstName}</div>
                        <div class="col-md-1 text-center">${item.lastName}</div>
                        <div class="col-md-1 text-center">${item.role}</div>
                        <a href="/user/update_employee/${item.id}"><button class="btn btn-primary col-md-1 col-md-offset-1">update</button></a>
                        <a href="/user/delete_employee/${item.id}"><button class="btn btn-danger col-md-1 col-md-offset-1">delete</button></a>
                    </div>
                </c:forEach>
                <div class="row item">
                    <a href="/user/add_employee"><button class="btn btn-primary col-md-1 col-md-offset-1">New</button></a>
                </div>
            </div>
        </div>
    </div>

