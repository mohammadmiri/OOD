<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../base.jsp" %>

    <%--<div class="container well-lg">--%>
        <%--<div class="row">--%>
            <%--<div class="col-md-offset-3 col-md-6 bg-info main-container img-rounded">--%>
                <%--<form action="/product/submit/add_component_order" class="form-group-sm">--%>

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
                            <%--<div class="text-font pull-right">amount:</div>--%>
                        <%--</div>--%>
                        <%--<div class="col-md-3">--%>
                            <%--<input class="pull-left form-control" type="number" name="amount">--%>
                        <%--</div>--%>
                    <%--</div>--%>

                    <%--<div class="row item">--%>
                        <%--<div class="col-md-offset-3 col-md-3">--%>
                            <%--<div class="text-font pull-right">components:</div>--%>
                        <%--</div>--%>
                        <%--<div class="col-md-3">--%>
                            <%--<c:set var="list" value="${components}" scope="request"/>--%>
                            <%--<c:set var="input_name" value="components" scope="request"/>--%>
                            <%--<jsp:include page="../select_multiple_html.jsp" />--%>
                    <%--</div>--%>
                    <%--</div>--%>

                    <%--<div class="row item">--%>
                        <%--<div class="col-md-offset-3 col-md-3">--%>
                            <%--<div class="text-font pull-right">source:</div>--%>
                        <%--</div>--%>
                        <%--<div class="col-md-3">--%>
                            <%--<c:set var="list" value="${sources}" scope="request"/>--%>
                            <%--<c:set var="input_name" value="source" scope="request"/>--%>
                            <%--<jsp:include page="../select_html.jsp" />--%>
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
    <div class="panel-heading text-center">add comment</div>
    <div class="panel-body padding-large-top">
        <form action="/submit/add_component" method="get">
            <div class="form-group">
                <label for="t1">Date:</label>
                <input type="text" class="form-control" id="t1" name="name">
            </div>
            <div class="form-group">
                <label for="t2">Amount:</label>
                <input type="text" class="form-control" id="t2" name="price">
            </div>
            <div class="form-group">
                <label>Components:</label>
                <c:set var="list" value="${components}" scope="request"/>
                <c:set var="input_name" value="components" scope="request"/>
                <jsp:include page="../select_multiple_html.jsp" />
            </div>
            <div class="form-group">
                <label >Sources:</label>
                <c:set var="list" value="${sources}" scope="request"/>
                <c:set var="input_name" value="source" scope="request"/>
                <jsp:include page="../select_html.jsp" />
            </div>
            <button type="submit" class="btn btn-success">submit</button>
        </form>
    </div>
</div>