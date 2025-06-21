package CDS.DAY2_NQT.TerinaryStatement;

public class problem1 {
    public static void main(String[] args) {
        int a=1,b=2,c=3,d=4;
        int result=(!(a!=0))?((b!=0)?((c==0)?1:0):((d==0)?1:0)):a;
        System.out.println(result);
    }
    
}
