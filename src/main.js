import Vue from 'vue'
import App from './App.vue'

Vue.config.productionTip = false

/* var mercadopago = require('mercadopago');
var config = require('./config');

mercadopago.configure({
  client_id: config.client_id,
  client_secret: config.client_secret,
  access_token: config.access_token
}); */

new Vue({
  render: h => h(App),
}).$mount('#app')

