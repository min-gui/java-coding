package codingtest;

import java.util.Scanner;

public class Bae_11055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrLength = sc.nextInt();
        int[] arr = new int[arrLength ];
        int[] dp = new int[arrLength ];
        int max;

        for (int i = 0; i < arrLength; i++) {
            arr[i] = sc.nextInt();
        }

        dp[0] = arr[0];
        max = dp[0];
        for (int i = 1; i < arrLength; i++) {
            dp[i] = arr[i];
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i] && dp[i] < dp[j] + arr[i]) {
                    dp[i] = dp[j] + arr[i];
                }
            }
            if (max < dp[i]){
                max = dp[i];
            }
        }

        System.out.println(max);

    }
}
