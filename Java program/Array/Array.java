package Array;

import java.util.Scanner;
import java.util.Arrays;

public class Array {
   public static void main(String[] args) {

      //Question
      //1.input and output of array
      //2.input and output of 2D array
      //3.Sum of Array
      //4.Find Max element in Array
      //5.Find Secoond Max element in Array
      //6.Find Duplicate Numbers and print the count of Duplicate element.
      //7.Remove the Repeated element the print the Array.
      //8.Reverse the array.

      // Q-1 print index values

      // int[] arr=new int[6];
      // arr[0]=23;
      // arr[1]=25;
      // arr[2]=50;
      // arr[3]=12;
      // arr[4]=49;
      // arr[5]=250;
      // System.out.println(arr[4]);
      // -----------------------------------------------------------------------------------------

      Scanner sc = new Scanner(System.in);

      // Getting input and print input values

      // int[] arr=new int[5];
      // for(int i=0;i<arr.length;i++){
      // arr[i]=sc.nextInt();
      // }
      // for(int i=0;i<arr.length;i++){
      // System.out.print(arr[i]+" ");
      // }

      // for(int num:arr){//for each method to print tha values
      // System.out.print(num+ " ");
      // }

      // System.out.println(Arrays.toString(arr)); // To convert integer to String

      // -----------------------------------------------------------------------------------------

      // String[] str= new String[5];
      // for(int i=0;i<str.length;i++){
      // str[i]=sc.next();
      // }
      // // method 1 to print string
      // for(String a:str){
      // System.out.print(a+" ");
      // }

      // //method 2 to print string
      // System.out.println(Arrays.toString(str));

      // //method 3 to print string
      // for(int i=0;i<str.length;i++){
      // System.out.print(str[i]+" ");
      // }

      // ------------------------------------------------------------------------------------------

      // Q-2 2D array

      // int[][] arr = new int[3][3];
      // System.out.println(arr.length);

      // // Input
      // for (int row = 0; row < arr.length; row++) {
      // for (int col = 0; col < arr[row].length; col++) {
      // arr[row][col] = sc.nextInt();
      // }
      // }
      // Method 1 to print o/p

      // for (int row = 0; row < arr.length; row++) {
      // for (int col = 0; col < arr[row].length; col++) {
      // System.out.print(arr[row][col] + " ");
      // }
      // }

      // method 2 to print O/p

      // for(int row=0;row<arr.length;row++){
      // System.out.println(Arrays.toString(arr[row]));
      // }
      // System.out.println();

      // method 3 to print O/p
      // for(int[] a:arr){
      // System.out.println(Arrays.toString(a));
      // }

      // -------------------------------------------------------------------------------------

      // Q-3 SumofArray

      // int[] arr=new int[5];
      // for(int i=0;i<arr.length;i++){
      // arr[i]=sc.nextInt();
      // }
      // for(int i=0;i<arr.length;i++){
      // System.out.print(arr[i]+" ");
      // }
      // int sum=0;
      // for(int nums:arr){
      // sum+=nums;
      // }
      // System.out.println();
      // System.out.println(sum);

      // -----------------------------------------------------------------------------------------

      // Q-4 Find max element in an array--> method 1

      // int[] arr=new int[5];
      // for(int i=0;i<arr.length;i++){
      // arr[i]=sc.nextInt();
      // }

      // int max=arr[0];
      // for(int i=1;i<arr.length;i++){
      // if(max<arr[i]){
      // max=arr[i];
      // }
      // }
      // System.out.println(max);

      // Find Max Element in the Array.-->Method 2

      // int[] arr = new int[5];
      // for (int i = 0; i < arr.length; i++) {
      // arr[i] = sc.nextInt();
      // }
      // Arrays.sort(arr);
      // System.out.println(Arrays.toString(arr));
      // System.out.println(arr[arr.length - 1]);

      // Q-5 Find second max element in the Array.--> Method 1

      // int[] arr=new int[5];
      // for(int i=0;i<arr.length;i++){
      // arr[i]=sc.nextInt();
      // }
      // Arrays.sort(arr);
      // System.out.println(Arrays.toString(arr));
      // System.out.println(arr[arr.length-2]);

      // ----------------------------------------------------------------------------------------
      // Q-6 Find the Duplicate values and count

      // int arr[]={1,2,2,3,1,7,45,2};
      // int visited[]=new int[100];
      // int i,j;

      // for( i=0;i<arr.length;i++){
      // if(visited[i]==1) continue;
      // int count=1;

      // for( j=i+1;j<arr.length;j++){
      // if(arr[i]==arr[j]){
      // count++;
      // visited[j]=1;

      // }
      // }
      // System.out.println("Number "+arr[i]+" Count:"+ count);
      // }
      // ---------------------------------------------------------------------------------------------

      // Q-7 Remove the duplicate element and print the array.

      // int arr[]={1,2,2,3,1,7,45,2};
      // int visited[]=new int[100];
      // int i,j;

      // for( i=0;i<arr.length;i++){
      // if(visited[i]==1) continue;

      // for( j=i+1;j<arr.length;j++){
      // if(arr[i]==arr[j]){

      // visited[j]=1;

      // }
      // }
      // System.out.print(arr[i]+" ");
      // }

      //-------------------------------------------------------------------------------

      //Reverse the array elements-->Method 1

      // int arr[]={1,2,3,4,5,6};
      // int start=0;
      // int end=arr.length-1;
      // while(start<end){
      //    int temp=arr[start];
      //    arr[start]=arr[end];
      //    arr[end]=temp;
      //    start++;
      //    end--;
      // }
      // System.out.println(Arrays.toString(arr));


      //Reverse the array elements-->Method 2
      // int arr[]={1,2,3,4,5,6};
      // int length=arr.length;
      // System.out.println(length);
      // for(int i=length-1;i>=0;i--){
      //    System.out.print(arr[i]+" ");
      // }

      //------------------------------------------------------------------------------------
      
      int arr[]={1,2,3,4,5,6,7};
      



   }
}
