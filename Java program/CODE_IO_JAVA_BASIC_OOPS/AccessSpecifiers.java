package CODE_IO_JAVA_BASIC_OOPS;

class AccessSpecifiers {
    private String name;
    int RollNumber;

    public  void Display(){
        System.out.println(name);
        System.out.println(RollNumber);
    }

    public void Setvalues(String str,int num){
        name=str;
        RollNumber=num;
    }

    public String getvalue(){
        return name;
    }
}
class main{
    public static void main(String[] args) {
        AccessSpecifiers t=new AccessSpecifiers();
        t.Setvalues("Ram", 7);
        t.Display();

        AccessSpecifiers t1=new AccessSpecifiers();
        t1.Setvalues("Prem", 21);
        t1.Display();
        String t2=t1.getvalue();
        System.out.println(t2+" = t1");

    }
}

// Output:

// Ram
// 7
// Prem
// 21
// Prem = t1