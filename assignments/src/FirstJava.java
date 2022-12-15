import java.util.Scanner;

public class FirstJava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the number(if odd): ");
//        int x = in.nextInt();
//        System.out.println(IsOdd(x));
//
//        System.out.println("Enter your name: ");
//        String name = in.next();
//        greet(name);
//
//        int P, R, T;
//        System.out.print("Enter the Principal amount: ");
//        P = in.nextInt();
//        System.out.print("Enter the Rate: ");
//        R = in.nextInt();
//        System.out.print("Enter the Time (in years): ");
//        T = in.nextInt();
//        int SimpleInterest = SimpleInterest(P, R, T);
//        System.out.println("Simple Interest: " + SimpleInterest);

//        System.out.print("Enter first number: ");
//        int Compare1 = in.nextInt();
//        System.out.print("Enter second number: ");
//        int Compare2 = in.nextInt();
//        int CompareResult = Greaterthan(Compare1, Compare2);
//        System.out.print("Greater number is: "+ CompareResult);

        System.out.print("Enter amount in INR: ");
        long INR = in.nextLong();
        System.out.print(INR+" is: "+ USDToINR(INR)+" USD");

    }

    static boolean IsOdd(int n) {
        return n % 2 != 0;
    }

    static void greet(String name) {
        String message = ("Good morning " + name);
        System.out.println(message);
    }

     static int SimpleInterest(int P, int R, int T) {
        return (P * R * T) / 100;
    }

    static int Greaterthan(int a, int b){
        return Math.max(a, b);
    }

    static double USDToINR(long INR){
        return INR/82.52;
    }


}
