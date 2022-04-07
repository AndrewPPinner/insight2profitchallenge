<template>
  <div id="app">
    <location-form/>
    <weather-cards/>
  </div>
</template>

<script>
import WeatherCards from './components/WeatherCards.vue'
import LocationForm from "./components/LocationForm.vue"

export default {
  name: 'App',
  components: {
    WeatherCards,
    LocationForm
  }
}
</script>

<style>
body {
  background-repeat: no-repeat;
  background-position: center;
  background-size: cover;
  height: 200vh;
  background-image: url("./assets/background.jpg");
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
#app {
  display: flex;
  justify-content: center;
  align-content: center;
  height: 100vh;
}
</style>
