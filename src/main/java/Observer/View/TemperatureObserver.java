package Observer.View;

import Observer.Model.WeatherStation;

public class TemperatureObserver implements Observer {

    private final String name;
    private final WeatherStation weatherStation;

    public TemperatureObserver(String name, WeatherStation weatherStation) {
        this.name = name;
        this.weatherStation = weatherStation;
        weatherStation.addObserver(this);
    }

    @Override
    public void update() {
        int currentTemperature = weatherStation.getTemperature();
        System.out.println(name + " observed temperature: " + currentTemperature);
    }

    public void stopObserving() {
        weatherStation.removeObserver(this);
        System.out.println(name + " stopped observing.");
    }
}
