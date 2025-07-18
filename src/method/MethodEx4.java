package method;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;
        int count;

        while (true) {
            start();
            System.out.print("선택: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("입금액을 입력하세요: ");
                    count = scanner.nextInt();
                    balance = deposit(balance, count);
                    break;
                case 2:
                    System.out.print("출금액을 입력하세요: ");
                    count = scanner.nextInt();
                    balance = withdrawal(balance, count);
                    break;
                case 3:
                    System.out.println("현재 잔액: " + balance);
                    break;
                case 4:
                    System.out.println("시스템을 종료합니다.");
                    return;
            }
        }
    }

    public static void start() {
        System.out.println("---------------------------------");
        System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
        System.out.println("---------------------------------");
    }

    public static int deposit(int balance, int count) {
        balance += count;
        System.out.println(count + "원을 입금하였습니다. 현재 잔액: " + balance);
        return balance;
    }

    public static int withdrawal(int balance, int count) {
        if (count > balance) {
            System.out.println(count + "원을 출금하려 했으나 잔액이 부족합니다.");
        } else {
            balance -= count;
            System.out.println(count + "원을 입금하였습니다. 현재 잔액: " + balance);
        }
        return balance;
    }
}
