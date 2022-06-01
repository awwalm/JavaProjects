package ExceptionHandling;

public class ThrowDemo {
    static void demoproc() {
        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("caught inside demoproc");
            throw e;   // rethrow the exception
        }
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Re-caught: " + e);
        }
    }
}

class ThrowsDemo {
    static void throwOne() throws IllegalStateException, IllegalArgumentException {
        System.out.println("Inside throwOne.");
        throw new IllegalStateException("demo");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalStateException e) {
            System.out.println("caught: " + e);
        }
    }
}
