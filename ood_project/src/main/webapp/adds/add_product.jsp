<%@ include file="../base.jsp" %>

    <div class="container well-lg">
        <div class="row">
            <div class="col-md-offset-3 col-md-6 bg-info main-container img-rounded">
                <form action="#" class="form-group-sm">
                    {% csrf_token %}
                    <div class="row item">
                        <div class="col-md-offset-3 col-md-3">
                            <div class="text-font pull-right">Name:</div>
                        </div>
                        <div class="col-md-3">
                            <input class="pull-left form-control" type="text">
                        </div>
                    </div>
                    <div class="row item">
                        <div class="col-md-offset-3 col-md-3">
                            <div class="text-font pull-right">Price:</div>
                        </div>
                        <div class="col-md-3">
                            <input class="pull-left form-control" type="text">
                        </div>
                    </div>
                    <div class="row item">
                        <div class="col-md-offset-3 col-md-3">
                            <div class="text-font pull-right">Description:</div>
                        </div>
                        <div class="col-md-3">
                            <input class="pull-left form-control" type="text">
                        </div>
                    </div>
                    <div class="row item">
                        <div class="col-md-offset-3 col-md-3">
                            <div class="text-font pull-right">ProductionStep:</div>
                        </div>
                        <div class="col-md-3">
                            <input class="pull-left form-control" type="text">
                        </div>
                    </div>
                    <div class="row item">
                        <button type="submit" class="btn btn-success col-md-offset-5">submit</button>
                    </div>
                </form>
            </div>
        </div>
    </div>


