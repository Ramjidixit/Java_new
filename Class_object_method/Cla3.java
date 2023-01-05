//Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign
//the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.
/* 
class Student {
    String name;
    int roll_no;
}

public class Cla3 {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "John";
        s.roll_no = 2;
        System.out.println("The name is " + s.name + " and roll_no = " + s.roll_no);
    }
}

// Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units
//by creating a class named 'Triangle' without any parameter in its constructor.

class Triangle{
    int a=3;
    int b=4;
    int c=5;
    void Perimeter(){
        System.out.println("perimeter="+(a+b+c));
    }
    void area(){
        double s=(a+b+c)/2;
        double area=s*(s-a)*(s-b)*(s-c);
        double area1=Math.pow(area,0.5);
        System.out.println("Area of a triangle="+area1);

    }

}
class Cla3{
    public static void main(String[] args) {
        Triangle t=new Triangle();
        t.Perimeter();
        t.area(); 
     }
}*/

//Write a program to print the area of a rectangle by creating a class named 'Area' taking the values
//of its length and breadth as parameters of its constructor and having a method named 'returnArea' 
//which returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.

import java.util.*;

class Area {
    int length, breadth;

    Area(int l, int b) {
        length = l;
        breadth = b;
    }

    int returnArea() {
        int area = length * breadth;
        return area;

    }
}

class Cla3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length:");
        int l = sc.nextInt();
        System.out.println("Enter the breadth:");
        int b = sc.nextInt();
        Area p = new Area(l, b);
        System.out.println("The area=" + p.returnArea());
    }
}