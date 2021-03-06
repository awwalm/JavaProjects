package Operators;

public class BasicMath {
    public static void main(String[] args) {

        // arithmetic using integers
        System.out.println("Integer Arithmetic");
        int a = 1 + 1; int b = a * 3; int c = b / 4; int d = c - a; int e = -d;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);

        // arithmetic using doubles
        System.out.println("\nFloating Point Arithmetic");
        double da = 1 + 1; double db = da * 3; double dc = db / 4; double dd = dc - a; double de = -dd;
        System.out.println("da = " + da);
        System.out.println("db = " + db);
        System.out.println("dc = " + dc);
        System.out.println("dd = " + dd);
        System.out.println("de = " + de);
    }
}

class Modulus {
    public static void main(String[] args) {
        int x = 42;
        double y = 42.25;

        System.out.println("x mod 10 = " + x % 10);
        System.out.println("y mod 10 = " + y % 10);
    }
}

/*
* Note to self:
* negative integers are represented in Java by complementing zeros and adding 1 to the result.
* ++x is called pre-increment while x++ is called post-increment.

int x = 5, y = 5;

System.out.println(++x); // outputs 6
System.out.println(x); // outputs 6

System.out.println(y++); // outputs 5
System.out.println(y); // outputs 6
* */