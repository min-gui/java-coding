import java.util.Scanner;

public class Baek_2193 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long[] pinaryBoard = new long[N + 2];
        pinaryBoard[0] = pinaryBoard[1] = 1;

        for (int i = 2; i <= N; i++) {
            pinaryBoard[i] = pinaryBoard[i - 2] + pinaryBoard[i - 1];
        }

        System.out.println(pinaryBoard[N-1]);
    }
}
