package CDS.Patterns;

public class Pattern4 {
    public static void main(String[] args) {
        for(int i=5;i>0;i--){
            for(int j=i;j<=5;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

// Output

// 5 
// 4 5
// 3 4 5
// 2 3 4 5
// 1 2 3 4 5