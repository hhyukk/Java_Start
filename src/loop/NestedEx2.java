/*
int rows` 를 선언해라.
이 수만큼 다음과 같은 피라미드를 출력하면 된다.
참고: `println()` 은 출력후 다음 라인으로 넘어간다. 라인을 넘기지 않고 출력하려면 `print()` 를 사용하면 된다.
예) `System.out.print("*")`
 */

package loop;

public class NestedEx2 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
