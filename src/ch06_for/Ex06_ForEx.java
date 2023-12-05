package ch06_for;

public class Ex06_ForEx {
    public static void main(String[] args) {
        /*
         * 1부터 100까지의 숫자 중에서 3의 배수만 출력하고 합계도 구하기
         */
        int sum = 0;
        System.out.print("3의 배수는 ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                sum += i;
                System.out.print(i + " ");
            }
        }
        System.out.println("이며,");
        System.out.println("3의 배수의 합계는 " + sum + "입니다");
    }
}
