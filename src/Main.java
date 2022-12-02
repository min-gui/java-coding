import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        int[] test = {3, 7, 4, 6, 5};

        System.out.println(maxSubsetSum(test));
    }

    static int maxSubsetSum(int[] arr) {
        int length = arr.length;

        if (length == 1) {
            return arr[0];
        } else if (length == 2) {
            return arr[1] >= arr[0] ? arr[1] : arr[0];
        }
        int[] tempArr = new int[length + 1];
        int totalCnt = -100000;
        tempArr[0] = -100000;
        tempArr[1] = arr[0];
        tempArr[2] = arr[1];

        for (int i = 2; i < length; i++) {
            int tempMax = Math.max(tempArr[i - 1], tempArr[i - 2]);
            if (arr[i] >= 0) {
                tempArr[i + 1] = Math.max(tempMax + arr[i], arr[i]);
            } else {
                tempArr[i + 1] = tempMax;
            }
            totalCnt = Math.max(tempArr[i + 1],totalCnt);
        }

        return totalCnt;
    }

}