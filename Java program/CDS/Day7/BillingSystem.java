package CDS.Day7;
import java.util.*;

class StandardBill{
 public void calculateFinalAmount(double price, double discountPercent){
        System.out.println("Net payable="+(price-price*discountPercent/100));
 }
}

class PermiumBilling extends StandardBill{
public void calculateFinalAmount(double price, double discountPercent){
        System.out.println("Net payable="+(price-price*discountPercent/100));
}
}
public class BillingSystem {
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);

      System.out.print("price: ");
      double price=sc.nextDouble();

      System.out.print("DiscountPercent=" );
      double discountPercent=sc.nextDouble();

      double finalamount=price-price*discountPercent/100;
      System.out.println("Final Amount= "+ finalamount);
      double Cashback=(finalamount*0.1);
      System.out.println("Cashback = "+ Cashback);

      System.out.println("Net Payable = " + (finalamount-Cashback));
   }

}
