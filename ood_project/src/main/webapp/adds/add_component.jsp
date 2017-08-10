<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../base.jsp" %>

    <%--<div class="container well-lg">--%>
        <%--<div class="row">--%>
            <%--<div class="col-md-offset-3 col-md-6 bg-info main-container img-rounded">--%>
                <%--<form action="/submit/add_component" class="form-group-sm">--%>
                    <%--<div class="row">--%>
                        <%--<div class="col-md-offset-3 col-md-3">--%>
                            <%--<div class="text-font pull-right">Name:</div>--%>
                        <%--</div>--%>
                        <%--<div class="col-md-3">--%>
                            <%--<input class="pull-left form-control" type="text">--%>
                        <%--</div>--%>
                    <%--</div>--%>
                    <%--<div class="row item">--%>
                        <%--<div class="col-md-offset-3 col-md-3">--%>
                            <%--<div class="text-font pull-right">Price:</div>--%>
                        <%--</div>--%>
                        <%--<div class="col-md-3">--%>
                            <%--<input class="pull-left form-control" type="number">--%>
                        <%--</div>--%>
                    <%--</div>--%>
                    <%--<div class="row item">--%>
                        <%--<div class="col-md-offset-3 col-md-3">--%>
                            <%--<div class="text-font pull-right">Description:</div>--%>
                        <%--</div>--%>
                        <%--<div class="col-md-3">--%>
                            <%--<textarea class="pull-left form-control" rows="8"></textarea>--%>
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
    <div class="panel-heading text-center">add components</div>
    <div class="panel-body padding-large-top">
        <form action="/product/submit/add_component" method="get">
            <div class="form-group">
                <label>Name:</label>
                <input type="text" class="form-control" name="name">
            </div>
            <div class="form-group">
                <label>Price:</label>
                <input type="text" class="form-control" name="price">
            </div>
            <div class="form-group">
                <label>Description:</label>
                <input type="text" class="form-control" name="description">
            </div>
            <button type="submit" class="btn btn-success">submit</button>
        </form>
    </div>
</div>