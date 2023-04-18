package codingtest.algorithm.datastructure301;

import java.util.Scanner;

public class Back11005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        String c = Integer.toString(a,b);

        System.out.println(c.toUpperCase());
    }
}
