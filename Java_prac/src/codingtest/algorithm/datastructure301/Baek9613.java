package codingtest.algorithm.datastructure301;

import java.util.Scanner;

public class Baek9613 {

    //각각 약수구하기 메소드 만들기
    //비교군과 최대공약수
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int T = sc.nextInt();
            int[] list = new int[T];
            long total = 0;

            for (int k = 0; k < T; k++) {
                list[k] = sc.nextInt();
            }

            for (int k = 0; k < T - 1; k++) {

                for (int j = k + 1; j < T; j++) {
                    int i1 = list[k];
                    int j1 = list[j];
                    total += gcd(i1, j1);
                }
            }
            System.out.println(total);
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
