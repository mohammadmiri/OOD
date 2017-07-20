<%@ include file="../base.jsp" %>

    <div class="container item">
        {% for warehouse in warehouses %}
            <div class="well-lg bg-info item">
                <div class="row item">
                    <div class="col-md-10 col-md-offset-1 container">
                        <div class="col-md-2">
                            <div class="text-center">id warehouse</div>
                        </div>
                        <div class="col-md-2">
                            <div class="text-center">code warehouse</div>
                        </div>
                        <div class="col-md-2">
                            <div class="text-center">name warehouse</div>
                        </div>
                    </div>
                </div>
                <div class="row item container-fluid">
                    <div class="row item">components:</div>
                    {% for item in items %}
                        <div class="row item well ">
                            <div class="text-center col-md-2">component name</div>
                            <div class="text-center col-md-2">component price</div>
                            <div class="text-center col-md-2">number</div>
                            <button class="btn btn-primary col-md-offset-1 col-md-1">update</button>
                            <button class="btn btn-danger col-md-offset-1 col-md-1">delete</button>
                        </div>
                    {% endfor %}
                </div>
                <div class="row item container-fluid">
                    <div class="row item">products:</div>
                    {% for item in items %}
                        <div class="row item well ">
                            <div class="text-center col-md-2">product name</div>
                            <div class="text-center col-md-2">product price</div>
                            <div class="text-center col-md-2">number</div>
                            <button class="btn btn-primary col-md-offset-1 col-md-1">update</button>
                            <button class="btn btn-danger col-md-offset-1 col-md-1">delete</button>
                        </div>
                    {% endfor %}
                </div>
            </div>
        {% endfor %}
    </div>
