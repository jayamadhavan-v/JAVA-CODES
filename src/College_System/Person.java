package College_System;



abstract  class Person {
    private String name;
    private int age;
    static String collegeName = "Velammal Institute Of Technology ";

    ///  Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    ///  default constructor
    public Person() {
        name = "unknown";
        age = 0;
    }

    ///    setter
    public void setAge(int age) {
        if (age > 0 && age < 100) {           // ✅ validation
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    ///  getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void display(); // abstract method

    public void printCollege() {
        System.out.println(collegeName);
    }
}
