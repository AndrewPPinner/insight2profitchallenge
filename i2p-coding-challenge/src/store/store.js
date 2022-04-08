import Vue from "vue";
import Vuex from "vuex";

Vue.use(Vuex);

export default new Vuex.Store({
  state: {
   forecast: []
},
  mutations: {
    SET_FORECAST(state, data) {
      state.forecast = data;
    }
  },
  actions: {},
  modules: {},
  strict: true
});