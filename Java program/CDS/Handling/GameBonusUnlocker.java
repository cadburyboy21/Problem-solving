package CDS.Handling;
import java.util.*;

public class GameBonusUnlocker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        try{
            System.out.print("Value = ");
            int value=sc.nextInt();

            System.out.print("bonusCode = ");
            int bonusCode=sc.nextInt();

            System.out.println("Bonus Unlocked: RS "+(value/bonusCode));
        }
        catch (Exception e){

        }
        finally{

        }
    }
    }

