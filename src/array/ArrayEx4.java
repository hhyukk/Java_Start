/*
사용자에게 5개의 정수를 입력받아서 이들 정수의 합계와 평균을 계산하는 프로그램을 작성하자.
 */
package array;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        System.out.println("5개의 정수를 입력하세요: ");
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];
        int sum = 0;
        double avg = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }
        avg = (double) sum / numbers.length;

        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
    }
}
