<%@ taglib prefix="jsp" uri="http://www.springframework.org/tags/form"%>



<%@ include file="base.jsp" %>


<div class="container well-lg">
    <div class="row item well">
        <div class="col-md-2 text-right">
            <div class="text-font"><h4>Search:</h4></div>
        </div>
        <div class="col-md-10">
            <form action="#" class="form-group-lg">
                <input class="form-control" type="text">
            </form>
        </div>
    </div>
    <div class="row item">
        <div class="col-md-10 col-md-offset-1 container">
            {% for item in items %}
                <div class="row">
                    <a href="#"><div class="bg-info col-md-6 col-md-offset-3 item well-sm text-center">{{ item }}</div></a>
                </div>
            {% endfor %}
        </div>
    </div>
</div>

