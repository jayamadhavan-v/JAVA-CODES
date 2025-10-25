package College_System;

public class Teacher extends Person implements College {
    private  String subjectName;
    static int totalTeachers = 0;

///  Default Constructor ;

    public Teacher(){
        subjectName = "Unknown Subject";
    }


///  parameterized constructor :
    public Teacher(String subjectName) {
        this.subjectName = subjectName;
    }

    public Teacher(String name, int age, String subjectName) {
        super(name, age);
        this.subjectName = subjectName;
        totalTeachers++;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    ///  display
@Override
    public void display() {
    System.out.println("Name    : " + getName());
    System.out.println("Age     : " + getAge());
    System.out.println("Subject : " + subjectName);
    }

    public void collegeName() {
        System.out.println(getName() + " works in  " + collegeName);
    }
}
