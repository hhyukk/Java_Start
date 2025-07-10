package array;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        double avg = 0;

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        count = input.nextInt();

        int[] numbers = new int[count];

        System.out.println(count + "개의 정수를 입력하세요: ");
        for (int i = 0; i < count; i++) {
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }
        avg = (double) sum / count;

        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
    }
}
