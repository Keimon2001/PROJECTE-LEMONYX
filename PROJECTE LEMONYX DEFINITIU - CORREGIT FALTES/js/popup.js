const enlaceMostrarPopup = document.getElementById('mostrarPopup');
const miPopup = document.getElementById('miPopup');
const btnCerrarPopup = document.getElementById('cerrarPopup');


enlaceMostrarPopup.addEventListener('click', function(e) {
  e.preventDefault(); 
  miPopup.style.display = 'flex'; 
});


btnCerrarPopup.addEventListener('click', function() {
  miPopup.style.display = 'none'; 
});