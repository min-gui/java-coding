package codingtest;

import java.util.Scanner;

public class Baek_9465 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            int[][] data = new int[2][n+1];
            int[][] dp = new int[2][n+1];


            for (int j =0 ; j < 2 ; j++){
                for(int k = 1 ; k <= n ; k++){
                    data[j][k] = sc.nextInt();
                }
            }

            dp[0][1] = data[0][1];
            dp[1][1] = data[1][1];
            for (int j = 2; j <= n; j++) {
                dp[0][j] = Math.max(dp[1][j - 2], dp[1][j - 1]) + data[0][j];
                dp[1][j] = Math.max(dp[0][j - 2], dp[0][j - 1]) + data[1][j];
            }

            System.out.println(Math.max(dp[0][n],dp[1][n]));

        }
        sc.close();

    }

}
