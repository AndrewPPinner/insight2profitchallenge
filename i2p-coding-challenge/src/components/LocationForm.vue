<template>
<div>
  <div>
    <p>Would you like to search by: </p>
    <input v-model="show" type="radio" id="zip" value="zip">
    <label for="zip">Zip code/City</label><br>
    <input v-model="show" type="radio" id="zip" value="address">
    <label for="zip">Address</label><br>
  </div>
  <div>
    <label v-if="show == 'zip'" id="cityLabel" for="city">Weather By City/Zip</label>
    <br>
    <input @keyup.enter="getWeather" v-model="zip" v-if="show == 'zip'" id="city" placeholder="City or Zip Code" type="text"/>
    <button  @click="getWeather" v-if="show == 'zip'">Get forecast</button>

    <label v-if="show == 'address'" id="addressLabel" for="address">Weather By Address</label>
    <br>
    <input @keyup.enter="getGovWeather" v-model="address" v-if="show == 'address'" id="address" placeholder="123 Sunset Drive Town California 99999" type="text"/>
    <button  @click="getGovWeather" v-if="show == 'address'">Get forecast</button>
  </div>

  <img src="../assets/loading_cloud.gif">
</div>
</template>

<script>

import services from "../services/services"

export default {
    name: "location-form",
    data() {
      return {
        show: null,
        zip: null,
        address: null
      }
    },
    methods: {
      getGovWeather() {
        services.getGovWeather(this.address)
        .then((res) => {
          this.$store.commit("SET_FORECAST", res.data.properties.periods)
        });
      },
      getWeather() {
        services.getWeather(this.zip)
          .then((res) => {
            this.$store.commit("SET_FORECAST", res.data);
          });
      }
    }
}
</script>

<style scoped>

#city, #address {
  width: 100%;
}
button {
  margin-top: 10px;
}



</style>