/*
변수 `a=10` 이 들어있고, `b=20` 이 들어있다.
변수 `a` 의값과변수 `b` 의값을서로바꾸어라
다음 코드에서 시작과 종료 부분 사이에 변수의 값을 교환하는 코드를 작성하면 된다.
힌트: `temp` 변수를활용해야한다.
 */

package scanner;

public class ChangeVarEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
