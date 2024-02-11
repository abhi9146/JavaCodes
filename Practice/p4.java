
// Write a Java program that creates a class hierarchy for employees of a company. The base class should be Employee, with subclasses Manager, Developer, and Programmer. Each subclass should have properties such as name, address, salary, and job title. Implement methods for calculating bonuses, generating performance reports, and managing projects.

abstract class Employee{
     public String name,address;
     public int salary;

     Employee(String name,String address,int salary){
        this.name=name;
        this.address=address;
        this.salary=salary;
     }

     abstract void calculateBonus();
    //  abstract void generateReports();
    //  abstract void projectManage();

     //abstract void display();
}

class Manager extends Employee{
    public String job;
       Manager(String name,String address,int salary,String job){
            super(name,address,salary);
            this.job=job;
       }

       public void calculateBonus(){
        System.out.println("Bonus calculation method for manager");
       }
}

class Developer extends Employee{
    public String job;
    Developer(String name,String address,int salary,String job){
            super(name,address,salary);
            this.job=job;
       }
    public void calculateBonus(){
        System.out.println("Bonus calculation method for developer");
       }
}

class Programmer extends Employee{
    public String job;
    Programmer(String name,String address,int salary,String job){
            super(name,address,salary);
            this.job=job;
       }
    public void calculateBonus(){
        System.out.println("Bonus calculation method for programmer");
       }
}


public class p4 {
    public static void main(String[] args) {
        Employee e1=new Developer("abhi","bhokar",15000,"Developer");
    }
}
