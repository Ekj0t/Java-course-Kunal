import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1 -> System.out.println("Ekjot Singh");
            case 2 -> System.out.println("Gurpreet Singh");
            case 3 -> {
                System.out.println("Print Employee number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT");
                    case "Management" -> System.out.println("Management");
                    default -> System.out.println("No department found");
                }
            }
        }
    }
}
