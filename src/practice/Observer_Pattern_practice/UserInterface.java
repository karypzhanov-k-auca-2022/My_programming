package practice.Observer_Pattern_practice;

public class UserInterface implements Observer {
    private WeatherStation weatherStation;

    public UserInterface(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        this.weatherStation.registerObserver(this);
    }

    @Override
    public void update() {
        float temp = weatherStation.getTemperature();
        float wind = weatherStation.getWindSpeed();
        display(temp, wind);
    }

    private void display(float temp, float wind) {
        System.out.println("UserInterface: " + temp + ", " + wind);
    }
}
