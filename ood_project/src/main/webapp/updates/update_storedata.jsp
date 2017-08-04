<%@ include file="../base.jsp" %>

    <div class="container well-lg">
        <div class="row">
            <div class="col-md-offset-3 col-md-6 bg-info main-container img-rounded">
                <form action="/warehouse/submit/update_store_data/${store_data_id}" class="form-group-sm">
                    <div class="row">
                        <div class="col-md-3">
                            <input class="pull-left form-control" type="hidden" value="{{ id }}">
                        </div>
                    </div>
                    <div class="row item">
                        <div class="col-md-offset-3 col-md-3">
                            <div class="text-font pull-right">product:</div>
                        </div>
                        <div class="col-md-3">
                            <input class="pull-left form-control" type="text" name="product">
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
                            <div class="text-font pull-right">min amount:</div>
                        </div>
                        <div class="col-md-3">
                            <input class="pull-left form-control" type="number" name="minAmount">
                        </div>
                    </div>
                    <div class="row item">
                        <div class="col-md-offset-3 col-md-3">
                            <div class="text-font pull-right">max amount:</div>
                        </div>
                        <div class="col-md-3">
                            <input class="pull-left form-control" type="number" name="maxAmount">
                        </div>
                    </div>
                    <div class="row item">
                        <button type="submit" class="btn btn-success col-md-offset-5">submit</button>
                    </div>
                </form>
            </div>
        </div>
    </div>

