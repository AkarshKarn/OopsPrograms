package OOPS;

//Ques)Write a Java program to create a class called "Dog" with instance variables "breed," "age," and "weight." Include a method to calculate the dog's age in human years and a method to print the dog's breed, age, and weight.
public class Dog {
    String breed;
    int age;
    int weight;

    Dog(String breed,int age,int weight){
        this.breed=breed;
        this.age=age;
        this.weight=weight;
    }

    public void calculateAge(){
        System.out.println("The age of Dog in human years is:"+" "+age+" "+"years");
    }

    public void printBreed(){
        System.out.println("Dog's breed is:"+breed);
    }

    public void printAge(){
        System.out.println("Dog's age is:"+age);
    }

    public void printWeight(){
        System.out.println("Dog's weight is:"+weight+"kg");
    }

    public static void main(String[] args) {
        Dog dog=new Dog("Golden Retriever",8,55);
        dog.calculateAge();
        dog.printBreed();
        dog.printAge();
        dog.printWeight();
    }
}
