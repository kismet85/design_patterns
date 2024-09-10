package Observer;

import Observer.Model.WeatherStation;
import Observer.View.TemperatureObserver;

public class Main {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        TemperatureObserver observer1 = new TemperatureObserver("Observer Ismet", weatherStation);
        TemperatureObserver observer2 = new TemperatureObserver("Observer Aku Ankka", weatherStation);
        TemperatureObserver observer3 = new TemperatureObserver("Observer Myyrä", weatherStation);

        Thread stationThread = new Thread(weatherStation);
        stationThread.start();

        try {
            Thread.sleep(10000);
            observer2.stopObserving();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}