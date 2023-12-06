package ch07_while;

public class Ex04_WhileEx {
    public static void main(String[] args) {
        /*
         * random() 메서드를 이용해서 1~6이 나오는 주사위를 설정하고
         * 주사위가 계속 던져지면서 6이 나오면 종료되는 코드 작성
         */
        // 1
        int dice = 0;
        while(dice != 6) {
            dice = (int) (Math.random() * 6) + 1;
            System.out.println("dice = " + dice);
        }
        System.out.println("6이 나왔습니다. 종료 !");

        // 2
        boolean run = true;
        while (run) {
            dice = (int) (Math.random() * 6) + 1;
            System.out.println("dice = " + dice);
            if (dice == 6) {
                run = false;
            }
        }
        System.out.println("6이 나왔습니다. 종료 !");
    }
}
