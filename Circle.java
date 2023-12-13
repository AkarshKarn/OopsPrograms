package OOPS;

import java.util.Scanner;

// Ques) Write a Java program to create a class called "Circle" with an instance variable "radius." Include a method to calculate the area of the circle and a method to calculate the circumference of the circle.
public class Circle {
    int radius;

    Circle(int radius){
        this.radius=radius;
    }

    public void getArea(){
        double area=(22/7)*radius*radius;
        System.out.println("The area of the Circle is:"+area);
    }

    public void getCircumference(){
        double circumference=2*(22/7)*radius;
        System.out.println("The area of the Circle is:"+circumference);
    }

    public static void main(String[] args) {
        Circle circle=new Circle(14);
        circle.getArea();
        circle.getCircumference();
    }

}
