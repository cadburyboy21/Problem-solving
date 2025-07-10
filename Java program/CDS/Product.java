package CDS;
import java.util.Scanner;

public class Product {
    private long id;
    private String name;
    private double price;
    private double discount;

    public double applyDiscount(double discount){
        return (price * discount) / 100;
    }
    public double finalPrice(double discount){
        return this.price - applyDiscount(discount);
    } 
    
    public static void main(String[] args) {
        Product product = new Product();
        try (Scanner read = new Scanner(System.in)) {
            System.out.print("Product Name:");
            product.name = read.nextLine();
            System.out.print("Product ID:");
            product.id = read.nextLong();
            System.out.print("Price:");
            product.price = read.nextDouble();
            System.out.print("Discount:");
            product.discount = read.nextDouble();
            System.out.println("Discounted Price:" + product.finalPrice(product.discount));
        }
    }
}