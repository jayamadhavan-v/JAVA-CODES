package College_System;

public class AdminStaff extends Person implements College {
    private String role;
    static int totalAdminStaff = 0;


    /// constructors

    //    default constructor

    public AdminStaff() {
        super();
        role = "Unknown-Role";
    }

    //  Parameterized constructor

    public AdminStaff(String name, int age, String role) {
        super(name, age);
        this.role = role;
        totalAdminStaff++;
    }

    // getter and setter

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        if(role ==" "){
            System.out.println("invalid input");
        }
        else {
            this.role = role;
        }
    }

    @Override
    public void display(){
        System.out.println("Name : " + getName());
        System.out.println("age : " + getAge());
        System.out.println("Role : " + role);
    }

    @Override
    public void collegeName() {
        System.out.println(getName() + " works in  " + collegeName);
    }
}
