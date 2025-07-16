package CODE_IO_JAVA_BASIC_OOPS;

class Father {
    char gender = 'M';

    void print() {
        System.out.println("Father is male");
    }
}

class Mother extends Father {
    char gender = 'F';

    @Override
    void print() {
        System.out.println("Mother is Female");
        super.print();
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Father obj = new Father();
        System.out.println(obj.gender);

        Mother obj1 = new Mother();
        obj1.print();
        System.out.println(obj1.gender);
    }
}