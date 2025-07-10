/*
ArrayEx7문제에서 학생수를 입력받도록 개선하자.
 */
package array;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("학생수를 입력하세요: ");
        int count = input.nextInt();

        int[][] scores = new int[count][3];
        String[] subject = {"국어", "영어", "수학"};

        for (int i = 0; i < scores.length; i++) {
            System.out.println(i + 1 + "번 학생의 성적을 입력하세요:");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(subject[j] + " 점수: ");
                scores[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
            }
            double avg = (double) sum / scores[i].length;
            System.out.println(i + 1 + "번 학생의 총점: " + sum + ", 평균: " + avg);
        }
    }
}
