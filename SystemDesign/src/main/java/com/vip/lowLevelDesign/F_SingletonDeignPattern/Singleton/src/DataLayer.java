package com.vip.lowLevelDesign.F_SingletonDeignPattern.Singleton.src;

import java.util.List;
import java.util.Objects;

public class DataLayer {

    private List<String> students;
    private static  DataLayer instance;

    private DataLayer() {
    }

    public static DataLayer getInstance() {
        if(Objects.isNull(instance)) {
            instance = new DataLayer();
        }

        return instance;
    }

    public List<String> getStudents() {
        return students;
    }

    public void setStudents(List<String> students) {
        this.students = students;
    }



}
