package OOPS;

//Ques)  Write a Java program to create a class called "Furniture" with instance variables "type," "material," and "price." Include a method to calculate the discount on the furniture based on its material and a method to print the furniture's type, material, and discounted price.

public class Furniture {
    String type;
    String material;
    int price;

    Furniture(String type, String material, int price) {
        this.type = type;
        this.material = material;
        this.price = price;
    }

    public void printType() {
        System.out.println("The type of furniture is: " + type);
    }

    public void printMaterial() {
        System.out.println("The material of furniture is: " + material);
    }

    public void printPrice() {
        System.out.println("The price of material is: " + price);
    }

    public void calculatePrice() {  //particleboard, MDF, plywood, veneer sheets, furniture board, and lumber.
        double disPrice;

        if (material == "plywood") {
            double dis = 0.1 * price;
            disPrice = price - dis;
            System.out.println("The discounted price of the " + material + " " + type + " is Rs. " + disPrice);
        } else if (material == "furniture board") {
            double dis = 0.2 * price;
            disPrice = price - dis;
            System.out.println("The discounted price of the " + material + " " + type + " is Rs. " + disPrice);
        } else if (material == "lumber") {
            double dis = 0.3 * price;
            disPrice = price - dis;
            System.out.println("The discounted price of the " + material + " " + type + " is Rs. " + disPrice);
        } else {
            double dis = 0.4 * price;
            disPrice = price - dis;
            System.out.println("The discounted price of the " + material + " " + type + " is Rs. " + disPrice);
        }
    }

    public static void main(String[] args) {
        Furniture furniture=new Furniture("Chair","Lumber",10000);
        furniture.printType();
        furniture.printMaterial();
        furniture.printPrice();
        System.out.println();
        furniture.calculatePrice();
    }
    }
