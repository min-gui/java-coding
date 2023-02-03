package codingtest;

import java.util.Scanner;

public class Baek_1912 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max;
        int arrLength = sc.nextInt();
        int[] arr = new int[arrLength];
        int[] dp = new int[arrLength];
        for (int i = 0 ; i < arrLength ; i++){
            arr[i] = sc.nextInt();
        }

        max = arr[0];
        dp[0] = arr[0];
        for (int i = 1 ; i < arrLength ; i++){

            dp[i] = Math.max(dp[i-1]+arr[i],arr[i]);

            max = Math.max(max, dp[i]);
        }


        System.out.println(max);
    }
}
