import Vue from 'vue'
import App from './App.vue'
import GoogleMapsLoader from 'google-maps'

Vue.config.productionTip = false
GoogleMapsLoader.KEY = 'AIzaSyDIBCYgv_mbK9taP8tYYEXaYGAur7CM6sw';

new Vue({
  render: h => h(App),
}).$mount('#app')
