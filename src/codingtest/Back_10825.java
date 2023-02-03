package codingtest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Back_10825 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        String[][] arr = new String[length][4];
        for (int i = 0; i < length; i++) {
            arr[i][0] = sc.next();
            arr[i][1] = sc.next();
            arr[i][2] = sc.next();
            arr[i][3] = sc.next();
        }

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {

                if (Integer.valueOf(o1[1]) == Integer.valueOf(o2[1])) {

                    if (Integer.valueOf(o1[2]) == Integer.valueOf(o2[2])) {

                        if (Integer.valueOf(o2[3]) == Integer.valueOf(o1[3])){
                            return  o1[0].compareTo(o2[0]);
                        }else{
                            return Integer.valueOf(o2[3]) - Integer.valueOf(o1[3]);
                        }

                    } else {
                        return Integer.valueOf(o1[2]) - Integer.valueOf(o2[2]);
                    }

                } else {
                    return Integer.valueOf(o2[1]) - Integer.valueOf(o1[1]);
                }
            }
        });
        for (int i = 0; i < length; i++) {
            System.out.println(arr[i][0]);
        }
    }
}
