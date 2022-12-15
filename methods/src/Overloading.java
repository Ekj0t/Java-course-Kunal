public class Overloading {
    public static void main(String[] args) {
fun(2);
fun("Ekjot");
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }

}
