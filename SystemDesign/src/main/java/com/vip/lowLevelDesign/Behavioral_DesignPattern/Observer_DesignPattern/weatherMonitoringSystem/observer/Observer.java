package com.vip.lowLevelDesign.Behavioral_DesignPattern.Observer_DesignPattern.weatherMonitoringSystem.observer;

public interface Observer {

    public void update(float temp, float humidity, float pressure);
}