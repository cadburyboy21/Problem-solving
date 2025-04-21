package ConditionalStatement;

public class IfStatment {
    public static void main(String[] args) {
        int salary =15000;

        if(salary>=20000){
            salary+=3000;
            System.out.println(salary);
        }
        else if(salary>=10000){
            salary+=2000;
            System.out.println(salary);
        }
        else {
         System.out.println("No Change");
        }
    }
}
