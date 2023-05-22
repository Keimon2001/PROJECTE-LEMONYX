<?php
session_start();

$servername = "localhost:3306";
$username = "root";
$password = "1234";
$dbname = "projectelemonyx";

$conn = new mysqli($servername, $username, $password, $dbname);

if ($conn->connect_error) {
    die("La conexió ha fallat " . $conn->connect_error);
}

$nom = $_POST['usuari'];
$dni = $_POST['dni'];
$edat = $_POST['edat'];
$adreça = $_POST['adreça'];
$tel = $_POST['tel'];
$tarjeta = $_POST['tarjeta'];
$psswd = $_POST['psswd'];

while ($row = mysqli_fetch_assoc($result)) {
    
    $id = $row['id_client'];
    

    $sql = "UPDATE clients SET Nom='$nom', DNI='$dni', edat_data_naixement='$edat', email='$adreça', telefon='$tel', num_tarjeta='$tarjeta' WHERE id = $id";
    $sql2 = "UPDATE compte SET usuari='$usuari', contrassenya='$psswd' WHERE id = $id";

    // Ejecutar las consultas de actualización
    if ($conn->query($sql) === TRUE && $conn->query($sql2) === TRUE) {
        echo "Los datos se han actualizado correctamente para el usuario con ID $id.<br>";
    } else {
        echo "Error al actualizar los datos para el usuario con ID $id: " . $conn->error . "<br>";
    }
}

?>