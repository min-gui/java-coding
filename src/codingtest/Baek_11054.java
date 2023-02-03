package codingtest;

import java.util.Scanner;

public class Baek_11054 {
    static Scanner sc = new Scanner(System.in);
    static int listLength;
    static int[] arr;
    static int[] inverseArr;
    static int[] dp;
    static int[] inverseDp;

    public static void main(String[] args) {
        int max = 0;
        listLength = sc.nextInt();
        arr = new int[listLength];
        inverseArr = new int[listLength];
        dp = new int[listLength];
        inverseDp = new int[listLength];

        for (int i = 0; i < listLength; i++) {
            int temp = sc.nextInt();
            arr[i] = temp;
            inverseArr[(listLength - 1) - i] = temp;
        }

        dp = dp_func(dp);
        inverseArr = inverse_dp_func(inverseDp);

        for (int i = 0; i < listLength; i++) {
            max = Math.max(max,(dp[i]+inverseDp[i])-1);

        }
        System.out.println(max);

    }

    static int[] inverse_dp_func(int[] dpArr) {
        dpArr[listLength - 1] = 1;
        for (int i = listLength - 2; 0 <= i; i--) {
            dpArr[i] = 1;
            for (int j = listLength - 1; j > i; j--) {
                if (arr[j] < arr[i] && dpArr[i] <= dpArr[j]) {
                    dpArr[i]++;
                }
            }
        }
        return dpArr;
    }

    static int[] dp_func(int[] dpArr) {
        dpArr[0] = 1;
        for (int i = 1; i < listLength; i++) {
            dpArr[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i] && dpArr[i] <= dpArr[j]) {
                    dpArr[i]++;
                }
            }
        }
        return dpArr;
    }
}
