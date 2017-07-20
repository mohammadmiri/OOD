<%@ include file="../base.jsp" %>

    <div class="container well-lg">
        <div class="row item">
            <div class="col-md-10 col-md-offset-1 container">
                {% for item in items %}
                    <div class="row item well-sm bg-info">
                        <div class="col-md-2 col-md-offset-1 text-center">{{ item }}</div>
                        <div class="col-md-2 col-md-offset-2 text-center">{{ item }}</div>
                        <button class="btn btn-danger col-md-1 col-md-offset-3">delete</button>
                    </div>
                {% endfor %}
            </div>
        </div>
    </div>
