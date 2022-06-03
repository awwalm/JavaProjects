package Methods;

import java.util.Arrays;

@SuppressWarnings("ALL")
public class OverloadDemo {
    void test() {
        System.out.println("No parameters");
    }

    // overload test for one integer parameter
    void test(int a) {
        System.out.println("a: " + a);
    }

    // Overload test for two integer parameters.
    void test(int a, int b) {
    System.out.println("a and b: " + a + " " + b);
    }

// Overload test for a double parameter
    double test(double a) {
    System.out.println("double a: " + a); return a*a;
    }
}

class Overload {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        double result;
        // call all versions of test()
        ob.test();
        ob.test(10);
        ob.test(10, 20);
        result = ob.test(123.25);
        System.out.println("Result of ob.test(123.25): " + result);
    }
}

// Overloading constructors
class Box {
    double width, height, depth;

    // this is the constructor for Box.
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // constructor when no dimensions specified
    Box() {
        width = -1; height = -1; depth = -1;
    }

    // constructor when cube is created
    Box(double len) {
        width = height = depth = len;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}

// simple recursion
// two return statements
class Factorial {
    int fact(int n) {
        int result;

        if (n==1) return 1;
        result = fact(n-1) * n;
        return result;
    }
}

// only one return statement, anything else is not ignored if it's relevant
class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println("Factorial of 3 is " + f.fact(3));
        System.out.println("Factorial of 4 is " + f.fact(4));
        System.out.println("Factorial of 100 is " + f.fact(15));
    }
}

class RecTest {
    int[] values;

    RecTest(int i) {
        values = new int[i];
    }

    // display array -- recursively
    // note: you have to put the integers in the array before doing this
    void printArray(int i) {
        if (i==0) return;
        else printArray(i-1);
        System.out.println("[" + (i-1) + "] " + values[i-1]);
    }
}

class Recursion2 {
    public static void main(String[] args) {
        RecTest ob = new RecTest(10);
        int i;

        for (i = 0; i < 10; i++) ob.values[i] = i;

        ob.printArray(10);
    }
}

// differences between public and private
class Test {
    int a; // default access
    public int b; // public access
    private int c; // private access

    // methods to access c
    void setC (int i) {
        c = i;
    }
    int getC () {
        return c;
    }
}

class  AccessTest {
    public static void main(String[] args) {
        Test ob = new Test();

        // ok
        ob.a = 10;
        ob.b = 20;

        /* not ok
        ob.c = 100;*/

        // we use getters and setters
        ob.setC(100);
        System.out.println("a, b, and c: " + ob.a + " " + ob.b + " " + ob.getC());
    }
}





















