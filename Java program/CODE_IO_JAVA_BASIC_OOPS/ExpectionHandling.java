package CODE_IO_JAVA_BASIC_OOPS;

public class ExpectionHandling {
    public static void main(String[] args) {
        int a=5;
        int b=0;

        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException E){
        System.out.println("b is Zero");
        }

        System.out.println("This is Expection Handling");
    }
}
