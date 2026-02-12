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
	            <li><a class="dropdown-item" href="#">New project...</a></li>
	            <li><a class="dropdown-item" href="#">Settings</a></li>
	            <li><a class="dropdown-item" href="#">Profile</a></li>
	            <li><hr class="dropdown-divider" /></li>
	            <li><a class="dropdown-item" href="#">Sign out</a></li>
	          </ul>
	        </div>
	      </div>
		</div>
	</header>
	
	<div class="container">
		<div id="carouselExampleDark" class="carousel carousel-dark slide">
		  <div class="carousel-indicators">
		    <button type="button" data-bs-target="#carouselExampleDark" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
		    <button type="button" data-bs-target="#carouselExampleDark" data-bs-slide-to="1" aria-label="Slide 2"></button>
		    <button type="button" data-bs-target="#carouselExampleDark" data-bs-slide-to="2" aria-label="Slide 3"></button>
		  </div>
		  <div class="carousel-inner">
		    <div class="carousel-item active" data-bs-interval="1000">
		      <img src="https://events-places.com/wp-content/uploads/classified-listing/2024/09/Le-Majestic-Gbe%CC%81gamey-1-1.png" class="d-block w-100" alt="...">
		      <div class="carousel-caption d-none d-md-block ">
		        <h5>Nous sommes SMAS-EVENT</h5>
		        <p>Nous gérons vos évènements pour vous.</p>
		      </div>
		    </div>
		    <div class="carousel-item" data-bs-interval="2000">
		      <img src="https://events-places.com/wp-content/uploads/classified-listing/2024/09/Le-Majestic-Cadjehoun-658x493.png" class="d-block w-100" alt="...">
		      <div class="carousel-caption d-none d-md-block">
		        <h5>Les salles de fêtes sophistiquées</h5>
		        <p>Nous avons des salles de fêtes qualifiées, dîtes nous seulement vos préférences.</p>
		      </div>
		    </div>
		    <div class="carousel-item">
		      <img src="https://www.blog.chooseandwork.fr/wp-content/uploads/2024/10/Salle-de-reunion-dispositions-possibles.png" class="d-block w-100" alt="...">
		      <div class="carousel-caption d-none d-md-block">
		        <h5>Pas seulement les salles fêtes</h5>
		        <p>Nous avons aussi des salles de conférences, des salles de réunions.</p>
		      </div>
		    </div>
		  </div>
		  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleDark" data-bs-slide="prev">
		    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
		    <span class="visually-hidden">Previous</span>
		  </button>
		  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleDark" data-bs-slide="next">
		    <span class="carousel-control-next-icon" aria-hidden="true"></span>
		    <span class="visually-hidden">Next</span>
		  </button>
		</div>
	</div>
	
	
	
	<main>
	      <section class="py-5 text-center container">
	        <div class="row py-lg-5">
	          <div class="col-lg-6 col-md-8 mx-auto">
	            <h1 class="fw-light">Quelques salles de fêtes</h1>
	            <p class="lead text-body-secondary">
					Les salles de fêtes sont des espaces spécialement conçus pour accueillir des événements sociaux, culturels ou professionnels. Elles servent de cadre à des célébrations telles que les mariages, anniversaires, baptêmes, réunions familiales, cérémonies officielles, conférences, séminaires ou spectacles.
				</p>
	            <p>
	              <a href="/salles" class="btn btn-primary my-2">Voulez-vous voir toutes nos salles de fêtes?</a>
	              <a href="/reservation/create" class="btn btn-secondary my-2">Voulez-vous réserver une salle?</a>
	            </p>
	          </div>
	        </div>
	      </section>
	      <div class="album py-5 bg-body-tertiary">
	        <div class="container">
	          <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
				
				
				<c:forEach var="salle" items="${salles}">
					<div class="col">
		              <div class="card shadow-sm">
						<img 
							src="https://events-places.com/wp-content/uploads/classified-listing/2024/09/Le-Majestic-Cadjehoun-658x493.png"
							class="bd-placeholder-img card-img-top"
							height="225" 
							width="100%"
							alt="salle ${salle.nom}"
						/>
		                  
		                <div class="card-body">
						  <h5 class="card-title">${salle.nom}</h5>
		                  <p class="card-text">
		                    La salle est localisée à ${salle.localisation}
		                  </p>
						  
		                  <div
		                    class="d-flex justify-content-between align-items-center"
		                  >
		                    <div class="btn-group">
		                      <a href="/salle/${salle.id}"
		                        type="button"
		                        class="btn btn-sm btn-outline-secondary"
		                      >
		                        View
		                      </a>
		                      <a href="/reservation/create"
		                        type="button"
		                        class="btn btn-sm btn-outline-secondary"
		                      >
		                        Réserver
		                      </a>
		                    </div>
		                    <small class="text-body-secondary">9 mins</small>
		                  </div>
		                </div>
		              </div>
		            </div>			  
										
				</c:forEach>
	            
	          </div>
	        </div>
	      </div>
	    </main>
	
	
	
	
	
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

	  
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js" integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI" crossorigin="anonymous"></script>
	  
</body>

</html>