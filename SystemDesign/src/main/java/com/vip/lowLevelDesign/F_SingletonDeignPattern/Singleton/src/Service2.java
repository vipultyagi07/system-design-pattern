package com.vip.lowLevelDesign.F_SingletonDeignPattern.Singleton.src;


public class Service2 {


    static DataLayer dataLayer = DataLayer.getInstance();




    public static void printStudents() {


//        List<String> students = dataLayer.getStudents();
//        students.add("aka dani daniels");


        for(String student : dataLayer.getStudents()) {
            System.out.println(student);
        }
    }
}
