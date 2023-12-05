package ch06_for;

import java.util.Scanner;

public class Ex05_ForEx {
    public static void main(String[] args) {
        /*
         * 두 개의 정수를 입력 받아서 시작 값부터 끝 값 까지의 합계 출력
         * 입력 예
         * 시작 값: 110
         * 끝값: 555
         *
         * 출력 예
         * 110 부터 555 까지의 합은 000 입니다.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("시작 값: ");
        int start = scanner.nextInt();
        System.out.print("끝 값: ");
        int end = scanner.nextInt();

        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        System.out.println(start + "부터 " + end + "까지의 합은 " + sum + "입니다.");
    }
}
