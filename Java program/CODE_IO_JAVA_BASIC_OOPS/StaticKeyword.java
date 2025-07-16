package CODE_IO_JAVA_BASIC_OOPS;

public class StaticKeyword {

    int age=50;
    static void father() {
        System.out.println("Male");
    }
}
class MOTHER{
    static int age=30;
}

class FATHER {
    public static void main(String[] args) {
        StaticKeyword.father(); 
        System.out.println(MOTHER.age);


    }

}
