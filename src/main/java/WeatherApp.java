public class WeatherApp {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        // Concrete Observers
        WeatherObserver display = new CurrentConditionsDisplay();
        WeatherObserver alertSystem = new TemperatureAlertSystem();

        // Subscriptions
        station.subscribe(display);
        station.subscribe(alertSystem);

        // Anonymous Lambda Observer for logging / analytics
        station.subscribe(data ->
                System.out.println("[DataLogger] Saved metrics to database at " + System.currentTimeMillis())
        );

        System.out.println("=== Sensor Reading 1: Normal Day ===");
        station.setMeasurements(22.5, 65.0, 1013.2);

        System.out.println("\n=== Sensor Reading 2: Cold Wave ===");
        station.setMeasurements(-2.0, 80.0, 1020.5);

        System.out.println("\n=== Sensor Reading 3: Heat Wave ===");
        station.setMeasurements(38.0, 40.0, 1008.0);
    }
}