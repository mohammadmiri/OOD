<%@ include file="../base.jsp" %>

<%--<div class="container well-lg">--%>
    <%--<div class="row">--%>
        <%--<div class="col-md-offset-3 col-md-6 bg-info main-container img-rounded">--%>
            <%--<form action="/warehouse/submit/add_warehouse" class="form-group-sm">--%>
                <%--<div class="row item">--%>
                    <%--<div class="col-md-offset-3 col-md-3">--%>
                        <%--<div class="text-font pull-right">code:</div>--%>
                    <%--</div>--%>
                    <%--<div class="col-md-3">--%>
                        <%--<input class="pull-left form-control" type="text" name="code">--%>
                    <%--</div>--%>
                <%--</div>--%>
                <%--<div class="row item">--%>
                    <%--<div class="col-md-offset-3 col-md-3">--%>
                        <%--<div class="text-font pull-right">name:</div>--%>
                    <%--</div>--%>
                    <%--<div class="col-md-3">--%>
                        <%--<input class="pull-left form-control" type="text" name="name">--%>
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
    <div class="panel-heading text-center">add warehouse</div>
    <div class="panel-body padding-large-top">
        <form action="/warehouse/submit/add_warehouse" method="get">
            <div class="form-group">
                <label>Name:</label>
                <input type="text" class="form-control" name="name">
            </div>
            <div class="form-group">
                <label>code:</label>
                <input type="text" class="form-control" name="code">
            </div>
            <button type="submit" class="btn btn-success">submit</button>
        </form>
    </div>
</div>