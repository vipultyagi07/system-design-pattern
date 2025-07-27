package com.vip.lowLevelDesign.Creational_DesignPattern.Singleton_DeignPattern;

import java.util.List;

public class Service1 {

//     DataLayer dataLayer = new DataLayer();

    DataLayer dataLayer = DataLayer.getInstance();



    public  void printStudents() {

        List<String> students = dataLayer.getStudents();
        students.add("aka");
        for(String student : dataLayer.getStudents()) {


            System.out.println(student);
        }
    }

    public Service1(){


    }
}
