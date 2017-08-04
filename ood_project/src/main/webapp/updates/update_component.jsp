<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<%@ include file="../base.jsp" %>

    <%--<div class="container well-lg">--%>
        <%--<div class="row">--%>
            <%--<div class="col-md-offset-3 col-md-6 bg-info main-container img-rounded">--%>
                <%--<form action="/product/submit/update_component/${id}" class="form-group-sm">--%>
                    <%--<div class="row">--%>
                        <%--<div class="col-md-3">--%>
                            <%--<input class="pull-left form-control" type="hidden" value="{{ id }}" name="id">--%>
                        <%--</div>--%>
                    <%--</div>--%>
                    <%--<div class="row">--%>
                        <%--<div class="col-md-offset-3 col-md-3">--%>
                            <%--<div class="text-font pull-right">Name:</div>--%>
                        <%--</div>--%>
                        <%--<div class="col-md-3">--%>
                            <%--<input class="pull-left form-control" type="text" name="name">--%>
                        <%--</div>--%>
                    <%--</div>--%>
                    <%--<div class="row item">--%>
                        <%--<div class="col-md-offset-3 col-md-3">--%>
                            <%--<div class="text-font pull-right">Price:</div>--%>
                        <%--</div>--%>
                        <%--<div class="col-md-3">--%>
                            <%--<input class="pull-left form-control" type="number" name="price">--%>
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
                        <%--<button type="submit" class="btn btn-success col-md-offset-5" name="description">submit</button>--%>
                    <%--</div>--%>
                <%--</form>--%>
            <%--</div>--%>
        <%--</div>--%>
    <%--</div>--%>


<div class="panel panel-default text-bold margin-large-top">
    <div class="panel-heading text-center">add comment</div>
    <div class="panel-body padding-large-top">
        <form action="/product/submit/update_component/${component.id}" method="get">
            <div class="form-group">
                <label>Name:</label>
                <input type="text" class="form-control" name="name" value="${component.name}">
            </div>
            <div class="form-group">
                <label>Price:</label>
                <input type="text" class="form-control" name="price" value="${component.price}">
            </div>
            <div class="form-group">
                <label>Description:</label>
                <input type="text" class="form-control" name="description" value="${component.description}">
            </div>
            <button type="submit" class="btn btn-success">submit</button>
        </form>
    </div>
</div>
