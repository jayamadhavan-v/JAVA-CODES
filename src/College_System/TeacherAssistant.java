package College_System;

import java.sql.SQLOutput;

public class TeacherAssistant extends Teacher implements College {
    private String supervisorName;
    static int totalTeacherAssistant = 0;

    //   constructor
    TeacherAssistant() {
        supervisorName = "unknownTeacher";
    }

    //    parameterized constructor

    public TeacherAssistant(String name, int age, String subjectName, String supervisorName) {
        super(name, age, subjectName);
        this.supervisorName = supervisorName;
        totalTeacherAssistant++;
    }

    public TeacherAssistant(String subjectName, String supervisorName) {
        super(subjectName);
        this.supervisorName = supervisorName;
        totalTeacherAssistant++;
    }

    //    getter and setter

    public String getSupervisorName() {
        return supervisorName;
    }

    public void setSupervisorName(String supervisorName) {
        this.supervisorName = supervisorName;
    }

    //@Override
    @Override
    public void display() {
        super.display();
        System.out.println("SupervisorName : " + supervisorName);
    }

    @Override
    public void collegeName() {
        System.out.println(getName()+"  is working as the assistant Teacher in "+ collegeName);
    }
}
