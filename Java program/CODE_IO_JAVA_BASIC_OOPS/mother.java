package CODE_IO_JAVA_BASIC_OOPS;

interface father {
    void call();
    void talk();
    void earn();
    
}
interface mother {
    void call();
    void talk();
    void cook();
    
}
class Son implements father,mother {
   public void call(){
    System.out.println("Calling");
   }
   public void talk(){
    System.out.println("Talking");
   }
   public void cook(){
    System.out.println("Cooking");
   }
   public void earn(){
    System.out.println("Can Earn");
   }

   public static void main(String[] args) {
    Son obj= new Son();
    obj.call();
    obj.talk();
    obj.cook();
    obj.earn();
   }
}


 