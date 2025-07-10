package CODE_IO_JAVA_BASIC_OOPS;

class animal{
    
    int noLegs=4;

    void Eat(){
        System.out.println("I can eat");
    }

    void walk(){
        System.out.println("i can Walk");
    }
}
class Dog extends animal{
    boolean CanBark = true;
    
    int noLegs = 5;

    void Eat(){
        System.out.println("Dog Also Eating");
    }
}
public class MethodOveriding {
       public static void main(String[] args) {
        animal obj= new animal();
        System.out.println(obj.noLegs);
        obj.Eat();
        obj.walk();

        Dog obj1=new Dog();
        System.out.println(obj1.noLegs);
        System.out.println(obj1.CanBark);
        obj1.Eat();
        obj1.walk();
    }
}
