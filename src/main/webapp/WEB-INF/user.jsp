<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/WEB-INF/include/header.jsp"%>
<%@ include file="/WEB-INF/include/navbar.jsp"%>

<c:url value="/user/edit" var="editUserUrl" />
<c:url value="/user/delete" var="deleteUserUrl" />

<div class="container">

	<h1>List of partners</h1>

	<div class="row">
		<div class="col-md-12">
			<table class="table table-striped table-hover table-bordered">
				<thead>
					<tr>
						<th class="text-center col-md-1">Id</th>
						<th class="text-center">First Name</th>
						<th class="text-center">Last Name</th>
						<th class="text-center col-md-1">Email</th>
						<th class="text-center col-md-1">Role</th>
						<th class="text-center col-md-1">Edit</th>
						<th class="text-center col-md-1">Delete</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="user" items="${userList}">
						<tr>
							<td>${user.id}</td>
							<td>${user.firstName}</td>
							<td>${user.lastName}</td>
							<td>${user.email}</td>
							<td>${user.role}</td>
							<td class="text-center"><a href="${editUserUrl}/${user.id}"
								class="btn btn-sm btn-primary">Edit</a></td>
							<td class="text-center">
								<form action="${deleteUserUrl}/${user.id}" method="post">
									<input name="id" type="hidden" value="${user.id}"> 
									<input class="btn btn-sm btn-danger" type="submit" value="Delete">
								</form>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

</div>

<%@ include file="/WEB-INF/include/footer.jsp"%>