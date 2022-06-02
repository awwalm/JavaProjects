package Inheritance;

public class Superclass {
    int i, j;

    void showij() {
        System.out.print("i and j: " + i + " " + j);
    }
}

// create a subclass by extending class A
class Subclass extends Superclass {
    int k;

    void showk() {
        System.out.println("k: " + k);
    }

    void sum() {
        System.out.println("i+j+k: " + (i+j+k));
    }
}

class SimpleInheritance {
    public static void main(String[] args) {
        Superclass superOb = new Superclass();
        Subclass subOb  = new Subclass();

        // the superclass may be used by itself
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("contents of superOb: ");
        superOb.showij();
        System.out.println();

        /* The subclass has access to all public members of its superclass. */
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Contents of subOb: ");
        subOb.showij();
        subOb.showk();
        System.out.println();
        System.out.println("Sum of i, j and k in subOb:");
        subOb.sum();

    }
}


// a superclass variable can reference a subclass object














