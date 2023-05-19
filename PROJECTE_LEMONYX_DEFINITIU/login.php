<?php
											
$servername = "localhost:3306";
$username = "root";
$password = "1234";
$dbname = "projectelemonyx";


$conn = new mysqli($servername, $username, $password, $dbname);


if ($_SERVER['REQUEST_METHOD'] == 'POST') {
$usuari = $_POST['usuari'];
$psswdL = $_POST['psswdL'];

$sql = "SELECT * FROM compte WHERE usuari = '$usuari' AND contrassenya = '$psswdL'";

$idclient = "SELECT id_client FROM compte WHERE usuari = '$usuari' AND contrassenya = '$psswdL'";

$resultat = mysqli_query($conn, $idclient);

if (mysqli_num_rows($resultat) > 0) {
while ($row = mysqli_fetch_assoc($resultat)) {
$idclient = $row['id_client'];

}
}

$result = mysqli_query($conn, $sql);

if (mysqli_num_rows($result) == 1) {

    setcookie(
        "usr",
        $usuari,
    );

    setcookie(
        "psswd",
        $psswdL,
    );

    session_start();
    $_SESSION['id_client']= $idclient;
    $_SESSION['sessio'] = true;
    $_SESSION['usuari'] = $usuari;
    
    header("Location: index.view.php");
    
} else {

    $err = true;
    header("Location: login.view.php?error=true");
    exit();
    
    
}

if(!$err){
    echo "<div style='font-size: 1.5rem; text-align: center; color: white;'>Contrasenya incorrecta.</div>";
}
}

$conn->close();
?>