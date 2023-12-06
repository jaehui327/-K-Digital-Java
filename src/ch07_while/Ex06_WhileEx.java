package ch07_while;

import java.util.Scanner;

public class Ex06_WhileEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum, cnt;
        while (true) {
            sum = 0;
            cnt = 0;
            System.out.println("정수를 입력하고 마지막에 0을 입력하세요: ");
            boolean run = true;
            while (run) {
                int n = scanner.nextInt();
                if (n == 0) {
                    run = false;
                } else {
                    sum += n;
                    cnt++;
                }
            }
            System.out.println("입력한 숫자는 " + cnt + "개 입니다.");
            System.out.println("평균은 " + (sum / cnt) + "입니다.");
        }
    }
}
