import java.io.IOException;
import java.util.Scanner;

public class Operators {
    public static void main(String[] args) throws IOException {

    }
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

Example Precedence/Приоритетность выполнения операций
        int x = 19;
        int y = 3;
        int z = 3;
        int a = ++x + y * z; //(++x)+(y*z)
        System.out.println("a = " + a); //29
        System.out.println("x = " + x); //20
        int b = x % y * z;
        System.out.println("b = " + b); //6

If Example
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
            if (k > 100) c = d;
            System.out.println("c = " + c); // c = 2
            a = c;
        } c = 300;
        System.out.println("a = " + a); // 2
        System.out.println("b = " + b); // 19
        System.out.println("c = " + c); // 300
        System.out.println("d = " + d); // 2

If-then-else example
        int month = 4;
        String season;
        if (month == 12 || month == 1 || month == 2) season = "зиме";
        else if (month == 3 || month == 4 || month == 5) season = "весне";
        else if (month == 6 || month == 7 || month == 8) season = "лету";
        else if (month == 9 || month == 10 || month == 11) season = "осени";
        else season = "вымешленным месяцам";
        System.out.println("Апрель относится к " + season + ".");

Switch example 1
        int i = 0;
        switch (i){
            case 0:
                System.out.println("i равен нулю.");
                break;
            case 1:
                System.out.println("i равен единице.");
                break;
            case 2:
                System.out.println("i равен двум.");
                break;
            case 3:
                System.out.println("i равен трем.");
                break;
            default:
                System.out.println("i больше трех");
        }

Switch example 2
        String month = "апрель";
        String season;
        switch (month){
            case "декабрь":
            case "январь":
            case "февраль":
                season = "зиме";
                break;
            case "март":
            case "апрель":
            case "май":
                season = "весне";
                break;
            case "июнь":
            case "июль":
            case "август":
                season = "лету";
                break;
            case "сентябрь":
            case "октябрь":
            case "ноябрь":
                season = "осени";
                break;
            default:
                season = "вымешлинным месяцам";
                break;
        }
        System.out.println("Апрель относится к " + season + ".");

While example
        int n = 10;
        while (n>0){
            System.out.println("n = " + n);
            n--;
        }

While example 2 - цикл без тела
        int i = 100;
        int j = 200;
        while (++i < --j);
        System.out.println("Среднее значение = " + i);

Do while example 1
        int i = 10;
        do {
            System.out.println("i = " + i);
        } while (--i > 0);

Do while example 2
        char choise;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Справка по оператору:");
            System.out.println(" 1 if");
            System.out.println(" 2 switch");
            System.out.println(" 3 while");
            System.out.println(" Выберете нужный пункт!");
            choise = sc.nextLine().charAt(0); //Scanner; Reader; System.in.read()
        } while (choise < '1' || choise > '3');
        System.out.println();
        switch (choise) {
            case '1':
                System.out.println("if:");
                System.out.println("if(yсловие) оператор;");
                break;
            case '2':
                System.out.println("switch:");
                System.out.println("switch(выражение) case:");
                break;
            case '3':
                System.out.println("while:");
                System.out.println("while(yсловие) оператор;");
                break;
        }

For Example 1  Простое - Непростое число
        int num;
        boolean isPrime;
        num = 17;
        if (num < 2) isPrime = false;
        else isPrime = true;
        for (int i = 2; i <= num / i; i++) {
            if ((num % i) == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) System.out.println("Простое число");
        else System.out.println("Непростое число");

For Example 2
        int a, b;
        for (a = 1, b = 4; a < b; a++, b--) {
            System.out.println("a = " + a + ", b = " + b);
        }

For Example 3
        int a = 1;
        boolean done = false;
        for (int i = 1; !done; i++) {
            a++;
            System.out.println("a = " + a);
            if (a > 3) done = true;
            System.out.println("done = " + done);
        }

For Example 4
        int i;
        boolean done = false;
        i = 0;
        for (; !done; ) {
            System.out.println("i = " + i);
            if (i == 10) done = true;
            i++;
        }

For each example - Сумма элементов массива
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + nums[i];
            System.out.println("Сумма равна = " + sum);

        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int x : nums) {
            sum = sum + x;
            System.out.println("X = " + x);
            System.out.println("Сумма равна = " + sum);
            if(x==5) break;
        }
        System.out.println("Сумма равна = " + sum);

For each example - Найти значение в массиве
        int nums[] = {4, 6, 8, 3, 2, 9, 1};
        int val = 100;
        boolean found = false;
        for (int x : nums) {
            if (x == val) {
                found = true;
                break;
            }
        }
        if (found) System.out.println("The value is found!");
        else System.out.println("The value isn't found.");
        */
