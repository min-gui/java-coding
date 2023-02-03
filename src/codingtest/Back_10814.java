package codingtest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Back_10814 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        String[][] arr = new String[length][2];
        for (int i = 0; i < length; i++) {
            arr[i][0] = sc.next();
            arr[i][1] = sc.next();
        }

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.valueOf(o1[0]) - Integer.valueOf(o2[0]);

            }
        });
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i][0].toString() + " ");
            System.out.println(arr[i][1].toString());
        }
    }
}
