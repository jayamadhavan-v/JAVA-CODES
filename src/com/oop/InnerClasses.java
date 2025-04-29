package com.oop;

public class InnerClasses {
///     this is an class is declared in side of the class
///     by without Static keyword it will give a error
///
    static class InsideClass {
        String name;
        int age;

        public InsideClass(String name, int age) {
            this.name = name;
            this.age = age;
            System.out.println(name + "----" + age);
        }
    }



    public static void main(String[] args) {
        InsideClass c = new InsideClass("bernus", 20);
        InsideClass d = new InsideClass("Dhanush", 20);

        System.out.println(c.name);
        System.out.println(d.name);
    }
}

