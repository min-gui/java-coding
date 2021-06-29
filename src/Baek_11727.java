import java.util.Scanner;

public class Baek_11727 {

    static int N;
    static int[] list = new int[1001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        list[0] = 1;
        list[1] = 3;
        for (int i = 2; i < N; i++) {
            list[i] = (list[i-1]+ list[i-2]*2)%10007;
        }

        System.out.println(list[N-1]);
    }
}
