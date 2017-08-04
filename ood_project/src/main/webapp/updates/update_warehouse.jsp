<%@ include file="../base.jsp" %>


<div class="panel panel-default text-bold margin-large-top">
    <div class="panel-heading text-center">update warehouse</div>
    <div class="panel-body padding-large-top">
        <form action="/warehouse/submit/update_warehouse/${warehouse.id}" method="get">
            <div class="form-group">
                <label>Name:</label>
                <input type="text" class="form-control" name="name" value="${warehouse.name}">
            </div>
            <div class="form-group">
                <label>code:</label>
                <input type="text" class="form-control" name="code" value="${warehouse.code}">
            </div>
            <button type="submit" class="btn btn-success">submit</button>
        </form>
    </div>
</div>