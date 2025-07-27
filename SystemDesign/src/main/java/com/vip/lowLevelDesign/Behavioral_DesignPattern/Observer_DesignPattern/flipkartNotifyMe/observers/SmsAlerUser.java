package com.vip.lowLevelDesign.Behavioral_DesignPattern.Observer_DesignPattern.flipkartNotifyMe.observers;

import com.vip.lowLevelDesign.Behavioral_DesignPattern.Observer_DesignPattern.flipkartNotifyMe.observable.Subject;

public class SmsAlerUser implements Observer {
    private Subject subject;
    public SmsAlerUser(Subject product) {

        this.subject=product;
        product.registerUser(this);
    }

    @Override
    public void update() {

        display();
    }

    public void display() {
        System.out.println("Dear sms user product is back in stock");
    }
}
