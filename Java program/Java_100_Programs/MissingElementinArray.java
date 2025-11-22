package Java_100_Programs;

public class MissingElementinArray {
    public static void main(String[] args) {
        int a[]={1,2,4,5};
        int sum1=0;
        for(int i=0;i<a.length;i++){
            sum1=sum1+a[i];
        }
        System.out.println("Sum of Elements in Array: "+sum1);

        int sum2=0;
        for(int i=1;i<=5;i++){
            sum2=sum2+i;
        }
        int Missing=sum2-sum1;
        System.out.println("Sum of Elements With missing number: "+sum2);
        System.out.println("Missing Element of Array Is: "+ Missing);
    }
}
