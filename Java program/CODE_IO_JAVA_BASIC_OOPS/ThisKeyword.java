package CODE_IO_JAVA_BASIC_OOPS;

class Father {
    char Gender;
    int age;
    public void print(char Gender, int age) {
        this.Gender = Gender;
        this.age = age;
        // Optionally, print values here if needed
        // System.out.println(this.Gender);
        // System.out.println(this.age);
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        Father obj = new Father();
        obj.print('M', 50);
        System.out.println(obj.Gender);
        System.out.println(obj.age);
    }
}
