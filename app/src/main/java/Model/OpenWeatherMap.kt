package Model


class OpenWeatherMap{
    var coord: Coord? = null
    var weather: List<Weather>? = null
    var base: String? = null
    var main: Main? = null
    var wind: Wind? = null
    var rain: Rain? = null
    var clouds: Clouds? = null
    var sys: Sys? = null
    var name: String? = null
    var dt: Int = 0
    var id: Int = 0
    var cod: Int = 0

    constructor(){}

    constructor(coord: Coord, weatherList: List<Weather>, base: String?, main: Main, wind: Wind, rain: Rain, clouds: Clouds, dt: Int, name: String, cod: Int){
        this.base = base
        this.clouds = clouds
        this.cod = cod
        this.coord = coord
        this.dt = dt
        this.id = id
        this.main = main
        this.name = name
        this.rain = rain
        this.sys = sys
        this.weather = weather
        this.wind = wind
    }
}