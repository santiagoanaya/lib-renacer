import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
    {
      path: '/',
      name: 'home',
      component: () => import('./components/Search.vue')
    },
    {
      path: '/contacto',
      name: 'contact',
      component: () => import('./components/Contact.vue')
    },
    {
      path: '*',
      redirect: '/'
    }
  ]
})
