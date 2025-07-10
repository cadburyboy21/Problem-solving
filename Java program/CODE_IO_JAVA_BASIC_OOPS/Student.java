package CODE_IO_JAVA_BASIC_OOPS;

// class Constructor {
//     int rolno;
//     int mark;
  
//      Constructor(int num,int m){
//         System.out.println("This is Defualt Value");
//         rolno=num;
//         mark=m;
//     }

//     void Display(){
//         System.out.println(rolno);
//         System.out.println(mark);
//     }
// }
// class Construc{
//     public static void main(String[] args) {
//         Constructor t=new Constructor(75, 50);
//         System.out.println(t.rolno);
//         System.out.println(t.mark);
//     }
// }

public class Student {
    String name;
    int age;

    // Default constructor (no parameters)
    Student() {
        name = "Pavithra";
        age = 0;
    }

    // Method to display values (no parameters)
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Constructor called automatically
        Student s1 = new Student();

        // Method called manually
        s1.displayInfo();
    }
}