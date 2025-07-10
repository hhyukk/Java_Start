/*
사용자로부터 n개의 정수를 입력받아 배열에 저장한 후, 배열 내에서 가장 작은 수와 가장 큰 수를 찾아 출력하는 프로 그램을 작성하자
 */
package array;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("입력받을 숫자의 개수를 입력하세요: ");
        int count = input.nextInt();

        int[] numbers = new int[count];

        System.out.print(count + "개의 정수를 입력하세요: ");
        for (int i = 0; i < count; i++) {
            numbers[i] = input.nextInt();
        }

        int minNumber, maxNumber;
        minNumber = maxNumber = numbers[0];

        for (int i = 1; i < count; i++) {
            if (minNumber > numbers[i]) {
                minNumber = numbers[i];
            }
            if (maxNumber < numbers[i]) {
                maxNumber = numbers[i];
            }
        }
        System.out.println("minNumber = " + minNumber);
        System.out.println("maxNumber = " + maxNumber);
    }
}
