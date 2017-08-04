<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../base.jsp" %>

    <%--<div class="container well-lg">--%>
        <%--<div class="row">--%>
            <%--<div class="col-md-offset-3 col-md-6 bg-info main-container img-rounded">--%>
                <%--<form action="/warehouse/submit/update_store_data/${store_data_id}" class="form-group-sm">--%>
                    <%--<div class="row">--%>
                        <%--<div class="col-md-3">--%>
                            <%--<input class="pull-left form-control" type="hidden" value="{{ id }}">--%>
                        <%--</div>--%>
                    <%--</div>--%>
                    <%--<div class="row item">--%>
                        <%--<div class="col-md-offset-3 col-md-3">--%>
                            <%--<div class="text-font pull-right">product:</div>--%>
                        <%--</div>--%>
                        <%--<div class="col-md-3">--%>
                            <%--<input class="pull-left form-control" type="text" name="product">--%>
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
                            <%--<div class="text-font pull-right">min amount:</div>--%>
                        <%--</div>--%>
                        <%--<div class="col-md-3">--%>
                            <%--<input class="pull-left form-control" type="number" name="minAmount">--%>
                        <%--</div>--%>
                    <%--</div>--%>
                    <%--<div class="row item">--%>
                        <%--<div class="col-md-offset-3 col-md-3">--%>
                            <%--<div class="text-font pull-right">max amount:</div>--%>
                        <%--</div>--%>
                        <%--<div class="col-md-3">--%>
                            <%--<input class="pull-left form-control" type="number" name="maxAmount">--%>
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
    <div class="panel-heading text-center">update store data</div>
    <div class="panel-body padding-large-top">
        <form action="/warehouse/submit/update_store_data/${store_data.id}" method="get">
            <div class="form-group">
                <label>Product:</label>
                <c:set var="list" value="${products}" scope="request"/>
                <c:set var="input_name" value="product" scope="request"/>
                <c:set var="selected_item" value="${store_data.storable}" scope="request"/>
                <jsp:include page="../select_html.jsp" />
            </div>
            <div class="form-group">
                <label>Amount:</label>
                <input type="text" class="form-control" name="amount" ${store_data.amount}>
            </div>
            <div class="form-group">
                <label>Min Amount:</label>
                <input type="text" class="form-control" name="minAmount" ${store_data.min}>
            </div>
            <div class="form-group">
                <label>Max Amount:</label>
                <input type="text" class="form-control" name="maxAmount" ${store_data.max}>
            </div>
            <button type="submit" class="btn btn-success">submit</button>
        </form>
    </div>
</div>