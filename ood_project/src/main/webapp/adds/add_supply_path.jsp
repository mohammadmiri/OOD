<%@ include file="../base.jsp" %>

    <%--<div class="container well-lg">--%>
        <%--<div class="row">--%>
            <%--<div class="col-md-offset-3 col-md-6 bg-info main-container img-rounded">--%>
                <%--<form action="/path/submit/add_supply_path/${id}" class="form-group-sm">--%>
                    <%--<div class="row item">--%>
                        <%--<div class="col-md-offset-3 col-md-3">--%>
                            <%--<div class="text-font pull-right">Time:</div>--%>
                        <%--</div>--%>
                        <%--<div class="col-md-3">--%>
                            <%--<input class="pull-left form-control" type="number" name="time">--%>
                        <%--</div>--%>
                    <%--</div>--%>
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
                            <%--<div class="text-font pull-right">Description:</div>--%>
                        <%--</div>--%>
                        <%--<div class="col-md-3">--%>
                            <%--<textarea class="pull-left form-control" type="text" name="description"></textarea>--%>
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
        <form action="/path/submit/add_supply_path" method="get">
            <div class="form-group">
                <label>Time:</label>
                <input type="text" class="form-control" name="time">
            </div>
            <div class="form-group">
                <label>Cost:</label>
                <input type="text" class="form-control" name="cost">
            </div>
            <div class="form-group">
                <label>Description:</label>
                <input type="text" class="form-control" name="description">
            </div>
            <button type="submit" class="btn btn-success">submit</button>
        </form>
    </div>
</div>
