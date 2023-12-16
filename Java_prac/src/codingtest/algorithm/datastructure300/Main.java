package codingtest.algorithm.datastructure300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            goldbach(n);

        }
        System.out.println(sb);

    }

    public static void goldbach(int number) {
        for (int i = number; i > number/2; i--) {
            if (isPrime(i) == true) {
                int temp = number - i;

                if (isPrime(temp) == true) {
                    sb.append(number).append(" = ").append(temp).append(" + ").append(i).append('\n');
                    return;
                }

            }
        }
        sb.append("Goldbach's conjecture is wrong.");
        return;
    }

    public static boolean isPrime(int number) {
        if (number < 2)
            return false;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
