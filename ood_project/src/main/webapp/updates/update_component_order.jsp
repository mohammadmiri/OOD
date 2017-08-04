<%@ include file="../base.jsp" %>

<div class="container well-lg">
    <div class="row">
        <div class="col-md-offset-3 col-md-6 bg-info main-container img-rounded">
            <form action="/product/submit/update_component_order/${id}" class="form-group-sm">
                <div class="row">
                    <div class="col-md-offset-3 col-md-3">
                        <div class="text-font pull-right">TotalCost:</div>
                    </div>
                    <div class="col-md-3">
                        <input class="pull-left form-control" type="number" name="totalCost">
                    </div>
                </div>
                <div class="row item">
                    <div class="col-md-offset-3 col-md-3">
                        <div class="text-font pull-right">Date:</div>
                    </div>
                    <div class="col-md-3">
                        <input class="pull-left form-control" type="text" name="date">
                    </div>
                </div>
                <div class="row item">
                    <div class="col-md-offset-3 col-md-3">
                        <div class="text-font pull-right">amount:</div>
                    </div>
                    <div class="col-md-3">
                        <input class="pull-left form-control" type="number" name="amount">
                    </div>
                </div>
                <div class="row item">
                    <div class="col-md-offset-3 col-md-3">
                        <div class="text-font pull-right">components:</div>
                    </div>
                    <div class="col-md-3">
                        <input class="pull-left form-control" type="text" name="components">
                    </div>
                </div>
                <div class="row item">
                    <div class="col-md-offset-3 col-md-3">
                        <div class="text-font pull-right">source:</div>
                    </div>
                    <div class="col-md-3">
                        <input class="pull-left form-control" type="number" name="source">
                    </div>
                </div>
                <div class="row item">
                    <button type="submit" class="btn btn-success col-md-offset-5">submit</button>
                </div>
            </form>
        </div>
    </div>
</div>


