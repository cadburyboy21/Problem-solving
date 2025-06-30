package CDS.Patterns;

public class Pattern1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {     // Rows
            for (int j = 1; j <= i; j++) { // Columns
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

//Output:

// 1  
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5