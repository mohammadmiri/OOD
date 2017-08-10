<%@ include file="../base.jsp" %>

    <%--<div class="container well-lg">--%>
        <%--<div class="row">--%>
            <%--<div class="col-md-offset-3 col-md-6 bg-info main-container img-rounded">--%>
                <%--<form action="/user/submit/update_employee/${employee.id}" class="form-group-sm">--%>
                    <%--<div class="row">--%>
                        <%--<div class="col-md-3">--%>
                            <%--<input class="pull-left form-control" type="hidden" value="${employee.id}">--%>
                        <%--</div>--%>
                    <%--</div>--%>
                    <%--<div class="row">--%>
                        <%--<div class="col-md-offset-3 col-md-3">--%>
                            <%--<div class="text-font pull-right">Username:</div>--%>
                        <%--</div>--%>
                        <%--<div class="col-md-3">--%>
                            <%--<input class="pull-left form-control" type="text" name="username">--%>
                        <%--</div>--%>
                    <%--</div>--%>
                    <%--<div class="row item">--%>
                        <%--<div class="col-md-offset-3 col-md-3">--%>
                            <%--<div class="text-font pull-right">Password:</div>--%>
                        <%--</div>--%>
                        <%--<div class="col-md-3">--%>
                            <%--<input class="pull-left form-control" type="password" name="password">--%>
                        <%--</div>--%>
                    <%--</div>--%>
                    <%--<div class="row item">--%>
                        <%--<div class="col-md-offset-3 col-md-3">--%>
                            <%--<div class="text-font pull-right">FirstName:</div>--%>
                        <%--</div>--%>
                        <%--<div class="col-md-3">--%>
                            <%--<input class="pull-left form-control" type="text" name="firstName">--%>
                        <%--</div>--%>
                    <%--</div>--%>
                    <%--<div class="row item">--%>
                        <%--<div class="col-md-offset-3 col-md-3">--%>
                            <%--<div class="text-font pull-right">LastName:</div>--%>
                        <%--</div>--%>
                        <%--<div class="col-md-3">--%>
                            <%--<input class="pull-left form-control" type="text" name="lastName">--%>
                        <%--</div>--%>
                    <%--</div>--%>
                    <%--<div class="row item">--%>
                        <%--<div class="col-md-offset-3 col-md-3">--%>
                            <%--<div class="text-font pull-right">Role:</div>--%>
                        <%--</div>--%>
                        <%--<div class="col-md-3">--%>
                            <%--<input class="pull-left form-control" type="text" name="type">--%>
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
    <div class="panel-heading text-center">update employee</div>
    <div class="panel-body padding-large-top">
        <form action="/user/submit/update_employee/${employee.id}" method="get">
            <div class="form-group">
                <label for="t1">Username:</label>
                <input type="text" class="form-control" id="t1" name="username" value="${employee.username}">
            </div>
            <div class="form-group">
                <label>Password:</label>
                <input type="text" class="form-control"name="password">
            </div>
            <div class="form-group">
                <label>FirstName:</label>
                <input type="text" class="form-control" name="firstName" value="${employee.firstName}">
            </div>
            <div class="form-group">
                <label>LastName:</label>
                <input type="text" class="form-control" name="lastName" value="${employee.lastName}">
            </div>
            <div class="form-group">
                <label>Role:</label>
                <input type="text" class="form-control" name="role" value="${employee.type}">
            </div>
            <button type="submit" class="btn btn-success">submit</button>
        </form>
    </div>
</div>