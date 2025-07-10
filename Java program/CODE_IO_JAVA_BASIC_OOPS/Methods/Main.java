package CODE_IO_JAVA_BASIC_OOPS.Methods;

// abstract class AbstractMethodandClass {
//     abstract void speed();

//     void brand(){
//         System.out.println("XYZ brand");
//     }
// }
// abstract class bike extends AbstractMethodandClass{
//     abstract void speed();
// }
// class vehicle{
//     public static void main(String[] args) {
//         System.out.println("Abstract method is Should be in parent class and also in all child class also.");
//     }
// }

abstract class Abstract{
    abstract void SpecPow();


}
class pow1 extends Abstract{
    void SpecPow(){
        System.out.println("Power is very high");
    }
}

class pow2 extends pow1{
    void Spec(){
        System.out.println("Power is very low");
    }
    void SpecPow(){
        System.out.println("Power medium");
    }
}

class AbstractMethodandClass {
    public static void main(String[] args) {
        pow1 obj = new pow1();
        obj.SpecPow();
        
        pow2 obj2 = new pow2();
        obj2.SpecPow();
        obj2.Spec();
    }
}

