<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ include file="../base.jsp" %>

<div class="container">
    <div class="row well-lg container bg-success item">
        <div class="row item">
            <div class="text-font col-md-2 col-md-offset-1 text-right">Name:</div>
            <div class="text-font col-md-1 text-left">productName</div>
        </div>
        <div class="row item">
            <div class="text-font col-md-2 col-md-offset-1 text-right">Price:</div>
            <div class="text-font col-md-1 text-left">productPrice</div>
        </div>
        <div class="row item">
            <div class="text-font col-md-2 col-md-offset-1 text-right">Description:</div>
            <div class="text-font col-md-1 text-left">productDescription</div>
        </div>
        <div class="row item">
            <div class="text-font col-md-2 col-md-offset-1 text-right">ProductionSteps:</div>
            <div class="text-font col-md-1 text-left">productionSteps</div>
        </div>
    </div>
    <div class="row container well-lg bg-info item">
        <div class="row">Comments:</div>
        <c:forEach items="${comments}" var="comment">
            <div class="row item well">${comment.message}</div>
        </c:forEach>
    </div>
    <div class="row container well item">
        <form action="/product/submit/add_comment/${product.id}">
            <div class="row item">
                <div class="col-md-1 text-right">Name:</div>
                <div class="col-md-8">
                    <input class="form-control" type="text" name="name">
                </div>
            </div>
            <div class="row item">
                <div class="col-md-1 text-right">Comment:</div>
                <div class="col-md-8">
                    <input class="form-control" type="text" name="message">
                </div>
            </div>
            <div class="row item">
                <button class="btn btn-primary col-md-offset-1">submit</button>
            </div>
        </form>
    </div>
</div>