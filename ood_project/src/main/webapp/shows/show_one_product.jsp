<%@ include file="../base.jsp" %>

    <div class="row well-lg container bg-success item">
        <div class="row item">
            <div class="text-font col-md-2 col-md-offset-1 text-right">Name:</div>
            <div class="text-font col-md-1 text-left">productName</div>
        </div>
        <div class="row item">
            <div class="text-font col-md-2 col-md-offset-1 text-right">Price:</div>
            <div class="text-font col-md-1 text-left">productPrice</div>
        </div>
        <div class="row item">
            <div class="text-font col-md-2 col-md-offset-1 text-right">Description:</div>
            <div class="text-font col-md-1 text-left">productDescription</div>
        </div>
        <div class="row item">
            <div class="text-font col-md-2 col-md-offset-1 text-right">ProductionSteps:</div>
            <div class="text-font col-md-1 text-left">productionSteps</div>
        </div>
    </div>
    <div class="row container well-lg bg-info item">
        <div class="row">Comments:</div>
        {% for comment in comments %}
            <div class="row item well">{{ comment }}</div>
        {% endfor %}
    </div>
    <div class="row container well item">
        <div class="row item">
            <div class="col-md-1 text-right">Name:</div>
            <div class="col-md-8">
                <input class="form-control" type="text">
            </div>
        </div>
        <div class="row item">
            <div class="col-md-1 text-right">Comment:</div>
            <div class="col-md-8">
                <textarea class="form-control" type="text"></textarea>
            </div>
        </div>
        <div class="row item">
            <button class="btn btn-primary col-md-offset-1">submit</button>
        </div>
    </div>
