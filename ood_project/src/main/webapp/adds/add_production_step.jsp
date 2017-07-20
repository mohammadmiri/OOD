<%@ include file="../base.jsp" %>

    <div class="container well-lg">
        <div class="row">
            <div class="col-md-offset-3 col-md-6 bg-info main-container img-rounded">
                <form action="#" class="form-group-sm">
                    {% csrf_token %}
                    <div class="row item">
                        <div class="col-md-offset-3 col-md-3">
                            <div class="text-font pull-right">Cost:</div>
                        </div>
                        <div class="col-md-3">
                            <input class="pull-left form-control" type="number">
                        </div>
                    </div>
                    <div class="row item">
                        <div class="col-md-offset-3 col-md-3">
                            <div class="text-font pull-right">PreCondition:</div>
                        </div>
                        <div class="col-md-3">
                            <textarea class="pull-left form-control" type="text"></textarea>
                        </div>
                    </div>
                    <div class="row item">
                        <div class="col-md-offset-3 col-md-3">
                            <div class="text-font pull-right">PostCondition:</div>
                        </div>
                        <div class="col-md-3">
                            <textarea class="pull-left form-control" type="text"></textarea>
                        </div>
                    </div>
                    <div class="row item">
                        <button type="submit" class="btn btn-success col-md-offset-5">submit</button>
                    </div>
                </form>
            </div>
        </div>
    </div>


