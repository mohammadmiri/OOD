<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<div class="panel panel-default margin-large-top">
    <div class="panel-heading text-center text-bold">all products</div>
    <div class="panel-body">
        <table class="table table-hover table-striped">
            <thead>
            <tr>
                <th class="text-center">id</th>
                <th  class="text-center">name</th>
                <th class="text-center">price</th>
                <th class="text-center"></th>
                <th class="text-center"></th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${products}" var="item">
                <tr>
                    <td class="text-center">${item.id}</td>
                    <td class="text-center"><a href="/product/show_one_product/${item.id}">${item.name}</a></td>
                    <td class="text-center">${item.price}</td>
                    <td class="text-center"><a href="/product/update_product/${item.id}" class="btn btn-primary">update</a></td>
                    <td class="text-center"><a href="/product/delete_product/${item.id}" class="btn btn-danger">delete</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        <a href="/product/add_product" class="btn btn-primary">New</a>
    </div>
</div>