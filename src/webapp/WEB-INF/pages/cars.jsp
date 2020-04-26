<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="t" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <c:choose>
        <c:when test="${locale=='ru'}">
            <title>МАШИНЫ</title>
        </c:when>
        <c:when test="${locale == 'en'}">
            <title>CARS</title>
        </c:when>
        <c:otherwise>
            <title>Default</title>
        </c:otherwise>
    </c:choose>
</head>
<body>

<div align="center">


    <table border="1" cellpadding="3">
        <caption>
            <h2>Список машин</h2>
        </caption>
        <tr>
            <th>Наименование машины</th>
            <th>Владелец</th>
            <th>Серия</th>
        </tr>
        <c:forEach var="car" items="${cars}">
            <tr>
                <td><c:out value="${car.name}"/></td>
                <td><c:out value="${car.owner}"/></td>
                <td><c:out value="${car.seria}"/></td>
            </tr>
        </c:forEach>
    </table>


</div>
</body>
</html>
