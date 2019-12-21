<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spitter</title>
        <link rel="stylesheet" type="text/css" href="<c:url value='/resources/style.css' />">
    </head>
    <body>
        <div class="spittleForm">
            <h1>Spit it out...</h1>
            <form method="post" name="spittleForm">
                <input type="hidden" name="latitude">
                <input type="hidden" name="longitude">
                <textarea name="message" cols="80" rows="5"></textarea>
                <input type="submit" value="Add" />
            </form>
        </div>
        <div class="listTitle">
            <h1>Recent Spittles</h1>
            <ul class="spittleList">
                <c:forEach items="${spittleList}" var="spittle">
                    <li id="spittle_<c:out value='${spittle.id}' />">
                        <div class="spittleMessage"><c:out value="${spittle.message}" /></div>
                        <div>
                            <span class="spittleTime"><c:out value="${spittle.time}" /></span>
                            <span class="spittleLocation">(<c:out value="${spittle.latitude}" />, <c:out value="${spittle.longitude}" />)</span>
                        </div>
                    </li>
                </c:forEach>
            </ul>
            <c:if test="${fn:length(spittleList gt 2)}">
                <hr />
                <c:url value="/spittles?count=${nextCount}" var="more_url" />
                <a href="${more_url}">Show more</a>
            </c:if>
        </div>
    </body>
</html>
