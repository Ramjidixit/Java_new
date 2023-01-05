//constructor and rules 

/*public class Cla2 {
    String name;
    int age;
    int marks;

    public static void main(String[] args) {
        Cla2 s1 = new Cla2();
        Cla2 s2 = new Cla2();
        System.out.println(s1.name); // null
        System.out.println(s1.age); // 0
        System.out.println(s1.marks); // 0
        System.out.println(s2.name); // null
        System.out.println(s2.age); // 0
        System.out.println(s2.marks); // 0
    }
}*/
//in every case it gives value as null,0,0 which is meaningful therefore it is needed to initialize all the objects.

//so for every initialization we need something called constructor to initialize all such values 

//constructor concept is specially designed to initialize the object :

//how to write constructor 
/* 
public class Cla2 {
    String name;
    int age;
    int marks;

    Cla2(String name, int age, int marks) {
        this.name = name; // this denote current object
        this.age = age;
        this.marks = marks;

    }

    public static void main(String[] args) {
        Cla2 s1 = new Cla2("rajeev", 15, 18);
        System.out.println(s1.name); // rajeev
        System.out.println(s1.age); // 15
        System.out.println(s1.marks); // 18

        Cla2 s2 = new Cla2("ravi", 19, 28);
        System.out.println(s2.name); // ravi
        System.out.println(s2.age); // 19
        System.out.println(s2.marks); // 28

    }
}*/
/* 
class Cla2 {
    Cla2() {
        System.out.println("constructor hai");
    }

    public static void main(String[] args) {
        Cla2 t1 = new Cla2();
        Cla2 t2 = new Cla2();
        Cla2 t3 = new Cla2();
    }
}*/
/*
 * constructor hai
 * constructor hai
 * constructor hai
 */
/* 
 class Cla2 {
    void Cla2() {
        System.out.println("constructor hai");
    }

    public static void main(String[] args) {
        Cla2 t1 = new Cla2();
        Cla2 t2 = new Cla2();
        Cla2 t3 = new Cla2();
    }
}*/
//code compile and run but no output, because here is no constructor here is method 
/* 
class Cla2 {
    void Cla2() {
        System.out.println("constructor hai");
    }

    public static void main(String[] args) {
        Cla2 t1 = new Cla2();
        t1.Cla2();   //now method calling 
    }
}*/
//constructor hai

//when we call then execute--method otherwise its construtor   constructor have no return type 
//its not a good programmking practice having method name as class name 
//the access modifier for construcor are public,private,default,protected 

class Cla2 {
    public Cla2() {
        System.out.println("constructor hai");
    }

    public static void main(String[] args) {
        Cla2 t1 = new Cla2();

    }

}
// constructor hai