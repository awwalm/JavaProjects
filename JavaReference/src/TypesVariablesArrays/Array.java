package TypesVariablesArrays;

public class Array {
    public static void main(String[] args) {
        int[] month_days;
        month_days = new int[12];
        month_days[0] = 31;
        month_days[1] = 28;
        month_days[2] = 31;
        month_days[3] = 30;
        month_days[4] = 31;
        month_days[5] = 30;
        month_days[6] = 31;
        month_days[7] = 31;
        month_days[8] = 30;
        month_days[9] = 31;
        month_days[10] = 30;
        month_days[11] = 31;
        System.out.println("April has " + month_days[3] + " days.");
    }
}

class AutoArray {
    public static void main(String[] args) {
        //noinspection CStyleArrayDeclaration
        int month_days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        System.out.println("April has " + month_days[3] + " days.");
    }
}

class Average {
    public static void main(String[] args) {
        //noinspection CStyleArrayDeclaration
        double nums[] = { 0.1, 11.2, 12.3, 13.4, 14.5 };
        double result = 0;
        int i;

        for (i = 0; i < 5; i++) {
            result += nums[i];
        }
        System.out.print("Average is "+ result/5);
    }
}

// Demonstrate a two-dimensional Array
class TwoDArray {
    public static void main(String[] args) {
        //noinspection CStyleArrayDeclaration
        int twoD [][] = new int [4][5];
        int i, j, k = 0;

        for (i = 0; i < 4; i++) {
            for (j=0; j<5; j++) {
                twoD[i][j] = k;
                k++;
            }
        }

        for (i = 0; i < 4; i++)
        {
            for (j = 0; j < 5; j++)
            {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// demonstrate a three-dimensional matrix
class ThreeDMatrix {
    public static void main(String[] args) {
        //noinspection CStyleArrayDeclaration
        int threeD [][][] = new int [3][4][5];
        int i,j,k;

        for (i = 0; i < 3; i++)
            for (j=0; j<4; j++)
                for (k=0; k<5; k++)
                    threeD[i][j][k] = i*j*k;

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                for (k = 0; k < 5; k++) {
                    System.out.print(threeD[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
