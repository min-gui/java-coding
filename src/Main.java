import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int M = sc.nextInt();

        boolean[] button = new boolean[10];

        //고장난 버튼 추가
        for (int i = 0; i < M; i++) {
            button[sc.nextInt()] = true;
        }

        int result = Math.abs(N - 100);

        for (int i = 0; i <= 999999; i++) {
            String temp = String.valueOf(i);

            boolean breaking = false;

            for (int j = 0; j < temp.length(); j++) {
                if (button[temp.charAt(j) - '0']) {
                    breaking = true;
                    break;

                }
            }

            if (!breaking) {
                int min = Math.abs(N - i) + temp.length();
                result = Math.min(result, min);
            }
        }
        System.out.println(result);
    }
}