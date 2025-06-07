package practice.Observer_Pattern_practice;

public class Test1 {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        UserInterface ui = new UserInterface(station);
        Logger logger = new Logger(station);
        AlertSystem alerter = new AlertSystem(station);

        station.setMeasurements(25.0f, 5.5f, 760.f);
        System.out.println("---------");
        station.setMeasurements(22.0f, 18.2f, 755.f);

        // Пример отписки от обновлений
        System.out.println("Пользовательский интерфейс отписался");
        station.removeObserver(ui);

        station.setMeasurements(28.0f, 3.1f, 765.f);
    }
}
