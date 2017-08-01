<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ include file="../base.jsp" %>

    <div class="container well-lg">
        <div class="row">
            <div class="col-md-offset-3 col-md-6 bg-info main-container img-rounded">
                <form action="/user/submit/signup" class="form-group-sm">
                    <div class="row item">
                        <div class="col-md-offset-3 col-md-3">
                            <div class="text-font pull-right">Username:</div>
                        </div>
                        <div class="col-md-3">
                            <input class="pull-left form-control" type="text" name="username">
                        </div>
                    </div>
                    <div class="row item">
                        <div class="col-md-offset-3 col-md-3">
                            <div class="text-font pull-right">Password:</div>
                        </div>
                        <div class="col-md-3">
                            <input class="pull-left form-control" type="password" name="password">
                        </div>
                    </div>
                    <div class="row item">
                        <div class="col-md-offset-3 col-md-3">
                            <div class="text-font pull-right">FirstName:</div>
                        </div>
                        <div class="col-md-3">
                            <input class="pull-left form-control" type="text" name="firstName">
                        </div>
                    </div>
                    <div class="row item">
                        <div class="col-md-offset-3 col-md-3">
                            <div class="text-font pull-right">Lastname:</div>
                        </div>
                        <div class="col-md-3">
                            <input class="pull-left form-control" type="text" name="lastName">
                        </div>
                    </div>
                    <div class="row item">
                        <button type="submit" class="btn btn-success col-md-offset-5">submit</button>
                    </div>
                </form>
            </div>
        </div>
    </div>


