<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../base.jsp" %>

    <%--<div class="container well-lg">--%>
        <%--<div class="row">--%>
            <%--<div class="col-md-offset-3 col-md-6 bg-info main-container img-rounded">--%>
                <%--<form action="/product/submit/add_product" class="form-group-sm">--%>

                    <%--<div class="row item">--%>
                        <%--<div class="col-md-offset-3 col-md-3">--%>
                            <%--<div class="text-font pull-right">Name:</div>--%>
                        <%--</div>--%>
                        <%--<div class="col-md-3">--%>
                            <%--<input class="pull-left form-control" type="text" name="name">--%>
                        <%--</div>--%>
                    <%--</div>--%>

                    <%--<div class="row item">--%>
                        <%--<div class="col-md-offset-3 col-md-3">--%>
                            <%--<div class="text-font pull-right">Price:</div>--%>
                        <%--</div>--%>
                        <%--<div class="col-md-3">--%>
                            <%--<input class="pull-left form-control" type="text" name="price">--%>
                        <%--</div>--%>
                    <%--</div>--%>

                    <%--<div class="row item">--%>
                        <%--<div class="col-md-offset-3 col-md-3">--%>
                            <%--<div class="text-font pull-right">Description:</div>--%>
                        <%--</div>--%>
                        <%--<div class="col-md-3">--%>
                            <%--<input class="pull-left form-control" type="text" name="description">--%>
                        <%--</div>--%>
                    <%--</div>--%>

                    <%--<div class="row item">--%>
                        <%--<div class="col-md-offset-3 col-md-3">--%>
                            <%--<div class="text-font pull-right">default supply chain:</div>--%>
                        <%--</div>--%>
                        <%--<div class="col-md-3">--%>
                            <%--<c:set var="list" value="${supplyChains}" scope="request"/>--%>
                            <%--<c:set var="input_name" value="default_supplyChain" scope="request"/>--%>
                            <%--<jsp:include page="../select_html.jsp" />--%>
                        <%--</div>--%>
                    <%--</div>--%>

                    <%--<div class="row item">--%>
                        <%--<div class="col-md-offset-3 col-md-3">--%>
                            <%--<div class="text-font pull-right">supplychains:</div>--%>
                        <%--</div>--%>
                        <%--<div class="col-md-3">--%>
                            <%--<c:set var="list" value="${supplyChains}" scope="request"/>--%>
                            <%--<c:set var="input_name" value="supplyChains" scope="request"/>--%>
                            <%--<jsp:include page="../select_multiple_html.jsp" />--%>
                        <%--</div>--%>
                    <%--</div>--%>

                    <%--<div class="row item">--%>
                        <%--<div class="col-md-offset-3 col-md-3">--%>
                            <%--<div class="text-font pull-right">defualt salechains:</div>--%>
                        <%--</div>--%>
                        <%--<div class="col-md-3">--%>
                            <%--<c:set var="list" value="${saleChains}" scope="request"/>--%>
                            <%--<c:set var="input_name" value="default_saleChain" scope="request"/>--%>
                            <%--<jsp:include page="../select_html.jsp" />--%>
                        <%--</div>--%>
                    <%--</div>--%>

                    <%--<div class="row item">--%>
                        <%--<div class="col-md-offset-3 col-md-3">--%>
                            <%--<div class="text-font pull-right">salechains:</div>--%>
                        <%--</div>--%>
                        <%--<div class="col-md-3">--%>
                            <%--<c:set var="list" value="${saleChains}" scope="request"/>--%>
                            <%--<c:set var="input_name" value="saleChains" scope="request"/>--%>
                            <%--<jsp:include page="../select_multiple_html.jsp" />--%>
                        <%--</div>--%>
                    <%--</div>--%>

                    <%--<div class="row item">--%>
                        <%--<div class="col-md-offset-3 col-md-3">--%>
                            <%--<div class="text-font pull-right">productionSteps:</div>--%>
                        <%--</div>--%>
                        <%--<div class="col-md-3">--%>
                            <%--<c:set var="list" value="${productionSteps}" scope="request"/>--%>
                            <%--<c:set var="input_name" value="productionSteps" scope="request"/>--%>
                            <%--<jsp:include page="../select_multiple_html.jsp" />--%>
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
        <form action="/product/submit/add_product" method="get">
            <div class="form-group">
                <label>Name:</label>
                <input type="text" class="form-control" name="name">
            </div>
            <div class="form-group">
                <label>Price:</label>
                <input type="text" class="form-control" name="price">
            </div>
            <div class="form-group">
                <label>Description:</label>
                <input type="text" class="form-control" name="description">
            </div>
            <div class="form-group">
                <label>Default Supply Chain:</label>
                <c:set var="list" value="${supplyChains}" scope="request"/>
                <c:set var="input_name" value="default_supplyChain" scope="request"/>
                <jsp:include page="../select_html.jsp" />
            </div>
            <div class="form-group">
                <label>Supply Chains:</label>
                <c:set var="list" value="${supplyChains}" scope="request"/>
                <c:set var="input_name" value="supplyChains" scope="request"/>
                <jsp:include page="../select_multiple_html.jsp" />
            </div>
            <div class="form-group">
                <label>Default Sale Chain:</label>
                <c:set var="list" value="${saleChains}" scope="request"/>
                <c:set var="input_name" value="default_saleChain" scope="request"/>
                <jsp:include page="../select_html.jsp" />
            </div>
            <div class="form-group">
                <label>Sale Chains:</label>
                <c:set var="list" value="${saleChains}" scope="request"/>
                <c:set var="input_name" value="saleChains" scope="request"/>
                <jsp:include page="../select_multiple_html.jsp" />
            </div>
            <div class="form-group">
                <label>Production Steps:</label>
                <c:set var="list" value="${productionSteps}" scope="request"/>
                <c:set var="input_name" value="productionSteps" scope="request"/>
                <jsp:include page="../select_multiple_html.jsp" />
            </div>
            <button type="submit" class="btn btn-success">submit</button>
        </form>
    </div>
</div>