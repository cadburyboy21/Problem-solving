package ConditionalStatement.Functions.Methods;

public class Shodowing {
    static int x=90;
    public static void main(String[] args) {
        System.out.println(x);
        int x=40;
        System.out.println(x);
        fun();
    }

    static void fun(){
        System.out.println(x);
    }
}
