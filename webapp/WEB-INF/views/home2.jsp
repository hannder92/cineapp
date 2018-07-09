<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to CineApp</title>
<spring:url value="/resources" var="urlPublic" />
<link rel="stylesheet"
	href="${ urlPublic }/bootstrap/css/bootstrap.min.css">
</head>
<body>

	<!-- <h1>Movie List</h1>
	 <ol>
		<c:forEach items="${ movies }" var="movie">
			<li>${ movie }</li>
		</c:forEach>
	</ol>  -->


	<div class="panel panel-default">
		<div class="panel-heading">Movies List</div>
		<div class="panel-body">
			<table class="table table-striped table-bordered table-hover">
				<thead>
					<tr>
						<th>Id</th>
						<th>Title</th>
						<th>Duration</th>
						<th>Classification</th>
						<th>Genre</th>
						<th>Image</th>
						<th>Premiere</th>
						<th>Status</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${ movies }" var="movie">
						<tr>
							<td>${ movie.id }</td>
							<td>${ movie.title }</td>
							<td>${ movie.duration }min.</td>
							<td>${ movie.classification }</td>
							<td>${ movie.genre }</td>
							<td><img src="${ urlPublic }/images/${ movie.image }"
								width="80" height="100" /></td>
							<td><fmt:formatDate value="${ movie.premiere }"
									pattern="dd-MMM-yyyy" /></td>
							<td><c:choose>
									<c:when test="${ movie.status == 'Active' }">
										<span class="label label-success text-white">Active</span>
									</c:when>
									<c:otherwise>
										<span class="label label-danger">Inactive</span>
									</c:otherwise>
								</c:choose></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>