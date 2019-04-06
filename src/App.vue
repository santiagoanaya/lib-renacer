<template>
  <div id="app">
    <navbar/>
    <search/>
  </div>
</template>

<script>
import Search from './components/Search.vue'
import Navbar from './components/Navbar.vue'

export default {
  name: 'app',

  components: {
    Search,
    Navbar
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 80px;
}
</style>
