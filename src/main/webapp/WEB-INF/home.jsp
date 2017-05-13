<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/include/header.jsp" %>
<%@ include file="/WEB-INF/include/navbar.jsp" %>

<div class="container">

    <h1>Hello "${user.email}" </h1>
    <h2>You can add new appointment to list. </h2>
    <h3>Remember to check if it's confirmed</h3>

</div>

<%@ include file="/WEB-INF/include/footer.jsp" %>
