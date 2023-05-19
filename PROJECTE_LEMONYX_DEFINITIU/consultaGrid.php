<?php

$conn = mysqli_connect("localhost:3306", "root", "1234", "projectelemonyx");

if (!$conn) {
    die("Error de conexión: " . mysqli_connect_error());
}

$genereDrama = $_POST['categoria'];
$sql = "SELECT pelicules.id_produccio, produccions.caratula, produccions.nom FROM produccions 
INNER JOIN pelicules ON pelicules.id_produccio = produccions.id_produccio
INNER JOIN `genere` ON produccions.id_categoria = genere.id_categoria WHERE genere.nom = '$genereDrama';";

mysqli_set_charset($conn, 'utf8');

$resultado = mysqli_query($conn, $sql);

if ($resultado) {
    $num_filas = mysqli_num_rows($resultado);
    if ($num_filas > 0) {
    } else {
        //echo "No se encontraron imágenes";
    }
} else {
    echo "Error en la consulta: " . mysqli_error($conn);
}



if (mysqli_num_rows($resultado) > 0){

    while ($fila = mysqli_fetch_assoc($resultado)) {
        
        echo "<div id=dades>";
        echo "<img src= './imatges/" .$fila["caratula"]. ".jpg'>";
        echo "<p>" .$fila["nom"]. "</p>";
        echo "</div>";
    }

    
} else {
    //echo "No se encontraron imágenes";
}


mysqli_close($conn);
?>