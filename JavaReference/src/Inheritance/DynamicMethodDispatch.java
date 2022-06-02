package Inheritance;

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        System.out.println();
    }
}

// dynamic method dispatch
class AA {
    void callme() {
        System.out.println("Inside A's callme method");
    }
}

class BB extends AA {
    // override callme()
    void callme() {
        System.out.println("Inside B's callme method");
    }
}

class C extends AA {
    // override callme()

    void callme() {
        System.out.println("Inside C's callme method");
    }
}

class Dispatch {
    public static void main(String[] args) {
        AA a = new AA();
        BB b = new BB();
        C c = new C();

        AA r; // obtain a reference of type A

        r = a; // r refers to an A object
        r.callme(); // calls A's version of callme

        r = b; // r refers to a B object
        r.callme(); // calls B's version of callme

        r = c; // r refers to a C object
        r.callme();  // calls C's version of callme
    }
}
