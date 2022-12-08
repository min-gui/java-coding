import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static ArrayList<Integer>[] list;
    static int[] parents;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        list = new ArrayList[N + 1];
        visited = new boolean[N + 1];
        parents = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 1; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            //양쪽의 값을 넣어줘 연결되어있음을 표현한다.
            list[x].add(y);
            list[y].add(x);
        }

        for (int i = 1; i <= N; i++) {
            //방문하지 않은 곳이라면 색
            //두번째 노드 부터 차례대로 탐색한다.
            if (!visited[i]) {
                dfs(i);
            }
        }

        for (int i = 1; i <= N ; i++){
            System.out.println(parents[i]);
        }

    }

    private static void dfs(int x) {
        if (visited[x]) {
            return;
        }
        visited[x] = true;

        for (int i : list[x]) {
            //아직 방문하지 않았으면.
            if (!visited[i]) {
                //부모노드 추가
                parents[i] = x;
                //자식노드 탐색.
                dfs(i);
            }
        }

    }

}