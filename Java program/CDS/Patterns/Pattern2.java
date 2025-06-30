package CDS.Patterns;

public class Pattern2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {     // Rows
            for (int j = 1; j <= i; j++) { // Columns
                System.out.print("#"+" ");
            }
            System.out.println();
        }
    }
}

// Output

// # 
// # # 
// # # # 
// # # # # 
// # # # # # 