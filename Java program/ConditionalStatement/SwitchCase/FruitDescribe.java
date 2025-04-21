package ConditionalStatement.SwitchCase;
import java.util.*;

public class FruitDescribe {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String fruit=input.next();

        switch (fruit) {
            case "Mango":
                System.out.println("King of the Fruit!!");
                break;
            case "Orange":
                System.out.println("Round and sweet fruit");
                break;
            case "Graphes":
                System.out.println("Small fruit");
                break;
            case "Banana":
                System.out.println("Yellow friut");
                break;
                case "Watermelon":
                System.out.println("Summer Special fruit");
                break;
            default:
            System.out.println("Enter the Vaild Fruit");
                break;
        }
    }
}
