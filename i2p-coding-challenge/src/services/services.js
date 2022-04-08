import axios from 'axios';

const http = axios.create({
    baseURL: "http://localhost:6060/i2p"
});

export default {
    getGovWeather(address) {
        return http.get('/weather?address=' + address);
    },
    getWeather(location) {
        return http.get("/weather/extra?location=" + location);
    }
}