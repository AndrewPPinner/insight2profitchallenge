<template>
<div id="test">
  <b-row>
    <b-card-group class="col-md-6 col-lg-5 col-xl-2" v-for="weather in forecast" :key="weather.id">
        <b-card class="card" :title="weather.name || weather.day" :img-src="weather.icon" :img-alt="weather.shortForecast" img-top>
          <b-card-text>
            <strong v-if="weather.temperature">{{'Temperature: ' + weather.temperature + '°F'}}</strong>
            <span>
              <strong v-if="weather.high">{{'High: ' + weather.high + '°F'}}</strong>
              <strong v-if="weather.low">{{' Low: ' + weather.low + '°F'}}</strong>
            </span>
            <br>
            {{weather.condition}}
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
    }
  },
  computed: {
    forecast() {
      return this.$store.state.forecast;
    }
  }
}
</script>

<style>
.card {
  margin: 15px;
}
.card-img-top {
  
  transform: scale(0.9);
}

span {
  display: flex;
  justify-content: space-between;
}


</style>
