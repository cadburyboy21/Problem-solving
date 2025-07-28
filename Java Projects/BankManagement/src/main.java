public class main {
    public static void main(String[] args) throws Exception {
       Account obj= new Account("12345", "Poovarasan",0.0 , "1234567890");
       obj.Deposit(100);
       obj.Deposit(500);
       obj.Withdraw(200);
    }
}
