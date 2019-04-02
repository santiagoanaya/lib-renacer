<template>
  <div>
    <!-- <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css'>
    <link rel="stylesheet" href="css/map.css"> -->
    <div class="map">
      <div id="map"></div>
      <div class="map-c">
        <h1>Libreria Renacer </h1>
        <p>Nos encontramos en el mitico barrio de Saavedra, a una cuadra de la estacion Drago</p>
        <div class="det"><i class="fa fa-map-marker"></i> Mariano Acha 2593, CABA, Argentina</div>
          <div class="det"><i class="fa fa-phone"></i> 11 3648-5582 </div>
          <center>
            <button class="fa fa-car"></button>
            <button class="fa fa-envelope"></button>
          </center>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  created () {    
    var GoogleMapsLoader = require('google-maps');
    GoogleMapsLoader.KEY = 'qwertyuiopasdfghjklzxcvbnm';
    GoogleMapsLoader.load(function(google) {
        new google.maps.Map(el, options);
    });
    var myCenter = new google.maps.LatLng(-34.569002, -58.479648);
    function initialize() {
      var mapProp = {
        center: myCenter,
        zoom: 12,
        mapTypeId: google.maps.MapTypeId.ROADMAP
      };
      var map = new google.maps.Map(document.getElementById("map"), mapProp);

      var marker = new google.maps.Marker({
        position: myCenter,
      });
      marker.setMap(map);
    }
    google.maps.event.addDomListener(window, 'load', initialize);  
  }
}
// var GoogleMapsLoader = require('google-maps');
// GoogleMapsLoader.KEY = 'qwertyuiopasdfghjklzxcvbnm';
// GoogleMapsLoader.load(function(google) {
//     new google.maps.Map(el, options);
// });
// var myCenter = new google.maps.LatLng(-34.569002, -58.479648);
// function initialize() {
//   var mapProp = {
//     center: myCenter,
//     zoom: 12,
//     mapTypeId: google.maps.MapTypeId.ROADMAP
//   };
//   var map = new google.maps.Map(document.getElementById("map"), mapProp);

//   var marker = new google.maps.Marker({
//     position: myCenter,
//   });
//   marker.setMap(map);
// }
// google.maps.event.addDomListener(window, 'load', initialize);
</script>

<style>
</style>
