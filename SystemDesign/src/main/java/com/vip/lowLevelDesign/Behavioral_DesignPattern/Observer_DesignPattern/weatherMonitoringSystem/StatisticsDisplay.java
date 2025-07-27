package com.vip.lowLevelDesign.Behavioral_DesignPattern.Observer_DesignPattern.weatherMonitoringSystem;

import com.vip.lowLevelDesign.Behavioral_DesignPattern.Observer_DesignPattern.weatherMonitoringSystem.observable.Subject;
import com.vip.lowLevelDesign.Behavioral_DesignPattern.Observer_DesignPattern.weatherMonitoringSystem.observer.Observer;


public class StatisticsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Weather stats : " +
                "\nAvg. temp" + temperature
                + "F degrees\n" + humidity + "= %humidity");
    }
}