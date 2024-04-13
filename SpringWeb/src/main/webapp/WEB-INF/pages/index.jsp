<%-- 
    Document   : index
    Created on : Apr 2, 2024, 4:45:30 PM
    Author     : ACER
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<h1>Hello World! I'M Nguyen</h1>


<ul>
    <c:forEach items="${categories}" var="c">
        <li>
            ${c.name}
        </li>
    </c:forEach>
</ul>
