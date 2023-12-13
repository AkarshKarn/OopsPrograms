package OOPS;

//Ques)Write a Java program to create a class called "Computer" with instance variables "processor," "RAM," and "storage." Include a method to calculate the price of the computer based on the processor, RAM, and storage capacity and a method to print the computer's processor, RAM, and storage capacity.
public class Computer {
    int processor;
    int ram;
    int storage;

    Computer(int processor,int ram,int storage){
        this.processor=processor;
        this.ram=ram;
        this.storage=storage;
    }

    public void printProcessor(){
        System.out.println("The processor of Computer is i"+processor);
    }

    public void printRam(){
        System.out.println("The ram of computer is "+ram+"gb");
    }

    public void printStorage(){
        System.out.println("The storage of computer is "+storage+"gb");
    }

    public void calculatePrice(){
        int price;
        if (processor<5 && ram<=2 && storage<500){
            price=28000;
            System.out.println("The price of computer with i"+processor+" processor "+ram+"gb ram and storage of "+storage+"gb is "+price);

        } else if (processor>5 && processor>8 || ram>=3 && ram<6 || storage>500 && storage<1000) {
            price=40000;
            System.out.println("The price of computer with i"+processor+" processor "+ram+"gb ram and storage of "+storage+"gb is "+price);
        }else {
            price=60000;
            System.out.println("The price of computer with i"+processor+" processor "+ram+"gb ram and storage of "+storage+"gb is "+price);
        }
    }

    public static void main(String[] args) {
        Computer computer1=new Computer(4,3,300);
        computer1.printProcessor();
        computer1.printRam();
        computer1.printStorage();
        System.out.println();
        computer1.calculatePrice();
    }
}
