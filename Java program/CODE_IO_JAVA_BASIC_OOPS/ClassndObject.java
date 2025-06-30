package CODE_IO_JAVA_BASIC_OOPS;
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
        t.name="Puvi";
        t.rollNo=12345;
        t.Display();

        AppForm t1= new AppForm();
        t1.name="Ram";
        t1.rollNo=5754;
        t1.Display();
    }
}
