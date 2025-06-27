package CODE_IO_JAVA_BASIC_OOPS;
import java.awt.Point;

public class ReferenceDatatypeEg {
    public static void main(String[] args) {
        
        Point p1= new Point(5,7);
        Point p2=p1;
        System.out.println(p2);

        p1.x=7;

        System.out.println(p1);
        System.out.println(p2);

    }
}

// Output:

// java.awt.Point[x=5,y=7]
// java.awt.Point[x=7,y=7]
// java.awt.Point[x=7,y=7]
