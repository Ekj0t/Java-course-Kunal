import java.util.Scanner;

public class FlowOfProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the Year: ");
//        LeapYear(in.nextInt());
//
//        System.out.print("Enter first Number: ");
//        int num1 = in.nextInt();
//        System.out.print("Enter second Number: ");
//        int num2 = in.nextInt();
//        int result = Sum(num1, num2);
//        System.out.println("The sum is: " + result);
//
//        System.out.print("Enter the number you want multiplication table of: ");
//        MultiplicationTable(in.nextInt());
//
//        System.out.print("Enter first Number: ");
//        int number1 = in.nextInt();
//        System.out.print("Enter second Number: ");
//        int number2 = in.nextInt();
//        LCM_HCF(number1, number2);

        System.out.print("Enter the position you want fibonacci of: ");
        double input = in.nextDouble();
        System.out.print("Fibonacci series result: "+ Fibonacci(input));
    }

    // Leap Year problem
    static void LeapYear(int n) {
        if (n % 4 == 0) {
            System.out.println(n + " is a leap year");
        } else {
            System.out.println(n + " is not a leap year");
        }
    }

    static int Sum(int a, int b) {
        return a + b;
    }

    static void MultiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + n + " = " + i * n);
        }
    }


    static void LCM_HCF(int a, int b) {
        int hcf = 0;
        for (int i = 1; i <= a || i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }
        System.out.println("HCF of " + a + " and " + b + " : " + hcf);
        System.out.println("LCM of " + a + " and " + b + " : " + (a * b) / hcf);
    }

    static double Fibonacci( double n) {
        double a = 0;
        double b = 1;
        double count = 2;
        while (count <= n) {
            double temp = b;
            b = b + a;
            a = temp;
            count++;
        }

        return b;
    }
}