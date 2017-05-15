<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/include/header.jsp" %>

<c:url value="/register" var="registerUrl" />
<c:url value="/login" var="loginUrl"/>

<div class="container">
	<c:if test="${param.logout!=null}">
    <div class="alert alert-success fade in">
        <a class="close" data-dismiss="alert" href="#">&times;</a>
        <p>You've logged out</p>
    </div>
    </c:if>
    <c:if test="${param.register!=null}">
    <div class="alert alert-info fade in">
        <a class="close" data-dismiss="alert" href="#">&times;</a>
        <p>Register successful. You can log in</p>
    </div>
    </c:if>
    <c:if test="${param.error!=null}">
    <div class="alert alert-danger fade in">
        <a class="close" data-dismiss="alert" href="#">&times;</a>
        <p>Email or password is incorrect</p>
    </div>
</c:if>
<div class="container">
<div class="col-md-6 col-md-offset-3">
<div class="form">
	<div class="form-group">
        <h4>Log In (or Register if you don't have account)</h4>
        <form action="${loginUrl}" method="post" class="form-signin">
        	<label for="exampleInputEmail">Your email</label>	
            <input name="email" type="email" id="inputEmail" class="form-control" placeholder="Email address" required autofocus>
			<label for="exampleInputPassword">Your password</label>	           
			<input name="password" type="password" id="inputPassword" class="form-control" placeholder="Password" required>
            <div id="remember" class="checkbox">

            </div>
            <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Log in</button>
        </form>

        <div class="margin-bottom-10">
            You don't have an account? <a href="${registerUrl}" class="register">Register</a>
        </div>
    </div>
    </div>
    </div>
    </div>
</div>
<%@ include file="/WEB-INF/include/footer.jsp" %>