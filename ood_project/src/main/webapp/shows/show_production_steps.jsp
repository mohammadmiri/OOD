<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ include file="../base.jsp" %>

<%--<div class="panel panel-default margin-large-top">--%>
    <%--<div class="panel-heading text-center text-bold">all products</div>--%>
    <%--<div class="panel-body">--%>
        <%--<table class="table table-hover table-striped">--%>
            <%--<thead>--%>
            <%--<tr>--%>
                <%--<th class="text-center">id</th>--%>
                <%--<th  class="text-center">name</th>--%>
                <%--<th class="text-center">price</th>--%>
                <%--<th class="text-center"></th>--%>
                <%--<th class="text-center"></th>--%>
            <%--</tr>--%>
            <%--</thead>--%>
            <%--<tbody>--%>
            <%--<c:forEach items="${products}" var="item">--%>
                <%--<tr>--%>
                    <%--<td class="text-center">${item.id}</td>--%>
                    <%--<td class="text-center"><a href="/product/show_one_product/${item.id}">${item.name}</a></td>--%>
                    <%--<td class="text-center">${item.price}</td>--%>
                    <%--<td class="text-center"><a href="/product/update_product/${item.id}" class="btn btn-primary">update</a></td>--%>
                    <%--<td class="text-center"><a href="/product/delete_product/${item.id}" class="btn btn-danger">delete</a></td>--%>
                <%--</tr>--%>
            <%--</c:forEach>--%>
            <%--</tbody>--%>
        <%--</table>--%>
        <%--<a href="/product/add_product" class="btn btn-primary">New</a>--%>
    <%--</div>--%>
<%--</div>--%>


<c:forEach items="${productionSteps}" var="item">
    <div class="panel panel-default margin-large-top">
        <div class="panel-heading text-center text-bold">product</div>
        <div class="panel-body">
            <table class="table table-hover table-striped">
                <thead>
                    <tr>
                        <th class="text-center">title</th>
                        <th class="text-center">value</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td class="text-center">id:</td>
                        <td class="text-center">${item.id}</td>
                    </tr>
                    <tr>
                        <td class="text-center">cost:</td>
                        <td class="text-center">${item.cost}</td>
                    </tr>
                    <tr>
                        <td class="text-center">pre condition:</td>
                        <td class="text-center">${item.preCondition}</td>
                    </tr>
                    <tr>
                        <td class="text-center">post condition:</td>
                        <td class="text-center">${item.postCondition}</td>
                    </tr>
                    <tr>
                        <td class="text-center">inputs:</td>
                        <td class="text-center">
                            <c:forEach items="${item.getInputs()}" var="input">
                                <p>${input.toString()}</p>
                            </c:forEach>
                        </td>
                    </tr>
                    <tr>
                        <td class="text-center">outputs:</td>
                        <td class="text-center">
                            <c:forEach items="${item.getOutputs()}" var="output">
                                <p>${output.toString()}</p>
                            </c:forEach>
                        </td>
                    </tr>
                    <tr>
                        <td class="text-center">suggestions:</td>
                        <td class="text-center">
                            <c:forEach items="${item.getSuggestions()}" var="suggestion">
                                <p>${suggestion}</p>
                            </c:forEach>
                        </td>
                    </tr>
                    <tr>
                        <td class="text-center">people involved:</td>
                        <td class="text-center">
                            <c:forEach items="${item.getPeopleInvolved()}" var="employee">
                                <p>${employee.toString()}</p>
                            </c:forEach>
                        </td>
                    </tr>
                    <tr>
                        <td class="text-center"><a href="/product/update_production_step/${item.id}" class="btn btn-primary">update</a></td>
                        <td class="text-center"><a href="/product/delete_production_step/${item.id}" class="btn btn-primary">delete</a></td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
</c:forEach>

<a href="/product/add_production_steps" class="btn btn-primary">New</a>
