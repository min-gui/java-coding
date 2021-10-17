import java.util.Arrays;
import java.util.Scanner;

public class Baek_11053 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arrLength = sc.nextInt();
        int[] arr = new int[arrLength];
        int[] dp = new int[arrLength];
        int max=0;

        for (int i = 0; i < arrLength; i++) {
            arr[i] = sc.nextInt();
        }

        dp[0] = 1;

        for (int i = 1; i < arrLength; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i] && dp[i] <= dp[j]) {
                    dp[i]++;
                }
            }
        }

        for (int i : dp) {
            max = Math.max(max, i);
        }

        System.out.println(max);

    }
}
