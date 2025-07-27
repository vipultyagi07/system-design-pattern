package com.vip.lowLevelDesign.Behavioral_DesignPattern.Observer_DesignPattern.flipkartNotifyMe;

import com.vip.lowLevelDesign.Behavioral_DesignPattern.Observer_DesignPattern.flipkartNotifyMe.observable.Product;
import com.vip.lowLevelDesign.Behavioral_DesignPattern.Observer_DesignPattern.flipkartNotifyMe.observers.EmailAlertUser;
import com.vip.lowLevelDesign.Behavioral_DesignPattern.Observer_DesignPattern.flipkartNotifyMe.observers.SmsAlerUser;

public class Z_TestClass {

    public static void main(String[] args) {

        Product product= new Product();

        // registering the user by the help of constructor Injection
        EmailAlertUser emailAlertUser= new EmailAlertUser(product);
        SmsAlerUser smsAlerUser= new SmsAlerUser(product);


        // now we are updating the stock, so all the register user should be notified
        product.setInStock(true);

    }
}
