package CDS;
public  class ClassMethod{
    public static boolean hasAge(int age){
        if(age>=18) return true;
        else return false;
    }
    public static void main(String[] args) {
        hasAge(18);
        System.out.println(hasAge(20));
    }
}