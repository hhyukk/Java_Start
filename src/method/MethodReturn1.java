package method;

public class MethodReturn1 {
    public static void main(String[] args) {
        boolean result = odd(2);
        System.out.println(result);
    }

    public static boolean odd(int i) {
        if (0 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
