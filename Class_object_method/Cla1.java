//object creation and calling 


class Ram {
    String name = "Ram ji dixit";
    int age = 10;
    long mobile_no = 95598;

}

class kji {
    String name = " ji dixit";
    int age = 17;
    long mobile_no = 97896;
}

public class Cla1 {
    public static void main(String[] args) {
        Ram r = new Ram();
        System.out.println(r.name);
        System.out.println(r.age);
        System.out.println(r.mobile_no);
        kji p = new kji();
        System.out.println(p.name);
        System.out.println(p.age);
        System.out.println(p.mobile_no);

    }

}
/*
 * Ram ji dixit
 * 10
 * 95598
 * ji dixit
 * 17
 * 97896
 */