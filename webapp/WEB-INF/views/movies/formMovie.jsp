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
<title>Creacion de Peliculas</title>
<spring:url value="/resources" var="urlPublic"></spring:url>
<spring:url value="/movies/save" var="urlForm"></spring:url>
<link href="${ urlPublic }/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${ urlPublic }/bootstrap/css/theme.css" rel="stylesheet">
<link rel="stylesheet"
	href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">

</head>

<body>

	<jsp:include page="../includes/menu.jsp"></jsp:include>

	<div class="container theme-showcase" role="main">

		<div class="page-header">
			<h3 class="blog-title">
				<span class="label label-success">Datos de la Pelicula</span>
			</h3>
		</div>


		<spring:hasBindErrors name="movie">
			<div class="alert alert-danger" role="alert">
				Por favor corrija los siguientes errores:
				<ul>
					<c:forEach items="${ errors.allErrors }" var="error">
						<li><spring:message message="${ error }"></spring:message></li>
					</c:forEach>
				</ul>
			</div>
		</spring:hasBindErrors>
		<form action="${ urlForm }" method="post">
			<div class="row">
				<div class="col-sm-3">
					<div class="form-group">
						<label for="titulo">Título</label> <input type="text"
							class="form-control" name="title" id="titulo" required="required" />
					</div>
				</div>
				<div class="col-sm-3">
					<div class="form-group">
						<label for="duracion">Duracion</label> <input type="text"
							class="form-control" name="duration" id="duracion"
							required="required" />
					</div>
				</div>
				<div class="col-sm-3">
					<div class="form-group">
						<label for="clasificacion" class="control-label">Clasificacion</label>
						<select id="clasificacion" name="classification"
							class="form-control">
							<option value="A">Clasificacion A</option>
							<option value="B">Clasificacion B</option>
							<option value="C">Clasificacion C</option>
						</select>
					</div>
				</div>
				<div class="col-sm-3">
					<div class="form-group">
						<label for="genero" class="control-label">Genero</label> <select
							id="genero" name="genre" class="form-control">
							<option value="Action">Accion</option>
							<option value="Adventure">Aventura</option>
							<option value="Clasic">Clasicas</option>
							<option value="Romantic Comedy">Comedia Romantica</option>
							<option value="Drama">Drama</option>
							<option value="Horror">Terror</option>
							<option value="Child's">Infantil</option>
							<option value="Action And Adventure">Accion y Aventura</option>
							<option value="Romantic">Romantica</option>
						</select>
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col-sm-3">
					<div class="form-group">
						<label for="estatus" class="control-label">Estatus</label> <select
							id="genero" name="status" class="form-control">
							<option value="Active">Activa</option>
							<option value="Inactive">Inactiva</option>
						</select>
					</div>
				</div>
				<div class="col-sm-3">
					<div class="form-group">
						<label for="fechaEstreno">Fecha Estreno</label> <input type="text"
							class="form-control" name="premiere" id="fechaEstreno"
							required="required" />
					</div>
				</div>

				<div class="col-sm-3">
					<div class="form-group">
						<label for="imagen">Imagen</label> <input type="file"
							id="archivoImagen" name="image" />
						<p class="help-block">Imagen de la pelicula</p>
					</div>
				</div>
			</div>

			<!--  
        <div class="page-header">
            <h3 class="blog-title"><span class="label label-success">Detalles</span></h3>
        </div>

        <div class="row">
          <div class="col-sm-3">
            <div class="form-group">
              <label for="director">Director</label>
              <input type="text" class="form-control" name="director" id="director" required="required" />
            </div>  
          </div>
          <div class="col-sm-3">
            <div class="form-group">
              <label for="actores">Actores</label>
              <input type="text" class="form-control" name="actores" id="actores" required="required" />
            </div>  
          </div>

          <div class="col-sm-6">
            <div class="form-group">
              <label for="trailer">URL del Trailer (Youtube)</label>
              <input type="text" class="form-control" name="trailer" id="trailer" placeholder="URL completa del video de YOUTUBE" required="required" />
            </div>  
          </div> 
        </div> 

        <div class="row">
          <div class="col-sm-6">
            <div class="form-group">
              <label for="sinopsis">Sinopsis</label>
              <textarea class="form-control" rows="5" name="sinopsis" id="sinopsis"></textarea>
            </div> 
          </div> 
        </div>
        -->

			<button type="submit" class="btn btn-danger">Guardar</button>
		</form>

		<hr class="featurette-divider">

		<jsp:include page="../includes/footer.jsp"></jsp:include>

	</div>
	<!-- /container -->

	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script src="${ urlPublic }/bootstrap/js/bootstrap.min.js"></script>
	<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	<script>
		$(function() {
			$("#fechaEstreno").datepicker({
				dateFormat : 'dd-mm-yy'
			});
		});
	</script>
</body>
</html>
