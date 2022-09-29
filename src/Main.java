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

        dfs(N,M,0);


    }


    static void dfs(int N, int M, int depth) {

        //행의 길이가 끝까지 탐색 했을때 출력
        if (depth == M) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        // N 까지 탐색.
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = i + 1;
                dfs(N, M, depth + 1);
                //끝까지 탐색하고 나왔을경우 기존 방문했던 곳을 false 로.
                visited[i] = false;
            }
        }

    }

}