<%@ include file="../base.jsp" %>

    <%--<div class="container well-lg">--%>
        <%--<div class="row">--%>
            <%--<div class="col-md-offset-3 col-md-6 bg-info main-container img-rounded">--%>
                <%--<form action="#" class="form-group-sm">--%>
                    <%--<div class="row">--%>
                        <%--<div class="col-md-3">--%>
                            <%--<input class="pull-left form-control" type="hidden" value="{{ id }}">--%>
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
                            <%--<div class="text-font pull-right">PreCondition:</div>--%>
                        <%--</div>--%>
                        <%--<div class="col-md-3">--%>
                            <%--<textarea class="pull-left form-control" type="text" name="preCondition"></textarea>--%>
                        <%--</div>--%>
                    <%--</div>--%>
                    <%--<div class="row item">--%>
                        <%--<div class="col-md-offset-3 col-md-3">--%>
                            <%--<div class="text-font pull-right">PostCondition:</div>--%>
                        <%--</div>--%>
                        <%--<div class="col-md-3">--%>
                            <%--<textarea class="pull-left form-control" type="text" name="postCondition"></textarea>--%>
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
    <div class="panel-heading text-center">update production step</div>
    <div class="panel-body padding-large-top">
        <form action="/product/submit/update_production_step/${productionStep.id}" method="get">
            <div class="form-group">
                <label>Cost:</label>
                <input type="text" class="form-control" name="cost" value="${productionStep.cost}">
            </div>
            <div class="form-group">
                <label>PreCondition:</label>
                <input type="text" class="form-control" name="preCondition" value="${productionStep.preCondition}" >
            </div>
            <div class="form-group">
                <label>PostCondition:</label>
                <input type="text" class="form-control" name="postCondition" value="${productionStep.postCondition}">
            </div>
            <button type="submit" class="btn btn-success">submit</button>
        </form>
    </div>
</div>