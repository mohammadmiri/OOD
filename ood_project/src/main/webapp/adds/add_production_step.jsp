<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../base.jsp" %>

    <%--<div class="container well-lg">--%>
        <%--<div class="row">--%>
            <%--<div class="col-md-offset-3 col-md-6 bg-info main-container img-rounded">--%>
                <%--<form action="/product/submit/add_production_step" class="form-group-sm">--%>
                    <%--<div class="row item">--%>
                        <%--<div class="col-md-offset-3 col-md-3">--%>
                            <%--<div class="text-font pull-right">Cost:</div>--%>
                        <%--</div>--%>
                        <%--<div class="col-md-3">--%>
                            <%--<input class="pull-left form-control" type="number" name="cost">--%>
                        <%--</div>--%>
                    <%--</div>--%>
                    <%--<div class="row item">--%>
                        <%--<div class="col-md-offset-3 col-md-3">--%>
                            <%--<div class="text-font pull-right">PreCondition:</div>--%>
                        <%--</div>--%>
                        <%--<div class="col-md-3">--%>
                            <%--<input class="pull-left form-control" type="text" name="preCondition">--%>
                        <%--</div>--%>
                    <%--</div>--%>
                    <%--<div class="row item">--%>
                        <%--<div class="col-md-offset-3 col-md-3">--%>
                            <%--<div class="text-font pull-right">PostCondition:</div>--%>
                        <%--</div>--%>
                        <%--<div class="col-md-3">--%>
                            <%--<input class="pull-left form-control" type="text" name="postCondition">--%>
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
    <div class="panel-heading text-center">add production step</div>
    <div class="panel-body padding-large-top">
        <form action="/product/submit/add_production_step" method="get">
            <div class="form-group">
                <label>Cost:</label>
                <input type="text" class="form-control" name="cost">
            </div>
            <div class="form-group">
                <label>PreCondition:</label>
                <input type="text" class="form-control" name="preCondition">
            </div>
            <div class="form-group">
                <label>PostCondition:</label>
                <input type="text" class="form-control" name="postCondition">
            </div>
            <div class="form-group">
                <label>suggestions:</label>
                <input type="text" class="form-control" name="suggestion">
            </div>
            <div class="form-group">
                <label>Inputs:</label>
                <c:set var="list" value="${storables}" scope="request"/>
                <c:set var="input_name" value="inputs" scope="request"/>
                <jsp:include page="../select_multiple_html.jsp" />
            </div>
            <div class="form-group">
                <label>Outputs:</label>
                <c:set var="list" value="${storables}" scope="request"/>
                <c:set var="input_name" value="outputs" scope="request"/>
                <jsp:include page="../select_multiple_html.jsp" />
            </div>
            <div class="form-group">
                <label>Employees:</label>
                <c:set var="list" value="${employees}" scope="request"/>
                <c:set var="input_name" value="employees" scope="request"/>
                <jsp:include page="../select_multiple_html.jsp" />
            </div>
            <button type="submit" class="btn btn-success">submit</button>
        </form>
    </div>
</div>