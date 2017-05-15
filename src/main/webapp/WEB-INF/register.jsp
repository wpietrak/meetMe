
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/WEB-INF/include/header.jsp"%>

<c:url value="/register" var="registerUrl" />
<c:url value="/login" var="loginUrl" />

<div class="container">
	<div class="col-md-6 col-md-offset-3">
		<div class="form">
			<div class="form-group">
				<h4>Create User</h4>


				<form class="form-signin" method="post" action="${registerUrl}">
					<label for="exampleInputEmail1">Email Address</label> <input
						name="email" type="email" id="inputEmail" class="form-control"
						placeholder="Email address" required autofocus> <label
						for="exampleInputFirstName">First Name</label> <input
						name="firstName" type="text" id="inputFirstName"
						class="form-control" placeholder="First name" required> <label
						for="exampleInputLastName">Lasr Name</label> <input
						name="lastName" type="text" id="inputLastName"
						class="form-control" placeholder="Last name" required> <label
						for="exampleInputPassword">Password</label> <input name="password"
						type="password" id="inputPassword" class="form-control"
						placeholder="Password" required>
					<div class="form-group">
						<label for="exampleInputRepeatPassword">Repeat password</label> <input
							name="repeatPassword" type="password" id="inputRepeatedPassword"
							class="form-control" placeholder="Repeat password" required>
					</div>
					<span></span>
					<button class="btn btn-lg btn-primary btn-block btn-signin"
						type="submit">Create</button>
				</form>
				<div class="margin-bottom-10">
					<a href="${loginUrl}" class="forgot-password">Back to Login</a>
				</div>
			</div>
		</div>
	</div>
</div>

<%@ include file="/WEB-INF/include/footer.jsp"%>