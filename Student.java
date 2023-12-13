package OOPS;

// Ques) Write a Java program to create a class called "Student" with instance variables "name," "age," and "ID." Include a method to print the name and age of the student.

public class Student {

    int id;
    String name;
    int age;


    Student(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }

    public void returnId(){
        System.out.println("The id of the student is:"+" "+id);
    }

    public void returnName(){
        System.out.println("The name of the student is:"+" "+name);
    }

    public void returnAge(){
        System.out.println("The age of the student is:"+" "+age);
    }

    public static void main(String[] args) {
        Student student=new Student(1,"Aman",25);
        student.returnId();
        student.returnName();
        student.returnAge();
    }
}
