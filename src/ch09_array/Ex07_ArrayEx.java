package ch09_array;

public class Ex07_ArrayEx {
    public static void main(String[] args) {
        /*
         * int[] num = { 3, 2, 1, 5, 4 };
         * 위와 같은 배열이 있을 때
         * {1, 2, 3, 4, 5} 와 같이 오름차순 정렬을 하는 코드를 작성 해봅시다.
         */
        int[] num = { 3, 2, 1, 5, 4 };
        System.out.print("정렬 전: ");
        print(num);
        sort(num);
        System.out.print("정렬 후: ");
        print(num);
    }

    public static void print(int[] num) {
        for (int i = 0; i < num.length - 1; i++) {
            System.out.print(num[i] + ", ");
        }
        System.out.println(num[num.length - 1]);
    }

    public static void sort(int[] num) {
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
                print(num);
            }
            System.out.print((i + 1) + "바퀴: ");
            print(num);
        }
    }
}
