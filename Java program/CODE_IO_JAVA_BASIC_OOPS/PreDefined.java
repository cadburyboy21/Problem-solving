package CODE_IO_JAVA_BASIC_OOPS;

import java.util.function.BinaryOperator;

public class PreDefined {
    public static void main(String[] args) {
        // to.String
        // to.BinaryString
        // valueof

        String s=Integer.toString(55);
        System.out.println(s);

        String x=Integer.toBinaryString(15);
        System.out.println(x);

        String a=Integer.toHexString(15);
        System.out.println(a);

    }
}
