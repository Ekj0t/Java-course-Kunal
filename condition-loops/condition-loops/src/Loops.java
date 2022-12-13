import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // Q: Print numbers 1 to 5.

        // Using for loops
        // Used for known number of times
//        for (int num = 1; num<=5; num++){
//            System.out.println(num);
//        }

        // print numbers from 1 to n
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//
//        for (int num = 1; num <= n; num++) {
//            // System.out.print(num + " ");
//            System.out.println("Hello World");
//
//        }

        // while loops
        // Used for unknown number of times
        int num = 1;
        while (num<=5){
            System.out.println(num);
            num+= 1;
        }

        // do while
        // Used for at least one time
        int n = 1;
        do {
            System.out.println(n);
            n+=1;
        } while (n<=5);

    }
}
