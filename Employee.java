package OOPS;

// Ques)Write a Java program to create a class called "Employee" with instance variables "name," "salary," and "ID." Include a method to calculate the employee's yearly salary and a method to print the employee's name and salary.
public class Employee {
    int id;
    String name;
    int salary;

    Employee(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public void returnName(){
        System.out.println("The name of the employee is:"+" "+name);
    }

    public void returnSalary(){
        System.out.println("The monthly salary of the employee is:"+" "+salary);
    }

    public void returnYearlySalary() {
        double yearSalary=12*salary;
        System.out.println("The year salary of the employee is:"+" "+yearSalary);
    }

    public static void main(String[] args) {
        Employee employee=new Employee(1,"Brijeshwar",60000);
        employee.returnName();
        employee.returnSalary();
        employee.returnYearlySalary();
    }

}
