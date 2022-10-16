<%-- 
    Document   : register
    Created on : Oct 12, 2022, 3:36:00 PM
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
        <table>
            <tr>
                <td>Username:</td><td><input type="text" name="user" value="${name}" required></td><td><input type="submit" name="action" value="Register Name"></td>
            </tr>
        </table>
            
    <c:if test="${invalid == true}">
        <p>Please Enter a Username</p>
    </c:if>
    <c:if test="${loggedOut == true}">
        <p>You Have Logged Out Successfully. Thank You for Using Shopping List</p>
    </c:if>
    </body>
</html>
