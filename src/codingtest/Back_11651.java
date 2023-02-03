package codingtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Back_11651 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrlengh = sc.nextInt();

        int[][] arr = new int[arrlengh][2];

        for (int i = 0 ; i < arrlengh ; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1]==o2[1]){
                    return o1[0] - o2[0];
                }
                else {
                    return o1[1] - o2[1];
                }

            }
        });

        for (int i = 0 ; i < arrlengh ; i++){
            System.out.print(arr[i][0]+" ");
            System.out.println(arr[i][1]);
        }
    }
}
