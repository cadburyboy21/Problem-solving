package ConditionalStatement.Functions.Methods;

public class FuncationOverloading {
    public static void main(String[] args) {
        fun(50);
        fun("java");
    }


static void fun(int a){
    System.out.println(a);
}

static void fun(String name){
    System.out.println(name);
}
}
