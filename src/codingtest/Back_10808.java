package codingtest;

import java.util.Scanner;

public class Back_10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strings = sc.next();

        int count = 0;
        for (int i = 97; i <= 122; i++) {
            for (int j = 0; j < strings.length(); j++) {

                if (i == (int) strings.charAt(j)) {
                    count++;
                }
            }
            System.out.print(count+" ");
            count = 0;
        }

    }
}
