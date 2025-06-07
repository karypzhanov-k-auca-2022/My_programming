package practice.Observer_Pattern_practice;

public class AlertSystem implements Observer {
    private WeatherStation weatherStation;
    private static final float WIND_ALERT_THRESHOLD = 15.0f;

    public AlertSystem(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        this.weatherStation.registerObserver(this);
    }

    @Override
    public void update() {
        float windSpeed = weatherStation.getWindSpeed();
        if (windSpeed > WIND_ALERT_THRESHOLD) {
            alert(windSpeed);
        }
    }

    public void alert(float windSpeed) {
        System.out.println("Штормовое предупреждение! Скорость ветра: " + windSpeed);
    }
}
