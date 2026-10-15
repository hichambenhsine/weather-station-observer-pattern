import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private final List<WeatherObserver> observers = new ArrayList<>();
    private WeatherData currentData;

    public void subscribe(WeatherObserver observer) {
        observers.add(observer);
    }

    public void unsubscribe(WeatherObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.update(currentData);
        }
    }

    /**
     * Simulates new sensor measurements arriving at the weather station.
     */
    public void setMeasurements(double temperature, double humidity, double pressure) {
        this.currentData = new WeatherData(temperature, humidity, pressure);
        notifyObservers();
    }
}