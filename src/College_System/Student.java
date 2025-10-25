package College_System;

public class Student extends Person implements College{ // ✅ Inheriting from Person
// encapsulation
    private long regNo;
    private int marks;
    static int totalStudents = 0;          // ✅ static counter
    static final String COLLEGE_NAME = "Velammal Institute Of Technology";  // ✅ final constant

///    1.default constructor
    Student() {
        super(); // calls Person() constructor
        regNo = 0;
        marks = 105;
    }

///    2.Parameterized constructor
    public Student(String name, long regNo, int age, int marks) {
        super(name, age);  // ✅ calls Person(name, age)
        this.regNo = regNo;
        this.marks = marks;
        totalStudents++;
    }

///    setter
    public void setRegNo(long regNo) {
        this.regNo = regNo;
    }

    public void setMarks(int marks) {
//        this.marks = marks;
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("invalid marks");
        }
    }

/// getter
    public int getMarks() {
        return marks;
    }

    public long getRegNo() {
        return regNo;
    }


/// display

//@Override
    public void display() {
        System.out.println("Name : " + getName());
        System.out.println("age : " + getAge());
        System.out.println("marks : " + marks);
        System.out.println("register_Number : " + regNo);
        System.out.println("collegeName : " + COLLEGE_NAME);
        System.out.println("-------------------");
    }
    // Implement interface method
    @Override
    public void collegeName() {
        System.out.println(getName() + " studies at " + collegeName);
    }


}



