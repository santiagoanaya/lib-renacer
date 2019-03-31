<template>
  <div class="hello">
    <h1>BUSCADOR</h1>
  </div>
</template>

<script>
var request = require("request")
export default {
  name: 'Home',

  created() {
    var url = "https://api.mercadolibre.com/sites/MLA/search?nickname=IGNACIO%20CECCHINI"
    request({
        url: url,
        json: true
    }, function (error, response, body) {

        if (!error && response.statusCode === 200) {
            console.log(body) // Print the json response
        }
    })
  }
}
</script>

<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
