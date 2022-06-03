package Methods;

import java.util.Arrays;

// use an array to pass a variable number of arguments to a method.
// this is the old style approach to variable-length arguments.
public class VarLenArray {

    static void vaTest(int[] v) {
        System.out.println("Number of args: " + v.length + " Contents: ");
        for (int x: v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        // notice how an array must be created to hold arguments
        int[] n1 = { 10 };
        int[] n2 = { 1, 2, 3 };
        int[] n3 = {  };
        vaTest(n1); // 1 arg
        vaTest(n2); // 3 args
        vaTest(n3); // no args
    }

}

// use var args with standard arguments
class VarArgs {

    // here, msg is a normal parameter and v is a varargs parameter
    static void vaTest(String msg, int ... v) {
        System.out.print(msg + v.length + "Contents: ");

        for (int x: v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("One vararg: ", 10);
        vaTest("Three varargs: ", 1, 2, 3);
        vaTest("No varargs: ");
    }
}

