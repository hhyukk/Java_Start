/*
사용자로부터 4명 학생의 국어, 수학, 영어 점수를 입력받아 각 학생의 총점과 평균을 계산하는 프로그램을 작성하자.
 */
package array;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] scores = new int[4][3];
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
