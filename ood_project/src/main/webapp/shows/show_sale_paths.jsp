<%@ include file="../base.jsp" %>

    <div class="container well-lg">
        <div class="row item">
            <div class="col-md-10 col-md-offset-1 container">
                {% for item in items %}
                    <div class="row item well-sm bg-info">
                        <div class="col-md-2 col-md-offset-1 text-center">id</div>
                        <div class="col-md-2 text-center">time</div>
                        <div class="col-md-2 text-center">cost</div>
                        <button class="btn btn-primary col-md-1 col-md-offset-1">update</button>
                        <button class="btn btn-danger col-md-1 col-md-offset-1">delete</button>
                    </div>
                {% endfor %}
            </div>
        </div>
    </div>
