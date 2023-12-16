package codingtest.algorithm.datastructure301;

import java.util.Scanner;

public class Baek1373 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        int len = input.length();

        if (len % 3 == 1) {
            System.out.print(input.charAt(0));
        } else if (len % 3 == 2) {
            System.out.print((input.charAt(0) - '0') * 2 + (input.charAt(1) - '0'));
        }

        for (int i = len % 3; i < len; i += 3) {
            System.out.print((input.charAt(i) - '0') * 4
                    + (input.charAt(i + 1) - '0') * 2
                    +(input.charAt(i + 2) - '0'));
        }
    }
}
