package CODE_IO_JAVA_BASIC_OOPS.Methods;

//Without parameters
public class Method_withoutPara {
    public static void main(String[] args) {
        add(4,5);
        System.out.println("Sum of A and B is Printed");
        sub();
        System.out.println("Difference of A and B is Printed");


    }
    public static void add(int a,int b){
        
        int c=a+b;
        System.out.println(c);
    }
    public static void sub(){
        int a=10;
        int b=5;
        int c=a-b;
        System.out.println(c);
   
    }
}

// output:

// 25
// Sum of A and B is Printed


