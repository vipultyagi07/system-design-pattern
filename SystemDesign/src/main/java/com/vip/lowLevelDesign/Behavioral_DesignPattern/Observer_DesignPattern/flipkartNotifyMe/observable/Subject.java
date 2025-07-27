package com.vip.lowLevelDesign.Behavioral_DesignPattern.Observer_DesignPattern.flipkartNotifyMe.observable;

import com.vip.lowLevelDesign.Behavioral_DesignPattern.Observer_DesignPattern.flipkartNotifyMe.observers.Observer;

public interface Subject {
    void registerUser(Observer observer);
    void removeUser(Observer observer);
    void notifyUser();
}
