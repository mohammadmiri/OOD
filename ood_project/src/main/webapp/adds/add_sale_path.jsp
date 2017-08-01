<%@ include file="../base.jsp" %>

    <div class="container well-lg">
        <div class="row">
            <div class="col-md-offset-3 col-md-6 bg-info main-container img-rounded">
                <form action="/path/submit/add_sale_path" class="form-group-sm">
                    <div class="row item">
                        <div class="col-md-offset-3 col-md-3">
                            <div class="text-font pull-right">Time:</div>
                        </div>
                        <div class="col-md-3">
                            <input class="pull-left form-control" type="number" name="time">
                        </div>
                    </div>
                    <div class="row item">
                        <div class="col-md-offset-3 col-md-3">
                            <div class="text-font pull-right">Cost:</div>
                        </div>
                        <div class="col-md-3">
                            <input class="pull-left form-control" type="number" name="cost">
                        </div>
                    </div>
                    <div class="row item">
                        <div class="col-md-offset-3 col-md-3">
                            <div class="text-font pull-right">Description:</div>
                        </div>
                        <div class="col-md-3">
                            <textarea class="pull-left form-control" type="text" name="description"></textarea>
                        </div>
                    </div>
                    <div class="row item">
                        <button type="submit" class="btn btn-success col-md-offset-5">submit</button>
                    </div>
                </form>
            </div>
        </div>
    </div>


