package com.vip.lowLevelDesign.Behavioral_DesignPattern.Observer_DesignPattern.weatherMonitoringSystem.observable;

import com.vip.lowLevelDesign.Behavioral_DesignPattern.Observer_DesignPattern.weatherMonitoringSystem.observer.Observer;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}