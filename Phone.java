package OOPS;

// Ques)Write a Java program to create a class called "Phone" with instance variables "make," "model," and "storage." Include a method to calculate the price of the phone based on the make, model, and storage capacity and a method to print the phone's make, model, and storage capacity.
public class Phone {
    String make;
    String model;
    int storage;

    Phone(String make, String model, int storage) {
        this.make = make;
        this.model = model;
        this.storage = storage;
    }

    public void printMake(){
        System.out.println(make+"is made");
    }
    public void printModel() {
        System.out.println("Model of the phone is:"+model);
    }
    public void printStorage(){
        System.out.println("The storage of the phone is:"+storage);
    }

    public void getPrice(){
        if (storage<=32) {
            int price = 18000;
            System.out.println("The price of the" + make + " " + model + " " + storage+"gb"+ " is" + " " + price);
        } else if (storage>32 && storage<64) {
            int price1=27000;
            System.out.println("The price of the" + make + " " + model + " " + storage+"gb"+ " is" + " " + price1);
        }else {
            int price2=40000;
            System.out.println("The price of the" + make + " " + model + " " + storage+"gb"+ " is" + " " + price2);
        }
    }



    public static void main(String[] args) {
        Phone phone1=new Phone("Samsung","S32",25);
        Phone phone2=new Phone("OnePlus","Pro",40);
        Phone phone3=new Phone("Iphone","X-15",64);

        phone1.getPrice();
        phone2.getPrice();
        phone3.getPrice();
    }

}
