package CODE_IO_JAVA_BASIC_OOPS;
import java.util.*;

class AppForm{
    String name;
    int rollNo;

    public void Display(){
        System.out.println(name);
        System.out.println(rollNo);
    }

}
class ClassndObject{
    public static void main(String[] args) {
        AppForm t=new AppForm();
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int rollNo = sc.nextInt();

        t.name= name;
        t.rollNo= rollNo;

        t.Display();

        AppForm t1= new AppForm();
        t1.name="Ram";
        t1.rollNo=5754;
        t1.Display();
    }
}
