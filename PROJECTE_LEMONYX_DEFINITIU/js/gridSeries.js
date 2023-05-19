document.addEventListener('DOMContentLoaded', inici);

function inici($categoria) {
  console.log('estic dins de inici');

console.log($categoria);
  const xmlhttp = new XMLHttpRequest();
  xmlhttp.onload = function() {
    document.getElementById("gridContainer").innerHTML = this.responseText;
  }
  xmlhttp.open("post", "consultaGridSeries.php");
  xmlhttp.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
  xmlhttp.send('categoria=' + $categoria);

}



const gridContainer = document.getElementById("gridContainer");

const xhr = new XMLHttpRequest();
xhr.open("GET", "consultaGridSeries.php", true);
xhr.onload = function() {

    if (xhr.status === 200) {
        document.getElementById("gridContainer").innerHTML = this.responseText;
        
    }
};
xhr.send();