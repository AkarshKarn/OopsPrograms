package OOPS;

//Ques)Write a Java program to create a class called "TV" with instance variables "brand," "size," and "price." Include a method to calculate the discount on the TV based on its size and a method to print the TV's brand, size, and discounted price.
public class TV {
    String brand;
    int size;
    double price;

    TV(String brand, int size, int price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }



    public void printBrand(){
        System.out.println("The brand of the Tv is "+brand);
    }

    public void printSize(){
        System.out.println("The brand of the Tv is "+brand+" of "+size+" inch");
    }

    public void printPrice(){
        System.out.println("The brand of the Tv is "+brand+" of "+size+" inch is "+price);
    }

    public void discountedPrice() {
        double disPrice;
        if (size <= 15) {
            double discount = 0.1* price;
            disPrice = price - discount;
            System.out.println("The discounted price of " + brand + " of " + size + " inch is " + disPrice);
        } else if (size > 16 && size <= 32) {
            double discount1 = 0.2 * price;
            disPrice = price - discount1;
            System.out.println("The discounted price of " + brand + " of " + size + " inch is " + disPrice);
        } else {
            double discount2 = 0.3 * price;
            disPrice = price - discount2;
            System.out.println("The discounted price of " + brand + " of " + size + " inch is " + disPrice);

        }
    }


    public static void main(String[] args) {
        TV tv1 = new TV("Lg", 12, 25000);
        TV tv2 = new TV("Samsung", 32, 38000);
        TV tv3 = new TV("Panasonic", 50, 55000);

        tv1.printBrand();
        tv1.printSize();
        tv1.printPrice();
        tv1.discountedPrice();
    }
}