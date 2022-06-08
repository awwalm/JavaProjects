package TypesVariablesArrays;

public class Area {
    char x = 'x';
    public static void main(String[] args) {
        area();
        testBinary();
    }
    static void area() {
        double pi, r, a;
        r = 10.8; // radius of our circle
        pi = 3.1416; // pi, approximately
        a = pi*r*r;
        System.out.println(a);
    }
    static void testBinary() {
        int x = 0b10;
        int y = 0b111;
        System.out.println(x*y);
    }
}

/*Note to self
* Characters in Java are indices into the Unicode character set.
* They are 16-bit values that can be converted into integers and manipulated with operators.
* */
