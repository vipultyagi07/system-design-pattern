package com.vip.lowLevelDesign.Behavioral_DesignPattern.Observer_DesignPattern.weatherMonitoringSystem;

import com.vip.lowLevelDesign.Behavioral_DesignPattern.Observer_DesignPattern.weatherMonitoringSystem.observable.Subject;
import com.vip.lowLevelDesign.Behavioral_DesignPattern.Observer_DesignPattern.weatherMonitoringSystem.observer.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}