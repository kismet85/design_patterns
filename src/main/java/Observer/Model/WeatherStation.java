package Observer.Model;

import Observer.View.TemperatureObserver;

import java.util.Random;

public class WeatherStation extends Observable implements Runnable {

    private int temperature;
    private int lowestTemperature = -50;
    private int highestTemperature = 80;
    private Random random = new Random();

    public WeatherStation()
    {
        this.temperature = random.nextInt(highestTemperature - lowestTemperature + 1) + lowestTemperature;

    }

    public int getTemperature()
    {
        return temperature;
    }


    @Override
    public void run() {
        while(true)
        {
            try {
                Thread.sleep(random.nextInt(5000) + 1000);

                int change = random.nextBoolean() ? 1 : -1;
                temperature += change;

                if (temperature < lowestTemperature) temperature = lowestTemperature;
                if (temperature > highestTemperature) temperature = highestTemperature;
                System.out.println("WeatherStation: Temperature changed to " + temperature);

                notifyObservers();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }


}
