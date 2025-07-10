/*
사용자에게 5개의 정수를 입력받아서 배열에 저장하고, 입력받은 순서의 반대인 역순으로 출력하자.
출력시출력포멧은5,4,3,2,1과같이 `,` 쉼표를사용해서구분하고,마지막에는쉼표를넣지않아야한다.
 */
package array;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("5개의 정수를 입력하세요:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("입력한 정수를 역순으로 출력:");
        for (int i = 4; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
    }

}
