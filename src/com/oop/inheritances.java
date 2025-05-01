package com.oop;

public class inheritances {
    public static void main(String[] ars) {

///  Parent class with   default construct
        Students stu0 = new Students();
//        stu0.studentInfo();

///  multiple parameter constructor
        Students stu1 = new Students("madhavan", 91, "vit");
        stu1.studentInfo();

///  passing the object as the parameter to the constructor
        Students stu5 = new Students(stu1);
        stu5.studentInfo();

/// create child class with default constructor
        StudentBio stu2 = new StudentBio("jayamdhavan", 20, "vit", 3042005, "CSE");
        stu2.studentBioInfo();
        StudentBio stu3 = new StudentBio("pravem", 20, "vit", 3042005, "CSE");
        stu3.studentBioInfo();

/// create an object of child in the parent class
        Students stu4 = new StudentBio();
        stu4.studentInfo();
//        in this  i try to access the method in the child class from class
//        I can't because parent class doesn't know about the child class methods
        /*
        stu3.studentBioInfo();
         /// it's showing error

        StudentBio stu4 = new Students();
         /// in this we can't create  the object for the Parent from child Class
         */

/// passing a constructor to new constructor
        StudentBio stu6 = new StudentBio(stu5, 102030, "cse");
        stu6.studentBioInfo();
    }
}

/// students class

class Students {
    String name;
    int age;
    String clg;

    Students() {
        name = "unknown";
        age = 102;
        clg = "don't know";
    }

    public Students(String name, int age, String clg) {
        this.name = name;
        this.age = age;
        this.clg = clg;
    }

    public void studentInfo() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("clg : " + clg);
        System.out.println("-------------------------------");
    }

    /// creating a  constructor which can accept the another constructor
    Students(Students old) {
        this.name = old.name;
        this.age = old.age;
        this.clg = old.clg;
    }
}

/// child class

class StudentBio extends Students {
    int DOB;
    String dept;

    public StudentBio() {
        DOB = 1 / 1_1;
        dept = "unkonwn";
    }

    ///  In this constructor we receive all the parameter
    ///  separate the parameter on the class by using the super keyword

    public StudentBio(String name, int age, String clg, int DOB, String dept) {
/// In this if we won't initialize the super means
///  it will call the default construct in the parent class
///  it will like super-class without parameter passes through it

        super(name, age, clg); // Super class will call the parent class in the construct
        this.DOB = DOB;
        this.dept = dept;
    }

    /// here constructor which is receiving the another old constructor

    public StudentBio(Students old, int DOB, String dept) {
        super(old);
        this.DOB = DOB;
        this.dept = dept;
    }

    void studentBioInfo() {

        System.out.println("super Name : " + super.name);
        System.out.println("Age : " + super.age);
        System.out.println("clg : " + super.clg);
        System.out.println("DOB : " + DOB);
        System.out.println("Dept : " + dept);
        System.out.println("------------------------");
    }
}