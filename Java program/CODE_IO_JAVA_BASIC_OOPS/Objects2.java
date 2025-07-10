package CODE_IO_JAVA_BASIC_OOPS;

class AppForm{
    String name;
    int rollNo;

    public void Display(){
        System.out.println(name);
        System.out.println(rollNo);
    }
    public AppForm (String nam,int no){
        this.name=nam;
        this.rollNo=no;
    }
}
public class Objects2 {
    public static void main(String[] args) {
        AppForm t=new AppForm("puvi", 51); // using parameter values
        t.Display();

        // AppForm t1=new AppForm();
        // t1.p1("Ram", 52); // using parameters values
        // t1.Display();
    }

}

