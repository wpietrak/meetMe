<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/WEB-INF/include/header.jsp"%>
<%@ include file="/WEB-INF/include/navbar.jsp"%>

<div class="container">

	<h1>Appointments CONFIRMED</h1>

	<div class="row">
		<div class="col-md-12">
			<table class="table table-striped table-hover table-bordered">
				<thead>
					<tr>
						<th class="text-center col-md-5">Appointment Title</th>
						<th class="text-center col-md-5">Appointment Purpose</th>
						<th class="text-center col-md-5">Appointment Date</th>
						<th class="text-center col-md-5">Appointment Time</th>
						<th class="text-center">Status</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="confirmed" items="${confirmedList}">
						<tr>						
							<td>${confirmed.meeting.title}</td>
							<td>${confirmed.meeting.purpose}</td>
							<td>${confirmed.meeting.date}</td>
							<td>${confirmed.meeting.time}</td>
							<td>${confirmed.status}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

</div>

<%@ include file="/WEB-INF/include/footer.jsp"%>