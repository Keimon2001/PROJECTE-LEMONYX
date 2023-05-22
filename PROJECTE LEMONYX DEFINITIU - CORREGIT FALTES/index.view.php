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
    <link rel="stylesheet" type="text/css" href="css/estils.css">
    <link rel="stylesheet" type="text/css" href="css/fonts.css">

    
</head>

<body>

    <div class="intro">
        <img src="imatges/LEMONYXX.png" alt="logo">
        <h1 class="logo">
            <span class="part-logo">L</span>
            <span class="part-logo">E</span>
            <span class="part-logo">M</span>
            <span class="part-logo">O</span>
            <span class="part-logo">N</span>
            <span class="part-logo">Y</span>
            <span class="part-logo">X</span>
        </h1>
        <p>Esprem al màxim el teu temps!</p>
      </div>
      
    <div class="all">



        <header>
            <a href="index.view.php" class="logoNav"><img src="imatges/LogoHeader.png" alt=""></a>
    
            <ul class="navbar">
                <li><a href="index.view.php" class="actiu">Inici</a></li>
                <li><a href="pelis.view.php">Pel·lícules</a></li>
                <li><a href="series.view.php">Sèries</a></li>
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

        <main>
            <div class="pelicula_portada">
                <div class="contenidor">
                    <h3 class="titol">Súper Mario Bros: La película</h3>
                    <p class="sinopsis">Mientras trabajan en una avería subterránea, los fontaneros de Brooklyn, Mario y
                        su hermano Luigi, viajan por una misteriosa tubería hasta un nuevo mundo mágico. Pero, cuando
                        los hermanos se separan, Mario deberá emprender una épica misión para encontrar a Luigi. Con la
                        ayuda del champiñón local Toad y unas cuantas nociones de combate de la guerrera líder del Reino
                        Champiñón, la princesa Peach, Mario descubre todo el poder que alberga en su interior.</p>
                    <button role="button" class="boto"><span class="icon-play3"></span>Reproduir</button>
                    <button role="button" class="boto"><span class="icon-info"></span>Més informació</button>
                </div>
            </div>

            <div class="pelicula_recomanada contenidor">
                <div class="contenidor_titol_controls">
                    <h3>Películes Recomanades</h3>
                    <div class="indicadors">

                    </div>
                </div>

                <div class="contenidor_principal">
                    <button role="button" id="fletxa_esq" class="fletxa_esq"><span
                            class="icon-arrow-left"></span></button>

                    <div class="contenidor_carousel">
                        <div class="carousel">
                            <div class="pelicula"><a href="#"><img src="imatges/1.jpg" alt="peli"></a></div>                            
                            <div class="pelicula"><a href="#"><img src="imatges/2.jpg" alt="peli"></a></div>
                            <div class="pelicula"><a href="#"><img src="imatges/3.jpg" alt="peli"></a></div>
                            <div class="pelicula"><a href="#"><img src="imatges/4.jpg" alt="peli"></a></div>
                            <div class="pelicula"><a href="#"><img src="imatges/5.jpg" alt="peli"></a></div>
                            <div class="pelicula"><a href="#"><img src="imatges/6.jpg" alt="peli"></a></div>
                            <div class="pelicula"><a href="#"><img src="imatges/7.jpg" alt="peli"></a></div>
                            <div class="pelicula"><a href="#"><img src="imatges/8.jpg" alt="peli"></a></div>
                            <div class="pelicula"><a href="#"><img src="imatges/9.jpg" alt="peli"></a></div>
                            <div class="pelicula"><a href="#"><img src="imatges/10.jpg" alt="peli"></a></div>
                            <div class="pelicula"><a href="#"><img src="imatges/11.jpg" alt="peli"></a></div>
                            <div class="pelicula"><a href="#"><img src="imatges/12.jpg" alt="peli"></a></div>
                            <div class="pelicula"><a href="#"><img src="imatges/13.jpg" alt="peli"></a></div>
                            <div class="pelicula"><a href="#"><img src="imatges/14.jpg" alt="peli"></a></div>
                        </div>
                    </div>

                    <button role="button" id="fletxa_dre" class="fletxa_dre"><span
                            class="icon-arrow-right"></span></button>
                </div>
            </div>


        </main>

        <footer id="myFooter">
            <p>Autors: Eric Camon & Álex Rodríguez</p>
        </footer>

        <script src="js/lemon.js"></script>
        <script src="js/main.js"></script>
        <script src="js/navbar.js"></script>
        <script src="js/provaFooter.js"></script>
        



    </div>

</body>

</html>