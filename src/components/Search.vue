<template>
  <div class="hello">
    <h1>BUSCADOR</h1>
    <div v-for="r in checkin.answers" :key="r">
      <b>{{r.title}}</b>
    </div>
    <b>HOLA</b>
  </div>
</template>

<script>
export default {
  name: 'Home',

  data() {
    return {
      checkin: {
        name: "",
        question: "",
        answers: [
          {
            measurement: "green",
            type: "text",
            content: ""
          }
        ],
        periodization: {
          type: "range",
          days: [],
          fromDay: "",
          toDay: "",
          hours: [],
          shouldAlert: false
        }
      }
    };
  },

  created() {
    /* var url = "https://api.mercadolibre.com/sites/MLA/search?nickname=IGNACIO%20CECCHINI&q=Harry"
    request({
        url: url,
        json: true
    }, function (error, response, body) {

        if (!error && response.statusCode === 200) {
            console.log(body) // Print the json response
            console.log('BODY', this.periodization)
        }
    }) */
    console.log('BODY', this.periodization)
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
