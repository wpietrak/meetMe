<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/WEB-INF/include/header.jsp"%>
<%@ include file="/WEB-INF/include/navbar.jsp"%>

<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<c:url value="/meeting/edit" var="editMeetingUrl" />
<c:url value="/meeting/delete" var="deleteMeetingUrl" />
<c:url value="/confirmed/meeting" var="confirmedMeetingUrl" />
<div class="container">


	<h1>Appointments to confirm</h1>

	<div class="row">
		<div class="col-md-12">
			<table class="table table-striped table-hover table-bordered">
				<thead>
					<tr>
						<th class="text-center col-md-1">Id</th>
						<th class="text-center">Title</th>
						<th class="text-center">Purpose</th>

						<th class="text-center col-md-1">Date</th>
						<th class="text-center col-md-1">Time</th>
						<th class="text-center col-md-1">Meeting duration</th>
						<th class="text-center col-md-1">Room</th>
						<th class="text-center col-md-1">Confirm</th>
						<th class="text-center col-md-1">Edit</th>
						<th class="text-center col-md-1">Delete</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="meeting" items="${meetingList}">
						<tr>
							<td>${meeting.id}</td>
							<td>${meeting.title}</td>
							<td>${meeting.purpose}</td>
							<td>${meeting.date}</td>
							<td>${meeting.time}</td>
							<td>${meeting.duration}</td>
							<td><c:if test="${(meeting.duration>15)&& (meeting.duration<120)}">
							
									<div class="alert alert-danger fade in">
										
										<p>Check room</p>
									</div>
								</c:if></td>
							<td class="text-center"><sec:authorize
									access="hasRole('ADMIN')">
									<form method="post"
										action="${confirmedMeetingUrl}/${meeting.id}">


										<input type="hidden" name="meetingId" value="${meeting.id}">
										<button type="submit" class="btn btn-sm btn-success">Confirm!</button>
									</form>
								</sec:authorize></td>


							<td class="text-center"><a
								href="${editMeetingUrl}/${meeting.id}"
								class="btn btn-sm btn-primary">Edit</a></td>
							<td class="text-center">

								<form action="${deleteMeetingUrl}/${meeting.id}" method="post">
									<input name="id" type="hidden" value="${meeting.id}"> <input
										class="btn btn-sm btn-danger" type="submit" value="Delete">
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