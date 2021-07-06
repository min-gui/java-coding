import java.util.Scanner;

public class Baek_11057 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int board[][] = new int[N + 1][10];
        for (int i = 0; i <= 9; i++) {
            board[0][i] = 1;
        }

        for (int i = 1; i <= N; i++) {
            board[i][0] = 1;
            for (int k = 1; k <= 9; k++) {
                board[i][k] = (board[i - 1][k] + board[i][k - 1]) % 10007;
            }
        }
        System.out.println(board[N][9] % 10007);

    }
}
