package com.oop;

public class OOP_concepts {
    public static void main(String[] args) {

///     syntax to creating a class 7305008024

        Student madhavan = new Student(63, "jayamadhavan", 8.0f);

        ///    --> by default it will print he defaults value for  their primitive Data types

//        System.out.println("Default value for primitive data type ");

//        System.out.println(madhavan.regNo); //--> integer so 0
//        System.out.println(madhavan.name); //--> String null
//        System.out.println(madhavan.cgpa); //--> float 0.0

//        madhavan.regNo = 63;
//        madhavan.name = "madhavan";
//        madhavan.cgpa = 8.0f;

        System.out.println(madhavan.regNo);
        System.out.println(madhavan.name);
        System.out.println(madhavan.cgpa);

        // to avoid typing different the madhavan. or next reference variable like beri
        // we will use the "this" keyword

        madhavan.printStudentInfo();

///     everytime we cant use the "." operator to assign the value for the variable
///     for that purpose we will use the constructor

///     now im try to pass the value for the call in new student() Function

        Student beri = new Student(19, "beri", 7.97f);
//      without creating a constructor it will give error "Expected no arguments but found
//      parameterized constructor it will give an error"

        beri.printStudentInfo();
    }

    static class Student {
        ///  --> classes are defined as the template which it will create struct for it
        ///      for  example html it will structure for the class

    /*
        regNo,name,cgpa these are the instance variable in java
        it will have the default value it's by its data types
     */

        // steps 1  global initialization of the variable
        int regNo;
        String name;
        float cgpa;


        ///   step 2 define a construct to receive the value from the main class
        Student() { //--> its default constructor

            ///     construct is the special function ,
            ///    it will automatically define after the object is created

            // here we can initialize the value the variables
            // this keyboard will replace the reference variable like this ==  reference variable (madhavan , beri)
            this.regNo = 63;
            name = "madhavan";
            this.cgpa = 8.0f;
        }

        Student(int regNo, String name, float cgpa) { //--> parameterized constructor
            this.regNo = regNo;
            this.name = name;
            this.cgpa = cgpa;
        }

        void printStudentInfo() {
            System.out.println("name of the com.oop.OOP_concepts.Student is " + name + " , he as the cgpa " + cgpa);
        }
    }
}
