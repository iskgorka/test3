
public class Operators {
    public static void main(String[] args) {
        int b = 19;
        int d = 2;
        int j = 2;
        int k = 200;
        int a = 0;
        int c = 0;
        int i = 10;
        if (i == 10) {
            if (j < 20) a = b;
            System.out.println("a = " + a); // a = 19
            if (k > 200) c = d;
            System.out.println("c = " + c); // c = 0
            a = c;
        } c = 300;
        System.out.println("a = " + a); // a = 0
        System.out.println("b = " + b); // b = 19
        System.out.println("c = " + c); // c = 300
        System.out.println("d = " + d); // d = 2

    }

        /*
Example 1
        int a = 4;
        int b = 2;
        int c, d;
        c = ++b + 7;
        d = a++ - 1;
        c++;
        System.out.println("a = " + a); // a = 5
        System.out.println("b = " + b); // b = 3
        System.out.println("c = " + c); // c = 11
        System.out.println("d = " + d); // d = 3

Ternary Operator
        int i, k;
        i = 10;
        k = i < 0 ? -i : i; // i = 10; k = 10
        System.out.println("i = " + i + ", k = " + k);
        i = -10;
        k = i < 0 ? -i : i; // i = -10; k = 10
        System.out.println("i = " + i + ", k = " + k);

Example 3
        int x = 19;
        int y = 3;
        int z = 3;
        int a = ++x + y * z; //(++x)+(y*z)
        System.out.println("a = " + a); //29
        System.out.println("x = " + x); //20
        int b = x % y * z;
        System.out.println("b = " + b); //6

        */
    }
