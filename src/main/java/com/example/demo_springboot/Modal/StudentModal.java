package com.example.demo_springboot.Modal;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class StudentModal {
    public String id;
    public String name;
    private boolean status;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public static List<StudentModal> getSmmmm() {
        return smmmm;
    }

    public static void setSmmmm(List<StudentModal> smmmm) {
        StudentModal.smmmm = smmmm;
    }

    public static List<StudentModal> smmmm = null;
    static{
        smmmm = new ArrayList<StudentModal>();
        smmmm.add(new StudentModal("1","Mỳ gà",true));
        smmmm.add(new StudentModal("2","Mỳ lợn",true));
        smmmm.add(new StudentModal("3","Mỳ bò",false));
    }

    public StudentModal() {
    }

    public StudentModal(String id, String name, boolean status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
