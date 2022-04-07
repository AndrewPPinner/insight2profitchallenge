import axios from 'axios';

const http = axios.create({
    baseURL: "https://andrew-pinner.asuscomm.com/i2p"
});

export default {
    getGovWeather(address) {
        return http.get('/weather?address=' + address);
    },
    getWeather(location) {
        return http.get("/weather/extra?location=" + location);
    }
}