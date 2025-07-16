package CODE_IO_JAVA_BASIC_OOPS;

public class FinalKeyword {
    final char gender='M'; //This should not be Overwrite and can't be Change the Value.

    final void print(){
        System.out.println("MALE");
    }
}

class Keyword extends FinalKeyword{
    public static void main(String[] args) {
        FinalKeyword obj= new FinalKeyword();
        obj.print();
        System.out.println(obj.gender);
    }
    // void print(){
    //     System.out.println("Female");
    }
