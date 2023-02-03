package codingtest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HackRankSalesbyMatch {
    public static void main(String[] args) {
        int n = 9;
        Integer[] arr = {10, 20, 20, 10, 10, 30, 50, 10, 20};

        sockMerchant(n, Arrays.asList(arr));
    }

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        Collections.sort(ar);

        int temp = ar.get(0);
        int total = 0;
        for (int i = 1; i < n; i++) {

            if (ar.get(i) == temp) {
                total++;
                temp = 0;
            } else {
                temp = ar.get(i);
            }
        }

        return total;

    }

}
