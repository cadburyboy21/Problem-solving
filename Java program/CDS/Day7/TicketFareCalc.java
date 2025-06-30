package CDS.Day7;
import java.util.*;
class ticket{
    public void calculateFare(float Basefare,float TotalFare){
      System.out.println("Total fare= "+(TotalFare+250));
    }
}
public class TicketFareCalc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Base Fare = ");
        int BaseFare=sc.nextInt();

        ticket t=new ticket();
        t.calculateFare(BaseFare, BaseFare);
        
    }
}
