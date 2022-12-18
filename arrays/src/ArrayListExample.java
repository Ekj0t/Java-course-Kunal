import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in=  new Scanner(System.in);
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(5);

//        list.add(2);
//        list.add(3);
//        list.add(1);
//        list.add(2);
//        list.add(5);
//        list.add(7);
//        list.add(9);
//        list.add(0);
//
//        System.out.println(list);
//        System.out.println(list.contains(234));
//        list.set(0,33);
//        System.out.println(list);
//        list.remove(2);
//        System.out.println(list);
        
        //Input 
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        //get items at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i) + " ");
        }

        System.out.println(list);
    }
}
