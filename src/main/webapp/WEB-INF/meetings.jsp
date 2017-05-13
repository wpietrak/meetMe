<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/WEB-INF/include/header.jsp"%>
<%@ include file="/WEB-INF/include/navbar.jsp"%>

<%@ taglib prefix="sec"	uri="http://www.springframework.org/security/tags"%>

<c:url value="/meeting/edit" var="editMeetingUrl" />
<c:url value="/meeting/delete" var="deleteMeetingUrl" />
<c:url value="/confirmed" var="confirmedMeetingUrl" />
<div class="container">

	<h1>Spotkania do potwierdzenia</h1>

	<div class="row">
		<div class="col-md-12">
			<table class="table table-striped table-hover table-bordered">
				<thead>
					<tr>
						<th class="text-center col-md-1">Id</th>
						<th class="text-center">Nazwa</th>
						<th class="text-center">Cel</th>
						
						<th class="text-center col-md-1">Data</th>
						<th class="text-center col-md-1">Godzina</th>
						<th class="text-center col-md-1">Liczba uczestikow</th>
						<th class="text-center col-md-1">Potwierdzone?</th>
						<th class="text-center col-md-1">Edytuj</th>
						<th class="text-center col-md-1">Usun</th>
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
							<td>${meeting.quantity}</td>
					  <td class="text-center">
					  <%-- <sec:authorize access="hasRole('ADMIN')"> --%>
					  <form method="post" action="${confirmedMeetingUrl}/${meeting.id}">					
                            <input type="hidden" name="bookId" value="${meeting.id}">
                            <button                                
                                    type="submit" class="btn btn-sm btn-success">Potwierdzone!</button>
                        </form>		
                        <%-- </sec:authorize> --%>
                        </td>	
							
							<td class="text-center"><a href="${editMeetingUrl}/${meeting.id}"
								class="btn btn-sm btn-primary">Edytuj</a></td>
							<td class="text-center">

								<form action="${deleteMeetingUrl}/${meeting.id}" method="post">
									<input name="id" type="hidden" value="${meeting.id}"> 
									<input class="btn btn-sm btn-danger" type="submit" value="Usun">
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