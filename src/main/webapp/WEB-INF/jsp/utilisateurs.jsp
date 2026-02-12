<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html lang="fr">
<!--
   sans titre.html
   
   Copyright 2026 romario <romario@romario>
   
   This program is free software; you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation; either version 2 of the License, or
   (at your option) any later version.
   
   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.
   
   You should have received a copy of the GNU General Public License
   along with this program; if not, write to the Free Software
   Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
   MA 02110-1301, USA.
   
   
-->

<head>
	<meta charset="utf-8" />
	<title>Accueil</title>
	<meta name="generator" content="Geany 2.0" />
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
	<link href="https://cdn.datatables.net/2.3.7/css/dataTables.dataTables.min.css" rel="stylesheet">
</head>

<body>
	<header class="p-3 mb-3 border-bottom text-bg-success" style="--bs-bg-opacity: .25;">
		    <div class="container">
		      <div
		        class="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start"
		      >
		        <a
		          href="/"
		          class="d-flex align-items-center mb-2 mb-lg-0 link-body-emphasis text-decoration-none"
		        >
		          <svg
		            class="bi me-2"
		            width="40"
		            height="32"
		            role="img"
		            aria-label="Bootstrap"
		          >
		            <use xlink:href="#bootstrap"></use>
		          </svg>
		        </a>
		        <ul
		          class="nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0"
		        >
		          <li>
		            <a href="/" class="nav-link px-2 link-body-emphasis"
		              >Accueil</a
		            >
		          </li>
		          <li>
		            <a href="/utilisateurs" class="nav-link px-2 link-body-emphasis"
		              >Utilisateurs</a
		            >
		          </li>
		          <li>
		            <a href="/salles" class="nav-link px-2 link-body-emphasis"
		              >Salles</a
		            >
		          </li>
				  <li>
	  	            <a href="/reservations" class="nav-link px-2 link-body-emphasis"
	  	              >Réservations</a
	  	            >
	  	          </li>
		        </ul>
		        <form class="col-12 col-lg-auto mb-3 mb-lg-0 me-lg-3" role="search">
		          <input
		            type="search"
		            class="form-control"
		            placeholder="Search..."
		            aria-label="Search"
		          />
		        </form>
		        <div class="dropdown text-end">
		          <a
		            href="#"
		            class="d-block link-body-emphasis text-decoration-none dropdown-toggle"
		            data-bs-toggle="dropdown"
		            aria-expanded="false"
		          >
		            <img
		              src="https://github.com/mdo.png"
		              alt="mdo"
		              width="32"
		              height="32"
		              class="rounded-circle"
		            />
		          </a>
		          <ul class="dropdown-menu text-small">
		          </ul>
		        </div>
		      </div>
			</div>
		</header>
		
	
	<div class="container">
		<h1 class="text-center">La liste des utilisateurs<h1>
		<div>
			<div class="row mb-2">
				<a  href="/utilisateur/create" class="btn btn-primary col">
					Ajouter un nouveau utilisateur
				</a>
			</div>
			<div class="row">
				<table id="utilisateurs" class="table table-striped">
				  <thead>
				    <tr>
				      <th scope="col">#</th>
				      <th scope="col">Nom</th>
				      <th scope="col">email</th>
				      <th scope="col">Rôle</th>
					  <th scope="col" class="text-primary">Editer</th>
					  <th scope="col" class="text-danger">Supprimer</th>
				    </tr>
				  </thead>
				  <tbody>
					
					<c:forEach var="utilisateur" items="${utilisateurs}" varStatus="status">
						<tr>
					      <th scope="row">${status.count}</th>
					      <td>${utilisateur.nom}</td>
					      <td>${utilisateur.email}</td>
						  <td>${utilisateur.role}</td>
	  				      <td><a title="Editer l'utilisateur  ${utilsateur.nom}" href="utilisateur/${utilisateur.id}">Editer</a></td>
	  				      <td><a title="Supprimer l'utilisateur  ${utilsateur.id}" class="text-danger" href="utilisateur/delete/${utilisateur.id}">Supprimer</a></td>
					    </tr>					  
															
					</c:forEach>
				    
				  </tbody>
				</table>
			</div>
		</div>
	</div>
	
	
	<footer class="py-3 my-4 bg-success" style="--bs-bg-opacity: .25;">
	        <ul class="nav justify-content-center border-bottom pb-3 mb-3">
	          <li class="nav-item">
	            <a href="/" class="nav-link px-2 text-body-secondary">Accueil</a>
	          </li>
	          <li class="nav-item">
	            <a href="/salles" class="nav-link px-2 text-body-secondary">Salles</a>
	          </li>
	          <li class="nav-item">
	            <a href="/utilisateurs" class="nav-link px-2 text-body-secondary">Utilisateurs</a>
	          </li>
	          <li class="nav-item">
	            <a href="/reservations" class="nav-link px-2 text-body-secondary">Réservations</a>
	          </li>
	        </ul>
	        <p class="text-center text-body-secondary">&copy; 2025 Company, Inc</p>
	      </footer>

	<script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>  
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js" integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI" crossorigin="anonymous"></script>
	<script src="https://cdn.datatables.net/2.3.7/js/dataTables.min.js" ></script>  
	<script>
		let table = new DataTable('#utilisateurs');
	</script>
	
</body>

</html>