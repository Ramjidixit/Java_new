
//program to draw a line 
import java.util.*;

class Line {
    void draw(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("-");
        }
    }
}

public class Met4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Line l = new Line();
        l.draw(n);

    }
}
