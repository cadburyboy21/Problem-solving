package CODE_IO_JAVA_BASIC_OOPS;

public class ThrowKeyword {
    static void Check(int age){
        if(age<18){
            throw new ArithmeticException("Age is Invalid");

        }
    }

    public static void main(String[] args) {
            try{
            Check(17);
            }
            catch(Exception E){
                System.out.println(E.getMessage());

            }
            
            System.out.println("Exit");
        
    }
}
