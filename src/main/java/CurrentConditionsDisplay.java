public class CurrentConditionsDisplay implements WeatherObserver {
    @Override
    public void update(WeatherData data) {
        System.out.printf("[Display Screen] Temp: %.1f°C | Humidity: %.1f%% | Pressure: %.1f hPa%n",
                data.temperature(), data.humidity(), data.pressure());
    }
}