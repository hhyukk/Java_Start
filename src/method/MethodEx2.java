package method;

public class MethodEx2 {
    public static void main(String[] args) {
        String message = "Hello, world!";

        print(message, 3);
        print(message, 5);
        print(message, 7);
    }

    public static void print(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }
}
