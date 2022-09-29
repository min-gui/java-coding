import java.io.IOException;
import java.util.Scanner;


public class Main {

    /*
    1. 아이디어
    모든 순서가 나오게 출력.
    하나의 열에 모든 수의 조함이 나와야된다.
     */

    static int arr[];
    static boolean visited[];

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        arr = new int[M];
        visited = new boolean[N];

        dfs(0,N,M,0);

    }


    static void dfs(int start, int N, int M, int depth) {

        if (M == depth) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = i + 1;
                dfs(i + 1, N, M, depth+1);
                visited[i] = false;
            }

        }
        
    }

}