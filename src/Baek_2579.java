import java.util.Scanner;

public class Baek_2579 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int listLength = sc.nextInt();
        int[] arr = new int[301];
        int[] dp = new int[301];

        for (int i = 1; i <= listLength; i++) {
            arr[i] = sc.nextInt();
        }

        dp[1] = arr[1];
        dp[2] = arr[1] + arr[2];
        dp[3] = Math.max(arr[1], arr[2]) + arr[3];

        for (int i = 4; i <= listLength; i++) {
            dp[i] = Math.max(dp[i - 3] + arr[i - 1], dp[i - 2]) + arr[i];
        }
        System.out.println(dp[listLength]);
    }


}
