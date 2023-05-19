<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Lemonyx</title>
    <link rel="shortcut icon" href="imatges/Lemonyx.png" type="image/x-icon">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Bebas+Neue&family=Open+Sans:wght@400;600&display=swap"
        rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://unicons.iconscout.com/release/v2.1.9/css/unicons.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.0/css/bootstrap.min.css">

    <link rel="stylesheet" type="text/css" href="css/fonts.css">
    <link rel="stylesheet" type="text/css" href="css/estilsPelis.css">


</head>

<body>
    <header>
        <a href="index.view.php" class="logoNav"><img src="imatges/LogoHeader.png" alt=""></a>

        <ul class="navbar">
                <li><a href="index.view.php">Inici</a></li>
                <li><a href="pelis.view.php" class="actiu">Pelicules</a></li>
                <li><a href="series.view.php">Series</a></li>
                <li><a href="plans.view.php">Plans</a></li>

            <?php
                 session_start();
                if(isset($_SESSION['usuari'])){
                    echo "<li><a href='perfil.view.php'>Perfil</a></li>";
                }
                 
                ?>
        </ul>

        <div class="inici">
        <?php
               

               if(isset($_SESSION['usuari'])){
                   echo '<a href="login.view.php" class="user"><i class="input-icon uil uil-user">'. $_SESSION['usuari']. '</i></a>';
                   echo '<a href="logout.php" class="user"><i class="fa fa-power-off" style="font-size:24px"></i></a>';
               }else{
                   echo'<a href="login.view.php" class="user"><i class="input-icon uil uil-user"></i>Iniciar Sessió</a>';

               }

               ?>
            <div class="bx bx-menu" id="menu-icon"><i class="fa fa-bars" style="font-size:24px"></i></div>
        </div>

    </header>


    <div id="contingut">

        <div id="cercar">
            <i class="fa fa-search"></i>
            <input type="text" id="myInput" placeholder="Busca la teva pelicula" title="Type in a name">
        </div>
        <span id="resposta"></span>

    </div>

    
    <div class="buttonFilter">
    <h3>Pelicules</h3>

    <div class="dropdown">
        <button class="dropbtn">Generes</button>
        
        <div class="dropdown-content">

          <button type="button" onclick="inici('Drama')">Drama</button>
          <button type="button" onclick="inici('Accio')">Accio</button>
          <button type="button" onclick="inici('Fantasia')">Fantasia</button>

          <button type="button" onclick="inici('Ciencia Ficcio')">Ciencia Ficcio</button>
          <button type="button" onclick="inici('Aventura')">Aventura</button>
          <button type="button" onclick="inici('Comedia')">Comedia</button>

          <button type="button" onclick="inici('Thriller')">Thriller</button>
          <button type="button" onclick="inici('Terror')">Terror</button>
          <button type="button" onclick="inici('Suspens')">Suspens</button>

          <button type="button" onclick="inici('Animacio')">Animacio</button>

        
        </div>

    </div>

    </div>

    
    <div class="contenidor">
        <div class="grid-container" id="gridContainer"></div>
    </div>




    <div id="miPopup" class="popup">
        <div class="popup-contenido">
            <h2>Este es mi popup</h2>
            <p>Este es el contenido del popup</p>
            <button id="cerrarPopup">Cerrar</button>
        </div>
    </div>


    
    <footer id="myFooter">
        <p>Autors: Eric Camon & Álex Rodríguez</p>
    </footer>





    </main>

    <script src="js/navbar.js"></script>
    <script src="js/provaAjax.js"></script>
    <script src="js/popup.js"></script>
    <script src="js/grid.js"></script>
    <script src="js/provaFooter.js"></script>

    

    




    </div>

</body>

</html>