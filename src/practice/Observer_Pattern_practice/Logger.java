package practice.Observer_Pattern_practice;

public class Logger implements Observer {
    private WeatherStation weatherStation;

    public Logger(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        this.weatherStation.registerObserver(this);

    }

    @Override
    public void update() {
        float temp = weatherStation.getTemperature();
        float windSpeed = weatherStation.getWindSpeed();
        float pressure = weatherStation.getPressure();
        log(temp, windSpeed, pressure);
    }

    private void log(float temp, float windSpeed, float pressure) {
        System.out.println("Logger: " + temp + ", " + windSpeed + ", " + pressure);
    }

}
