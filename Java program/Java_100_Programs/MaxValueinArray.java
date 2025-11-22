package Java_100_Programs;

public class MaxValueinArray {
    public static void main(String[] args) {
        int a[]={40,50,70,90,20};

        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max);
    }
}
