public class TemperatureAlertSystem implements WeatherObserver {
    private static final double FREEZING_THRESHOLD = 0.0;
    private static final double HEAT_WAVE_THRESHOLD = 35.0;

    @Override
    public void update(WeatherData data) {
        if (data.temperature() <= FREEZING_THRESHOLD) {
            System.err.printf("[ALERT SYSTEM] Frost warning! Temperature dropped to %.1f°C%n", data.temperature());
        } else if (data.temperature() >= HEAT_WAVE_THRESHOLD) {
            System.err.printf("[ALERT SYSTEM] Extreme heat warning! Temperature reached %.1f°C%n", data.temperature());
        }
    }
}