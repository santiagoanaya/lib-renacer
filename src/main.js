import Vue from 'vue'
import App from './App.vue'
import router from './router'

import { library } from '@fortawesome/fontawesome-svg-core'
import { faMapMarkedAlt } from '@fortawesome/free-solid-svg-icons'
import { FontAwesomeIcon } from '@fortawesome/vue-fontawesome'

library.add(faMapMarkedAlt)
Vue.component('font-awesome-icon', FontAwesomeIcon)
Vue.config.productionTip = false

const app = new Vue({
  router,
  render: h => h(App),
}).$mount('#app')

export default app
