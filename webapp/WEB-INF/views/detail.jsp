<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>Detalles de la pelicula</title>
<spring:url value="/resources" var="urlPublic"></spring:url>
<link href="${ urlPublic }/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${ urlPublic }/bootstrap/css/theme.css" rel="stylesheet">

</head>

<body>

	<jsp:include page="includes/menu.jsp" />

	<div class="container theme-showcase" role="main">

		<!-- Marketing messaging -->
		<div class="container marketing">

			<div class="page-header">
				<h2>${ movie.title }</h2>
			</div>
			<div class="row">
				<div class="col-sm-3">
					<p class="text-center">
						<img class="img-rounded"
							src="${ urlPublic }/images/${ movie.image }"
							alt="Generic placeholder image" width="155" height="220">
					</p>
				</div>
				<div class="col-sm-9">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h3 class="panel-title">DETALLES</h3>
						</div>
						<div class="panel-body">
							<p>
								T�tulo Original : ${ movie.title } <br> Actores : <br>
								Director: <br> Clasificaci�n: ${ movie.classification } <br>
								Duraci�n: ${ movie.duration } minutos <br> G�nero: ${ movie.genre }
								<br> Fecha Estreno: ${ movie.premiere }
							</p>

						</div>
					</div>
				</div>
			</div>

			<div class="panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-title">
						<span class="label label-success">20-05-2017</span>
					</h3>
				</div>
				<div class="panel-body">
					<table class="table table-striped">
						<thead>
							<tr>
								<th>Hora</th>
								<th>Sala</th>
								<th>Precio</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>16:00</td>
								<td>Sala 1</td>
								<td>$10</td>
							</tr>
							<tr>
								<td>18:00</td>
								<td>Sala 1</td>
								<td>$10</td>
							</tr>
							<tr>
								<td>20:00</td>
								<td>Sala 1</td>
								<td>$10</td>
							</tr>
							<tr>
								<td>14:00</td>
								<td>Sala 1</td>
								<td>$10</td>
							</tr>
							<tr>
								<td>16:00</td>
								<td>Sala 1</td>
								<td>$10</td>
							</tr>
							<tr>
								<td>20:00</td>
								<td>Sala 1</td>
								<td>$10</td>
							</tr>
							<tr>
								<td>22:00</td>
								<td>Sala 1</td>
								<td>$10</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>


			<div class="row">
				<div class="col-sm-7">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h3 class="panel-title">Trailer</h3>
						</div>
						<div class="panel-body">
							<iframe width="100%" height="315"
								src="https://www.youtube.com/embed/HwDr7ff5GD4"> </iframe>
						</div>
					</div>
				</div>
				<div class="col-sm-5">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h3 class="panel-title">SINOPSIS</h3>
						</div>
						<div class="panel-body">
							<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
								Maecenas sed diam eget risus varius blandit sit amet non magna.
								Lorem ipsum dolor sit amet, consectetur adipiscing elit.
								Praesent commodo cursus magna, vel scelerisque nisl consectetur
								et. Cras mattis consectetur purus sit amet fermentum. Duis
								mollis, est non commodo luctus, nisi erat porttitor ligula, eget
								lacinia odio sem nec elit. Aenean lacinia bibendum nulla sed
								consectetur.</p>
						</div>
					</div>
				</div>
			</div>

		</div>
		<!-- /.container -->

		<hr class="featurette-divider">

		<jsp:include page="includes/footer.jsp" />

	</div>
	<!-- /container -->

	<!-- Bootstrap core JavaScript
		================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script src="${ urlPublic }/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
