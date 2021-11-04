import java.util.*;

public class Back_11652 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int count = 1;
        int max = 0;

        long[] arr = new long[length];


        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextLong();
        }

        Arrays.sort(arr);

        long selectNum = arr[0];

        for (int i = 1; i < length; i++) {
            if (arr[i -1] == arr[i]) {
                count++;
            } else {
                count = 1;
            }

            if (max < count) {
                max = count;
                selectNum = arr[i-1];
            }
        }

        System.out.println(selectNum);

    }
}
