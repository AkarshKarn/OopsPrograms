package OOPS;

//Ques)Write a Java program to create a class called "Shirt" with instance variables "size," "color," and "price." Include a method to calculate the discount on the shirt with instance variables "size," "color," and "price." Include a method to calculate the discount on the shirt based on  its size and a method to print the shirt's size, color, and discounted price
public class Shirt {
    int size;
    String color;
    int price;

    public void printSize(){
        System.out.println("The size of the shirt is: "+size);
    }
    public void printColor(){
        System.out.println("The color of the shirt is: "+color);
    }

    public void discountedPrice() {
        double disPrice,finalPrice;
        if (size <= 28) {
            double discount = 0.1* price;
            disPrice = price - discount;

        } else if (size > 29 && size <= 42) {
            double discount1 = 0.2 * price;
            disPrice = price - discount1;

        } else {
            double discount2 = 0.3 * price;
            disPrice = price - discount2;

        }
        if (disPrice<=999){
            double disc=0.1*disPrice;
            finalPrice=disPrice-disc;
            System.out.println("The discounted price of " + color + " shirt of " + size + " inch is " + finalPrice);
        }else if (disPrice>1000 && disPrice<=1999){
            double disc=0.2*disPrice;
            finalPrice=disPrice-disc;
            System.out.println("The discounted price of " + color + " shirt of " + size + " inch is " + finalPrice);
        }else {
            double disc=0.3*disPrice;
            finalPrice=disPrice-disc;
            System.out.println("The discounted price of " + color + " shirt of " + size + " inch is " + finalPrice);
        }
    }

    public static void main(String[] args) {
        Shirt shirt1=new Shirt();
        shirt1.size=32;
        shirt1.color="Red";
        shirt1.price=800;

        shirt1.printSize();
        shirt1.printColor();
        System.out.println();
        shirt1.discountedPrice();


    }
}
