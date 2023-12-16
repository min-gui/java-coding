package codingtest.algorithm.datastructure301;

import java.util.Scanner;

public class Baek17087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int S = sc.nextInt();
        int[] list = new int[N];

        for (int i = 0; i < N; i++) {
            list[i] = Math.abs(S - sc.nextInt());
        }


        if (N == 1) {
            System.out.println(list[0]);
        } else if (N == 2) {
            System.out.println(gcd(list[0], list[1]));
        } else {
            int gcdMax = gcd(list[0], list[1]);
            for (int i = 2; i < N; i++) {
                gcdMax = gcd(gcdMax, list[i]);
            }
            System.out.println(gcdMax);
        }


    }

    public static int gcd(int a, int b) {

        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
