package CODE_IO_JAVA_BASIC_OOPS.Methods;

public class Recursion{
   public static void main(String[] args) {
    Nnaturalno(10);
   }

public static void Nnaturalno(int n){
    // Base Case
      if( n==1){
        System.out.println(1); 
      }
      //Recursion case
      else{
        System.out.println(n);
        Nnaturalno(n-1);
      }
  }
}