<template>
  <div id="app">  
    <contact/>
  </div>
</template>

<script>
import Contact from './components/Contact.vue'
export default {
  name: 'app',
  components: {
    Contact
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
  margin-top: 60px;
}
</style>