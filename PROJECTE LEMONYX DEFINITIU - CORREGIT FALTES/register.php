
<?php


$servername = "localhost:3306";
$username = "root";
$password = "1234";
$dbname = "projectelemonyx";



$conn = new mysqli($servername, $username, $password, $dbname);


if ($conn->connect_error) {
	die("La conexió ha fallat: " . $conn->connect_error);
}


if ($_SERVER['REQUEST_METHOD'] == 'POST') {
	$nombre = $_POST["nom"];
	$dni = $_POST["dni"];
	$edat = $_POST["edat"];
	$email = $_POST["adreça"];
	$telefono = $_POST["tel"];
	$tarjeta = $_POST["tarjeta"];
	$contra = $_POST["psswd"];
	$usuari = $_POST["usuari"];
	$contraconfirm = $_POST["confirm_psswd"];



	$consulta = "INSERT INTO clients (Nom, DNI, edat_data_naixement, email, telefon, num_tarjeta) VALUES ('$nombre', '$dni', '$edat', '$email', '$telefono', '$tarjeta')";
	$consulta2 = "INSERT INTO compte (usuari, contrassenya, data_alta) VALUES ('$usuari','$contra', NOW())";
	$comprova = "SELECT usuari FROM compte WHERE usuari = '$usuari'";


	if ($conn->query($comprova)->num_rows > 0) {
		header("Location: login.view.php?error=1");
	} else if ($contra != $contraconfirm) {
		header("Location: login.view.php?error=2");
	} else if ($conn->query($consulta) === FALSE || $conn->query($consulta2) === FALSE) {
		echo "<div style='font-size: 1.5rem; text-align: center; color: white;'>Connexió a la BD incorrectaS</div>" . $conn->error;
	} else {

		header("Location: login.view.php?error=true");

		exit();
	}
}



$conn->close();

?> 