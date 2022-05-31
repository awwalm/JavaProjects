package ControlStatements;

import java.io.IOException;

public class Control {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            switch (i) {
                case 0:
                    System.out.println("i is zero.");
                    break;
                case 1:
                    System.out.println("i is one.");
                    break;
                default:
                    System.out.println("i is greater than 0");
            }
        }
    }
}

@SuppressWarnings("ConstantConditions")
class StringSwitch {
    public static void main(String[] args) {

        String str = "two";

        switch (str) {
            case "one":
                System.out.println("one");
                break;
            case "two":
                System.out.println("two");
                break;
            case "three":
                System.out.println("three");
                break;
            default:
                System.out.println("no match");
                break;
        }
    }
}

// using a do-while to process menu selection
class Menu {
    public static void main(String[] args) throws IOException {  // very important for System.in.read() clause
        char choice;
        do {
            System.out.println("Help on: ");
            System.out.println(" 1. if");
            System.out.println(" 2. switch");
            System.out.println(" 3. while");
            System.out.println("4. do-while");
            System.out.println("5. for\n");
            System.out.println("Choose one:");
            choice = (char) System.in.read();

        }
        while (choice < '1' || choice > '5');

        System.out.println("\n");

        switch (choice) {
            case '1':
                System.out.println("The if:\n");
                System.out.println("if(condition) statement;");
                System.out.println("else statement;");
                break;
            case '2':
                System.out.println("The switch:\n");
                System.out.println("switch(expression) {");
                System.out.println(" case constant:");
                System.out.println(" statement sequence");
                System.out.println(" break;");
                System.out.println(" //...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("The while:\n");
                System.out.println("while(condition) statement;");
                break;
            case '4':
                System.out.println("The do-while:\n");
                System.out.println("do {");
                System.out.println(" statement;");
                System.out.println("} while (condition);");
                break;
            case '5':
                System.out.println("The for:\n");
                System.out.print("for(init; condition; iteration)");
                System.out.println(" statement;");
                break;
        }
    }
}

// Test for primes
@SuppressWarnings("ALL")
class FindPrime {
    public static void main(String[] args) throws IOException {
        int num;
        boolean isPrime;

        num = (int) System.in.read();

        isPrime = num >= 2;
        /*or just
        if (num < 2) isPrime = false;
        else isPrime = true;
        */

        for (int i=2; i <= num/i; i++) {
            if((num % 1) == 0) {
                isPrime = false;
                break;
            }
        }
    }
}

// Using the comma
class Comma {
    public static void main(String[] args) {
        int a, b;
        for (a=1, b=4; a<b; a++, b--) {
            System.out.println("a = "+ a);
            System.out.println("b = "+ b);
        }
    }
}

// For each
class ForEach {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;

        // use for each style for loop to display and sum the values
        for (int x: nums) {
            System.out.println("value is: " + x);
            sum += x;
        }
         System.out.println("Summation: " + sum);
    }
}

// Using break as a civilized form of goto
@SuppressWarnings("ALL")
class Break {
    public static void main(String[] args) {
        boolean t = true;

        first :
        {
            second :
            {
                third :
                {
                    System.out.println("Before the break.");
                    if(t) break second; // break out of second block;
                    System.out.println("This is after second block.");
                }
                System.out.println("This wont execute");
            }
            System.out.println("This is after second block.");
        }
    }
}

// using break to exit from nested loops
class BreakLoop4 {
    public static void main(String[] args) {
        outer : for (int i = 0; i < 3; i++) {
            System.out.print("Pass " + i + ": ");
            for (int j=0; j<100; j++) {
                if(j == 10) break outer; //  exit both loops
                System.out.println(j + " ");
            }
            System.out.println("This will not print.");
        }
        System.out.println("Loops complete.");
    }
}

// Demonstrate continue
class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if (i%2 == 0) continue;
            System.out.println();
        }
    }
}

// Using continue with a label
class ContinueLabel {
    public static void main(String[] args) {
        outer : for (int i = 0; i < 10; i++) {
            for (int j=0; j<10; j++) {
                if (j>i) {
                    System.out.println();
                    continue outer;
                }
                System.out.print(" " + (i*j));
            }
        }
        System.out.println();
    }
}






