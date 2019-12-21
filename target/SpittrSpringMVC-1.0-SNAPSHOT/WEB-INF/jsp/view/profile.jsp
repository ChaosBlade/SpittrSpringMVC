<%-- 
    Document   : profile
    Created on : Dec 19, 2019, 2:58:02 PM
    Author     : yliang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Spitter</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css" />" >
  </head>
  <body>
    <h1>Your Profile</h1>
    <c:out value="${spitter.username}" /><br/>
    <c:out value="${spitter.firstName}" /> <c:out value="${spitter.lastName}" /><br/>
    <c:out value="${spitter.email}" />
  </body>
</html>
