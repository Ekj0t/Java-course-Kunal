import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        multiple(2, 3, "Ekjot", "Singh", " ");
        demo(2,3,4,5,6,7);
        demo("Ekjot","Singh");
    }

    static void demo(int... v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String... v) {
        System.out.println(Arrays.toString(v));
    }

    // Variable arguments always in the end
    static void multiple(int a, int b, String... v) {
        System.out.println();
    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }
}
