package Java_100_Programs;

public class DuplicateElementinArray {
    public static void main(String[] args) {
        String a[] = { "Java", "C", "C++", "html", "Python", "Java" };
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println("Duplicate Element: "+a[i]);
                }
            }
        }
    }
}
