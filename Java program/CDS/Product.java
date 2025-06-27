package CDS;
import java.util.Scanner;

public class Product {
    private long id;
    private String name;
    private double price;
    private double discount;

    public double applyDiscount(double discount){
        return (price*discount)/100;
    }
    public double finalPrice(double price,double discount){
        return this.price-applyDiscount(discount);
    } 
    
    public void main(String[] args) {
        try(Scanner read=new Scanner(System.in);){
            System.out.print("Product Name:");
         name=read.nextLine();
         System.out.print("Product ID:");
         id=read.nextLong();
        System.out.println("Price:");
        price=read.nextLong();
        System.out.println("Discount:");
        discount=read.nextLong();
        
        System.out.println("Discounted Price:"+finalPrice(price,discount));
        }
    }
}