<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Perfil | Lemonyx</title>
    <link rel="shortcut icon" href="imatges/Lemonyx.png" type="image/x-icon">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Bebas+Neue&family=Open+Sans:wght@400;600&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://unicons.iconscout.com/release/v2.1.9/css/unicons.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.0/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="css/estils.css">
    <link rel="stylesheet" type="text/css" href="css/login.css">
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
                <li><a href="index.view.php" >Inici</a></li>
                <li><a href="pelis.view.php">Pel·lícules</a></li>
                <li><a href="series.view.php">Sèries</a></li>
                <li><a href="plans.view.php">Plans</a></li>
                <li><a href="perfil.view.php" class="actiu">Perfil</a></li>
            </ul>

            <div class="inici">

<?php
session_start();

if(isset($_SESSION['usuari'])){
    
    echo '<a href="logout.php" class="user"><i class="fa fa-power-off" style="font-size:24px"></i></a>';
}else{
    echo'<a href="login.view.php" class="user"></i>Iniciar Sessió</a>';
}

?>

<?php
									

$servername = "localhost:3306";
$username = "root";
$password = "1234";
$dbname = "projectelemonyx";



$conn = new mysqli($servername, $username, $password, $dbname);


if ($conn->connect_error) {
	die("La conexió ha fallat: " . $conn->connect_error);
}

 
$nom = "";
$usuari = "";
$dni="";
$edat = "";
$adresa = "";
$tel = "";
$tarjeta = "";
$psswd = "";
$idclient = "";
$idclient = $_SESSION['id_client'];

$sql = "SELECT * FROM clients  WHERE id_client = '$idclient'";
$sql2 ="SELECT * FROM compte  WHERE id_client = '$idclient'";



$result = mysqli_query($conn, $sql);
$result2  = mysqli_query($conn, $sql2);


if ($result2-> num_rows > 0) {
    while($row = mysqli_fetch_assoc($result)){
        $nom = $row['Nom'];
        $dni= $row['DNI'];
        $edat = $row['edat_data_naixement'];
        $adresa = $row['email'];
        $tel = $row['telefon'];
        $tarjeta = $row['num_tarjeta'];
        
    }
    

}

if ($result2-> num_rows > 0 ) {
    while($row = mysqli_fetch_assoc($result2)){
        $usuari = $row['usuari'];
        $psswd = $row['contrassenya'];
    }
}

?>

<div class="bx bx-menu" id="menu-icon"><i class="fa fa-bars" style="font-size:24px"></i></div>
</div>

        </header>

        <div id="contenidor_perfil">
            <form method="POST">
            <div class="form-group">
                <input type="text" class="form-style" name="nom" id="nom" placeholder="Nom" <?php if(isset($nom)){ ?> value="<?php echo $nom; ?> <?php } ?>">
                <i class="input-icon uil uil-user"></i>
            </div>

            <div class="form-group mt-2">
                <input type="text" class="form-style" name="dni" id="dni" placeholder="DNI" <?php if(isset($dni)){ ?> value="<?php echo $dni; ?> <?php } ?>">
                <i class="input-icon fa fa-address-card-o"></i>
            </div>

            <div class="form-group mt-2">
                <input type="text" class="form-style" name="edat" id="edat" placeholder="Edat naixement (any/mes/dia)" <?php if(isset($edat)){ ?> value="<?php echo $edat; ?> <?php } ?>">
                <i class="input-icon fa fa-calendar"></i>
            </div>


            <div class="form-group mt-2">
                <input type="email" class="form-style" name="adresa" id="adresa" placeholder="Adreça electrònica" <?php if(isset($adresa)){ ?> value="<?php echo $adresa; ?> <?php } ?>">
                <i class="input-icon uil uil-at"></i>
            </div>

            <div class="form-group mt-2">
                <input type="tel" class="form-style" name="tel" id="tel" placeholder="Telèfon" <?php if(isset($tel)){ ?> value="<?php echo $tel; ?> <?php } ?>">
                <i class="input-icon uil uil-phone"></i>
            </div>

            <div class="form-group mt-2">
                <input type="tel" class="form-style" name="tarjeta" id="tarjeta" placeholder="Nùmero tarjeta" <?php if(isset($tarjeta)){ ?> value="<?php echo $tarjeta; ?> <?php } ?>"tarjeta            <i class="input-icon fa fa-credit-card"></i>
                <i class="input-icon fa fa-address-card-o"></i>
            </div>

            <div class="form-group">
                <input type="text" class="form-style" name="usuari" id="usuari" placeholder="Usuari" <?php if(isset($usuari)){ ?> value="<?php echo $usuari; ?> <?php } ?>">
                <i class="input-icon uil uil-user"></i>
            </div>

            <div class="form-group mt-2">
                <input type="password" class="form-style" name="psswd" id="psswd" placeholder="Contrasenya" <?php if(isset($psswd)){ ?> value="<?php echo $psswd; ?> <?php } ?>">
                <i class="input-icon uil uil-lock-alt"></i>
            </div>

            <div id = btn_login>
            
            <input  class="btn mt-4" type="submit" value="Guardar"  id="Guardar">
            <?php
            

            
            $servername = "localhost:3306";
            $username = "root";
            $password = "1234";
            $dbname = "projectelemonyx";
            
            
            
            $conn = new mysqli($servername, $username, $password, $dbname);
            
            
            if ($conn->connect_error) {
                die("La conexió ha fallat: " . $conn->connect_error);
            }
            $nom = "";  
            $contra = "";
            $email = "";
            $dni = "";
            $edat = "";
            $email = "";
            $tel = "";
            $tarjeta = "";
            $usuari = "";
            $idclient = "";
            
            
            if ($_SERVER['REQUEST_METHOD'] == 'POST') {
                $nom = $_POST["nom"];
                $dni = $_POST["dni"];
                $edat = $_POST["edat"];
                $email = $_POST["adresa"];
                $tel = $_POST["tel"];
                $tarjeta = $_POST["tarjeta"];
                $contra = $_POST["psswd"];
                $usuari = $_POST["usuari"];
                $idclient = $_SESSION['id_client'];
                
                
            

            $sql = "UPDATE clients SET Nom='$nom', DNI = '$dni', email= '$email', telefon = '$tel', edat_data_naixement = '$edat', num_tarjeta = '$tarjeta' WHERE id_client = '$idclient'";
            $sql2 = "UPDATE compte SET usuari = '$usuari', contrassenya = '$contra' WHERE id_client = '$idclient'";

            if($conn->query($sql) == FALSE || $conn->query($sql2) == FALSE){
                echo "<p style='font-size: 1.5rem; text-align: center; color: white;'>Error :" .$conn->error ."</p>";
            }else{
                echo "<p style='font-size: 1.5rem; text-align: center; color: white;'>Dades guardades correctament.</p>";
                $_SESSION['usuari'] = $usuari;
            }
        }
            ?>

            </form>


            </div>

        </div>

        </main>

        <script src="js/lemon.js"></script>
        <script src="js/main.js"></script>
        <script src="js/navbar.js"></script>




    </div>

</body>

</html>