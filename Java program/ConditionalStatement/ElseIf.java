package ConditionalStatement;

// Grades of Student(Question)
// Write a program to print the grades of 3 students based on the marks they have obtained provided as input. The student is graded A if marks are greater than 90, B if marks are greater than 70, C if greater than or equal to 40, else F.

// [Note: You need to take inputs for all 3 students.]


import java.util.Scanner;

class ElseIf
{
	public static void main (String[] args) 
	{
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter the Mark1:");
	 int mark1=s.nextInt();
	 if(mark1>90){
	     System.out.println("A");
	 }
	 else if(mark1>70){
	     System.out.println("B");
	 }
	 else if(mark1>=40){
	     System.out.println("C");
	     }
	     else{
	     System.out.println("F");
	 }

	 System.out.println("Enter the Mark2:");
	 int mark2=s.nextInt();
	 if(mark2>=90){
	     System.out.println("A");
	 }
	 else if(mark2>=70){
	     System.out.println("B");
	 } 
	 else if(mark2>=40){
	     System.out.println("C");
	 }
	 else{
	     System.out.println("F");
	 }
	 
     System.out.println("Enter the Mark3:");
	 int mark3=s.nextInt();
	 if(mark3>=90){
	     System.out.println("A");
	 }
	 else if(mark3>=70){
	     System.out.println("B");
	 }
	 else if(mark3>=40){
	     System.out.println("C");
	 }
	 else{
	     System.out.println("F");
	 }

	}
}

// output:

// Enter the Mark1:
// 92
// A
// Enter the Mark2:
// 75
// B
// Enter the Mark3:
// 55
// C