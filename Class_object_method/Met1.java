
//Write a Java method to compute the average of three numbers

//method 1
/* 
import java.util.*;

class Avg {
    public int average(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        return avg;
    }
}

public class Met1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Avg av = new Avg();
        av.average(a, b, c);
        System.out.println("The average=" + av.average(a, b, c));
    }

}


//second method 
import java.util.*;

class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("The average=" + avg(a, b, c));
    }

    public static int avg(int a, int b, int c) {
        a = (a + b + c) / 3;
        return a;
    }
}*/

//third method 

import java.util.*;

class Average {
    public static void main(String[] args) {
        System.out.println("The average=" + avg());
    }

    public static int avg() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        a = (a + b + c) / 3;
        return a;
    }
}