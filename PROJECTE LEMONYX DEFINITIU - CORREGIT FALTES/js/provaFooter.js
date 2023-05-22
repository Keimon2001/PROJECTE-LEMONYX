window.addEventListener('DOMContentLoaded', function() {
    var footer = document.getElementById('myFooter');
    footer.style.display = 'block';
  
    window.addEventListener('scroll', function() {
      var scrollPosition = window.innerHeight + window.pageYOffset;
      var contentHeight = document.body.offsetHeight;
  
      if (scrollPosition >= contentHeight) {
        footer.style.display = 'block';
      } else {
        footer.style.display = 'none';
      }
    });
  });
  