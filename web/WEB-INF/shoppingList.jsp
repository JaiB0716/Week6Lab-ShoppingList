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
        <h3>Hello, ${register.name} <a href="/WEB-INF/register.jsp">Logout</a></h3>
        
        <table>
            <tr>
                <th>List</th>
            </tr>
            <tr>Add Item:</tr><tr><input type="text" name="item"></tr><tr><input type="submit" value="Add"></tr>
        </table>
        
        <c:if ></c:if>
    </body>
</html>
