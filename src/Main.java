import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int[] arr = new int[9];
    static int sum = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];

        }
        search();

    }

    static void search() {
        for (int i = 0; i < 8; i++) {
            for (int k = i + 1; k < 9; k++) {
                if (sum - arr[i] - arr[k] == 100) {
                    arr[i] = 0;
                    arr[k] = 0;

                    Arrays.sort(arr);
                    for (int j = 2; j < 9; j++) {
                        System.out.println(arr[j]);

                    }

                    return;
                }
            }
        }
    }
}