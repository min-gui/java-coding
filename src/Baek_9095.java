import java.util.Scanner;

public class Baek_9095 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list;
        int T = sc.nextInt();
        int N;

        for (int k = 0; k < T; k++) {
            N = sc.nextInt();
            list = new int[11];
            list[0] = 1;
            list[1] = 2;
            list[2] = 4;
            for (int i = 3; i < N; i++) {
                list[i] = list[i - 1] + list[i - 2] + list[i - 3];
            }
            System.out.println(list[N - 1]);
        }

    }
}
