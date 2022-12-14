import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruit = in.next();

        // Using If statements
        /*
        if (fruit.equals("mango")) {
            System.out.println("King of Fruits");
        } else if (fruit.equals("apple")) {
            System.out.println("A sweet red fruit");
        } else {
            System.out.println("Normal Fruit");
        }
        */

        // Using switch cases
        /*
        switch (fruit) {
            case "Mango" -> System.out.println("King of Fruits");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Orange" -> System.out.println("Small Fruit");
            default -> System.out.println("Enter a valid name");
        }
         */

        int day = in.nextInt();

        switch (day){
            case 1 -> {
                System.out.println("Monday");
                System.out.println("Headache");
            }
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
        switch (day){
            case 1,2,3,4,5,6 -> System.out.println("Workday");
            case 7 -> System.out.println("Sunday");
        }



    }
}