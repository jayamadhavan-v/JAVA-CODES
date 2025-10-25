package College_System;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Teacher a1= new TeacherAssistant("madhavan",21,"java","teju");
//        a1.display();
//        a1.collegeName();

        Person person1 = new Teacher("Anbu", 40, "C Programming");
        Person person2 = new TeacherAssistant("Madhavan", 21, "Java", "Teju");
        Person person3 = new AdminStaff("Sanjay", 30, "Office Assistant");

// polymorphic display calls 👇
        person1.display();
        person2.display();
        person3.display();

    }
}



//        Student _student1 = new Student();
//        _student1.name = "jayamadhavan";
//        _student1.regNo = 113_322_104_063L;
//        _student1.age = 20;
//        _student1.marks = 85;

//        _student1.display();
//    System.out.println("-------------------------------------");
//        Student _student2 = new Student();
//        _student2.name = "oc_potta";
//        _student2.regNo = 113_322_104_090L;
//        _student2.age = 20;
//        _student2.marks = 90;
//
//        _student2.display();
//    System.out.println("-------------------------------------");
//
//        Student _studentDefault = new Student();
//        // constructor runs automatically
//        _studentDefault.display();
//
//        Student _student3 = new Student("ajay", 11332210401L, 21, 87);
//
//        _student3.display();
//        System.out.println("-------------------------------------");
//        Student _student4 = new Student("Manoj", 113322104055L, 21, 94);
//
//        _student4.display();
//        System.out.println("-------------------------------------");
//        Student.collegeName = "Anna University";
//       _student4. displayCollegeName();
//
//        Student _student5 = new Student();
//        _student5.setName("Bernus");
//        _student5.setAge(21);
//        _student5.setMarks(90);
//        _student5.display();
//
//        Student _student6 = new Student("dhanush",1133222104063L,23,89);
//        _student6.display();
//
//        Person _student7 = new Student("sanjayGay",11332210401L,23,98);
//        _student7.display();
//
//        Person _teacher1 = new Teacher("joyes Ruby",35,"java programming");
//        _teacher1.display();
//
//        Person s1 = new Student("vardhan",113322104109L,21,99);
//        s1.display();
//        s1.printCollege();
//
//        // Create a list of Person references
//        ArrayList<Person> people = new ArrayList<>();
//
//        // Add Student, Teacher, AdminStaff
//        people.add(new Student("Vardhan", 113322104109L, 21, 99));
//        people.add(new Teacher("Arun", 35, "Java Programming"));
//        people.add(new AdminStaff("Karthik", 30, "Accountant"));
//
//        // Loop through the list → demonstrate polymorphism
//        for (Person p : people) {
//            p.display();        // Calls the correct overridden display() method
//            p.printCollege();   // Calls concrete method from Person
//        }
//
//        System.out.println("---- Interface reference demo ----");
//
//        // Using interface reference
//        College c1 = new Student("Bernus", 113322104110L, 22, 95);
//        College c2 = new AdminStaff("Ravi", 28, "Receptionist");

//        c1.collegeName();  // Student implementation
//        c2.collegeName();  // AdminStaff implementation


//        new Student("Vardhan", 113322104109L, 21, 99);
//        new Student("Bernus", 113322104110L, 22, 95);
//
//        new Teacher("Arun", 35, "Java Programming");
//        new Teacher("Kiran", 40, "Database");
//
//        new AdminStaff("Karthik", 30, "Accountant");
//        new AdminStaff("Ravi", 28, "Receptionist");

// Show totals
//        System.out.println("Total Students   : " + Student.totalStudents);
//        System.out.println("Total Teachers   : " + Teacher.totalTeachers);
//        System.out.println("Total AdminStaff : " + AdminStaff.totalAdminStaff);
//        System.out.println("College Name     : " + Student.COLLEGE_NAME);



//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    ArrayList<Person> people = new ArrayList<>();
//
//    while (true) {
//        System.out.println("===== College Management Menu =====");
//        System.out.println("1. Add Student");
//        System.out.println("2. Add Teacher");
//        System.out.println("3. Add AdminStaff");
//        System.out.println("4. Display All");
//        System.out.println("5. Show Totals");
//        System.out.println("6. Exit");
//        System.out.print("Enter choice: ");
//        int choice = sc.nextInt();
//        sc.nextLine(); // consume newline
//
//        switch (choice) {
//            case 1:
//                System.out.print("Name: ");
//                String sName = sc.nextLine();
//                System.out.print("Age: ");
//                int sAge = sc.nextInt();
//                System.out.print("RegNo: ");
//                long regNo = sc.nextLong();
//                System.out.print("Marks: ");
//                int marks = sc.nextInt();
//                sc.nextLine();
//                people.add(new Student(sName, regNo, sAge, marks));
//                break;
//            case 2:
//                System.out.print("Name: ");
//                String tName = sc.nextLine();
//                System.out.print("Age: ");
//                int tAge = sc.nextInt();
//                sc.nextLine();
//                System.out.print("Subject: ");
//                String subject = sc.nextLine();
//                people.add(new Teacher(tName, tAge, subject));
//                break;
//            case 3:
//                System.out.print("Name: ");
//                String aName = sc.nextLine();
//                System.out.print("Age: ");
//                int aAge = sc.nextInt();
//                sc.nextLine();
//                System.out.print("Role: ");
//                String role = sc.nextLine();
//                people.add(new AdminStaff(aName, aAge, role));
//                break;
//            case 4:
//                for (Person p : people) {
//                    p.display();
//                    if (p instanceof College) ((College) p).collegeName();
//                }
//                break;
//            case 5:
//                System.out.println("Total Students   : " + Student.totalStudents);
//                System.out.println("Total Teachers   : " + Teacher.totalTeachers);
//                System.out.println("Total AdminStaff : " + AdminStaff.totalAdminStaff);
//                break;
//            case 6:
//                System.out.println("Exiting...");
//                System.exit(0);
//                break;
//            default:
//                System.out.println("Invalid choice!");
//        }
//    }
//}