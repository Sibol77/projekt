<%--
  Created by IntelliJ IDEA.
  User: grzesiek
  Date: 08.10.2017
  Time: 17:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

    <jsp:include page="shared/header.jsp">
        <jsp:param name="pageName" value="home"/>
    </jsp:include>

    <html>
    <head>
        <title>HOME</title>
    </head>

    <body class="card">
        <div id="main">
        <br/>
        ${message}
        <br/>
        </div>
    </body>
</html>

<jsp:include page="shared/footer.jsp"/>