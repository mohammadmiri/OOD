<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../base.jsp" %>


    <%--<div class="container well-lg">--%>
        <%--<div class="row">--%>
            <%--<div class="col-md-offset-3 col-md-6 bg-info main-container img-rounded">--%>
                <%--<form action="/product/submit/add_product_order" class="form-group-sm">--%>
                    <%--<div class="row item">--%>
                        <%--<div class="col-md-offset-3 col-md-3">--%>
                            <%--<div class="text-font pull-right">TotalCost:</div>--%>
                        <%--</div>--%>
                        <%--<div class="col-md-3">--%>
                            <%--<input class="pull-left form-control" type="text" name="totalCost">--%>
                        <%--</div>--%>
                    <%--</div>--%>
                    <%--<div class="row item">--%>
                        <%--<div class="col-md-offset-3 col-md-3">--%>
                            <%--<div class="text-font pull-right">Date:</div>--%>
                        <%--</div>--%>
                        <%--<div class="col-md-3">--%>
                            <%--<input class="pull-left form-control" type="text" name="date">--%>
                        <%--</div>--%>
                    <%--</div>--%>
                    <%--<div class="row item">--%>
                        <%--<div class="col-md-offset-3 col-md-3">--%>
                            <%--<div class="text-font pull-right">Products:</div>--%>
                        <%--</div>--%>
                        <%--<div class="col-md-3">--%>
                            <%--<c:set var="list" value="${products}" scope="request"/>--%>
                            <%--<c:set var="input_name" value="products" scope="request"/>--%>
                            <%--<jsp:include page="../select_multiple_html.jsp" />--%>
                        <%--</div>--%>
                    <%--</div>--%>
                    <%--<div class="row item">--%>
                        <%--<div class="col-md-offset-3 col-md-3">--%>
                            <%--<div class="text-font pull-right">Requirements:</div>--%>
                        <%--</div>--%>
                        <%--<div class="col-md-3">--%>
                            <%--<input class="pull-left form-control" type="text" name="requirements">--%>
                        <%--</div>--%>
                    <%--</div>--%>
                    <%--<div class="row item">--%>
                        <%--<button type="submit" class="btn btn-success col-md-offset-5">submit</button>--%>
                    <%--</div>--%>
                <%--</form>--%>
            <%--</div>--%>
        <%--</div>--%>
    <%--</div>--%>


<div class="panel panel-default text-bold margin-large-top">
    <div class="panel-heading text-center">add product order</div>
    <div class="panel-body padding-large-top">
        <form action="/product/submit/add_product_order" method="get">
            <div class="form-group">
                <label>Date:</label>
                <input type="text" class="form-control" name="date">
            </div>
            <div class="form-group">
                <label>Products:</label>
                <c:set var="list" value="${products}" scope="request"/>
                <c:set var="input_name" value="products" scope="request"/>
                <jsp:include page="../select_multiple_html.jsp" />
            </div>
            <div class="form-group">
                <label>Requirement:</label>
                <input type="text" class="form-control" name="requirements">
            </div>
            <button type="submit" class="btn btn-success">submit</button>
        </form>
    </div>
</div>