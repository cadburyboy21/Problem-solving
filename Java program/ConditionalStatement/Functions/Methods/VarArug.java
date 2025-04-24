package ConditionalStatement.Functions.Methods;

import java.util.Arrays;

public class VarArug {
    public static void main(String[] args) {
        fun(10,20,"Tamil","English","Maths","Science","More Strings"
            
        );
    }
    static void fun(int a,int b,String ...v)// Variable Argument is only comes at the last 
    {
        System.out.println(Arrays.toString(v));

    }
}
