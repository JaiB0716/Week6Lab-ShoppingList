<%-- 
    Document   : shoppingList
    Created on : Oct 12, 2022, 3:36:18 PM
    Author     : Owner
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopping List</title>
    </head>
    <body>
        <h1>Shopping List</h1>
        <h3>Hello, ${register.name} <a href="<c:url value='/ShoppingList?action=logout'/>">Logout</a></h3>
        
        <table>
            <tr>
                <th>List</th>
            </tr>
            <tr>Add Item:</tr><tr><input type="text" name="item"></tr><tr><input type="submit" value="Add"></tr>
            <tr><input type="hidden" name="action" value="add"></tr>
        </table>
        
        <form method="post" action="listItems">
            <ul>
                <c:forEach items="${lItems}" var="item">
                    <input type="radio" name="item" value="${item}"> <c:out value="${item}"/><br>
                </c:forEach>
            </ul>
        
            <input type="submit" value="Remove Item">
            <input type="hidden" name="action" value="remove">
        </form>
    </body>
</html>
