@FunctionalInterface
public interface WeatherObserver {
    void update(WeatherData data);
}