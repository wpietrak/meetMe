<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/WEB-INF/include/header.jsp"%>
<%@ include file="/WEB-INF/include/navbar.jsp"%>


<c:url var="createMeetingUrl" value="/meeting/save" />
<c:url var="meetingsUrl" value="/meetings" />
<div class="container">

	<h1>Create Meeting</h1>

	<div class="row">
		<form action="${createMeetingUrl}" method="post" role="form"
			class="form-horizontal">

			<input type="hidden" name="id" value="${meeting.id}" />

			<div class="form-group">
				<label class="control-label col-sm-2" for="title">Title of
					the meeting:</label>
				<div class="col-sm-6">
					<input value="${meeting.title}" name="title" type="text" id="title"
						class="form-control" placeholder="Enter meeting title" autofocus>
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="purpose">Meeting purpose:</label>
				<div class="col-sm-6">
					<input value="${meeting.purpose}" name="purpose" type="text"
						id="purpose" class="form-control"
						placeholder="Enter meeting purpose" autofocus>
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="date">Meeting date:</label>
				<div class="col-sm-6">
					<input value="${meeting.date}" name="date"  id="data"
						class="form-control" placeholder="Enter meeting data" autofocus>
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="time">Meeting
					time:</label>
				<div class="col-sm-6">
					<input value="${meeting.time}" name="time" type="time" id="time"
						class="form-control" placeholder="Enter meeting time" autofocus>
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="quantity">Participants
					(quantity):</label>
				<div class="col-sm-6">
					<input value="${meeting.quantity}" name="quantity" type="number"
						id="quantity" class="form-control"
						placeholder="Enter participants quantity" autofocus>
				</div>
			</div>

			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-6">
					<button type="submit" class="btn btn-primary">Zapisz</button>
					<a href="${meetingsUrl}" class="btn btn-danger">Anuluj</a>
				</div>
			</div>
		</form>

	</div>

</div>

<%@ include file="/WEB-INF/include/footer.jsp"%>