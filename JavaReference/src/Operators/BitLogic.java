package Operators;

public class BitLogic {
    // Demonstrate the bitwise logical operators
    public static void main(String[] args) {

        String[] binary = {
            "0000", "0001", "0010", "0011",
            "0100", "0101", "0110", "0111",
            "1000", "1001", "1010", "1011",
            "1100", "1101", "1110", "1111"
        };

        int h = 0x0f;
        int a = 3; // 0+2+1 or 0011 in binary
        int b = 6; // 4+2+0 or 0110 in binary
        int c = a | b; // 0011 | 0110 = 0111
        int d = a & b; // 0011 & 0110 = 0010
        int e = a ^ b; // 0011 ^ 0110 = 0101
        int f = (~a & b) | (a & ~b);
        int g = ~a & h;

        System.out.println("a = " + binary[a]);
        System.out.println("b = " + binary[b]);
        System.out.println("a|b = "+ binary[c]);
        System.out.println("a&b = "+ binary[d]);
        System.out.println("a^b = "+ binary[e]);
        System.out.println("~a&b|a&~b = "+ binary[f]);
        System.out.println("~a = "+ binary[g]);
    }
}

// Left shifting a byte
class ByteShift {
    public static void main(String[] args) {
        byte a = 64, b; //
        int i;

        i = a << 2;
        b = (byte) (a << 2);

        System.out.println("Original value of a: " + a); // 64
        System.out.println("i and b: " + i + " " + b); // 256 and 0
    }
}

// Left shifting as a quick way to multiply by 2
class MultByTwo {
    public static void main(String[] args) {
        int i;
        int num = 0xFFFFFFE;

        for (i = 0; i < 4; i++) {
            num = num << 1;
            System.out.println(num);
        }
    }
}

// Unsigned shifting a byte value
@SuppressWarnings("ALL")
class ByteUShift {
    public static void main(String[] args) {
        //int x, y, z = 100, k;

        char hex[] = {
            '0', '1', '2', '3', '4', '5', '6', '7',
            '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
        };

        byte b = (byte) 0xf1; // 0xf1
        byte c = (byte) (b >> 4); // 0xff
        byte d = (byte) (b >>> 4); // 0xff
        byte e = (byte) ((b & 0xff) >> 4); // 0x0f

        System.out.println(" b = 0x" + hex[(b >> 4) & 0x0f] + hex[b & 0x0f]);
        System.out.println(" b >> 4 = 0x" + hex[(c >> 4) & 0x0f] + hex[c & 0x0f]);
        System.out.println(" b >>> 4 = 0x" + hex[(d >> 4) & 0x0f] + hex[d & 0x0f]);
        System.out.println("(b & 0xff) >> 4 = 0x" + hex[(e >> 4) & 0x0f] + hex[e & 0x0f]);
    }
}








