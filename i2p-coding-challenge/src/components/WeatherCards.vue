<template>
<div>
  <b-row>
    <b-card-group class="col-md-6 col-lg-5 col-xl-2" v-for="weather in forecast" :key="weather.id">
        <b-card class="card" :title="weather.name" :img-src="weather.icon" :img-alt="weather.shortForecast" img-top>
          <b-card-text>
            {{weather.detailedForecast}}
          </b-card-text>
        </b-card>
    </b-card-group>
  </b-row>
</div>
</template>

<script>
export default {
  name: 'WeatherCards',
  data() {
    return {
      forecast: this.$store.state.forecast
    }
  }
}
</script>

<style>
.row {
  justify-content: center;
  align-items: center;
}
.card {
  margin: 15px;
}


</style>
