package ch07_while;

public class Ex01_WhileBasic {
    public static void main(String[] args) {

        // 무한 반복
        int k = 1;
        while (true) {
            System.out.println("무한반복~~" + k);
            k++;
            if (k == 3) {
                break;
            }
            System.out.println("break 다음 문장");
        }

        int l = 1;
        boolean run = true;
        while (run) {
            System.out.println("l = " + l);
            l++;
            if (l == 3) {
                run = false;
            }
            System.out.println("run=false 다음 문장");
        }

    }
}
