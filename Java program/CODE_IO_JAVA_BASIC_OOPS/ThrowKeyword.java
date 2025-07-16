package CODE_IO_JAVA_BASIC_OOPS;

public class ThrowKeyword {
    static void Check(int age){
        if(age<18){
            throw new ArithmeticException("Age is Invalid");

        }
    }

    public static void main(String[] args) {
            int a=5;
            try{
            Check(17);
            }
            catch(ArithmeticException E){
                System.out.println(E.getMessage());

            }
            
            System.out.println("Exit");
        
    }
}
