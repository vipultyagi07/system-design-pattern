package com.vip.lowLevelDesign.F_SingletonDeignPattern.Singleton.src;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> students  =  new ArrayList<>();
        students.add("");
        students.add("Vipul");

//        DataLayer dataLayer = new DataLayer(students);

        DataLayer instance = DataLayer.getInstance();

        instance.setStudents(students);


        Service1 service1 = new Service1();
        Service2 service2 = new Service2();
        service1.printStudents();
        service2.printStudents();

    }
}