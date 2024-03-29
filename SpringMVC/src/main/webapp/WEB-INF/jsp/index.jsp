<%-- 
    Document   : index
    Created on : Mar 29, 2024, 7:51:54 PM
    Author     : ACER
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <ul>
            <c:forEach items="categories" var="c">
                <li>
                    ${c.name}
                </li>
            </c:forEach>
        </ul>
    </body>
</html>
