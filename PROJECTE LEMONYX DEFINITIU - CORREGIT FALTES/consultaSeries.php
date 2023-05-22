<?php

$servername = "localhost:3306";
$username = "root";
$password = "1234";
$dbname = "projectelemonyx";   

$conn = new mysqli($servername, $username, $password, $dbname);


if ($conn->connect_error) {
  die("Connection failed: " . $conn->connect_error);
}
echo "<br><br>";



$sql = "SELECT series.id_produccio, series.total_ep, produccions.nom, produccions.caratula, produccions.anys 
FROM series 
INNER JOIN produccions ON produccions.id_produccio = series.id_produccio;";

$result = $conn->query($sql);
if ($result->num_rows > 0) {
    
    while($row = $result->fetch_assoc()) {
      echo "<div class='fitxa'>";
      echo "<img src= './imatges/"  . $row["caratula"]. ".jpg' alt='caratula'>";
      echo "<p class='titol'>" . $row["nom"]. " </p>";
      echo "<p> Any: " . $row["anys"]. " </p>";
      echo "<p> Total Episodis: " . $row["total_ep"]. " </p>";
      echo "</div>";
    }
  } else {
    echo "0 results";
  }



?>