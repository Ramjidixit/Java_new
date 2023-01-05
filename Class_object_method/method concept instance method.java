

//method to calculate square root of any number 
import java.lang.Math;
import java.util.*;

class Sqrt {
    public double square(int n) {
        double d = Math.pow(n, 0.5);
        return d;
    }
}

public class Met3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no:");
        int n = sc.nextInt();
        Sqrt t = new Sqrt();
        System.out.println("The square root=" + t.square(n));
    }
}

/* 
import java.lang.Math;
import java.util.*;

class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        SquareRoot t = new SquareRoot();
        System.out.println("THe square root=" + t.sqrt(n));

    }

    double sqrt(int n) {
        double d = Math.pow(n, 0.5);
        return d;
    }
}*/