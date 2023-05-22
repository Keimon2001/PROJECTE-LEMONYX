<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Plans | Lemonyx</title>
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
    <link rel="stylesheet" href="css/estilsPlans.css">
</head>
<body>


<header>
        <a href="index.view.php" class="logoNav"><img src="imatges/LogoHeader.png" alt=""></a>

        <ul class="navbar">
                <li><a href="index.view.php">Inici</a></li>
                <li><a href="pelis.view.php">Pel·lícules</a></li>
                <li><a href="series.view.php">Sèries</a></li>
                <li><a href="plans.view.php" class="actiu">Plans</a></li>
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

    <div class="taula_preus">
        <div class="detalls">
            <h2>Escolleix el teu pla</h2>
            
        </div>
        <div class="grid">
            <div class="box basic">
                <div class="titol" style="color:black">Gratuïta</div>
                <div class="preu">
                    <b>0.00€</b>
                    <span>/ mes</span>
                </div>
                <div class="inclou">
                    <div>Pel·lícules fins 2015</div>
                    <div>300 pel·lícules</div>
                    <div>2 dispositius simultanis</div>
                </div>
                <div class="boto">
                    <a href="index.view.php"> <button>Llegeix més</button></a>
                </div>
            </div>

            <div class="box pro">
                <div class="titol">Bàsica</div>
                <div class="preu">
                    <b>8.90€</b>
                    <span>/ mes</span>
                </div>
                <div class="inclou">
                    <div>Pel·lícules fins 2020</div>
                    <div>600 pel·lícules</div>
                    <div>4 dispositius simultanis</div>
                </div>
                <div class="boto">
                    <a href="index.view.php"> <button>Llegeix més</button></a>
                </div>
            </div>

            <div class="box premium">
                <div class="titol" style="color:black">Premium</div>
                <div class="preu">
                    <b>12.90€</b>
                    <span>/ mes</span>
                </div>
                <div class="inclou">
                    <div>Totes les pel·lícules</div>
                    <div>1.000 pel·lícules</div>
                    <div>10 dispositius simultanis</div>
                </div>
                <div class="boto">
                   <a href="index.view.php"> <button>Llegeix més</button></a>
                    
                </div>
            </div>
        </div>
    </div>

    
    <footer id="myFooter">
        <p>Autors: Eric Camon & Álex Rodríguez</p>
    </footer>

    <script src="js/navbar.js"></script>
    <script src="js/provaFooter.js"></script>

</body>
</html>