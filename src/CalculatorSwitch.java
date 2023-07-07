import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean condition = true;
        boolean result = true;
        while (condition) {
            System.out.println("Input first value: ");
            while (!sc.hasNextDouble()) {
                sc.next();
                System.out.println("Incorrect input. Try to use double!");
            }
            double value1 = sc.nextDouble();
            System.out.println("Input second value: ");
            while (!sc.hasNextDouble()) {
                sc.next();
                System.out.println("Incorrect input. Try to use double: ");
            }
            double value2 = sc.nextDouble();
            if (value1 == 0 && value2 == 0) {
                System.out.println("Unreal operation(");
                break;
            }
            System.out.println("Choose your operation between: +, -, *, /, %");
            String operation = sc.next();
            while (result) {
                switch (operation) {
                    case "+":
                        System.out.println("Your result: " + (value1 + value2));
                        result = false;
                        break;
                    case "-":
                        System.out.println("Your result: " + (value1 - value2));
                        result = false;
                        break;
                    case "*":
                        System.out.println("Your result: " + (value1 * value2));
                        result = false;
                        break;
                    case "/":
                        System.out.println("Your result: " + (value1 / value2));
                        result = false;
                        break;
                    case "%":
                        System.out.println("Your result: " + (value1 % value2));
                        result = false;
                        break;
                    default:
                        System.out.println("You input unsupported operation. Try again: ");
                        operation = sc.next();
                }

            }

        }

    }
}
