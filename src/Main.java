import java.util.*;

public class Main {

    /***
     *
     * 1. 아이디어
     *  이중포문으로 돌며 방문X 또는 1 일경우 탐색
     *
     ***/

    public static void main(String[] args) {
        Main main = new Main();
        main.solution();
    }

    int[][] map;
    boolean[][] visited;
    int[] dy = {0, 1, 0, -1};
    int[] dx = {1, 0, -1, 0};
    int eachCnt = 0;
    List<Integer> arr = new ArrayList<>();
    int mapSize = 0;

    public void solution() {

        Scanner sc = new Scanner(System.in);
        mapSize = sc.nextInt();
        map = new int[mapSize][mapSize];
        visited = new boolean[mapSize][mapSize];

        for (int i = 0; i < mapSize; i++) {
            String input = sc.next();
            for (int j = 0; j < mapSize; j++) {
                map[i][j] = input.charAt(j) - '0';
            }
        }

        //탐색
        for (int i = 0; i < mapSize; i++) {
            for (int j = 0; j < mapSize; j++) {
                if (!visited[i][j] && map[i][j] == 1) {
                    visited[i][j] = true;
                    eachCnt = 0;
                    dfs(j, i);
                    arr.add(eachCnt);
                }
            }
        }

        Collections.sort(arr);

        System.out.println(arr.size());
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public void dfs(int x, int y) {
        eachCnt++;
        for (int i = 0; i < 4; i++) {
            int nextX = dx[i] + x;
            int nextY = dy[i] + y;

            if ((0 <= nextX && nextX < mapSize) && (0 <= nextY && nextY < mapSize)) {
                if (map[nextY][nextX] == 1 && !visited[nextY][nextX]) {
                    visited[nextY][nextX] = true;
                    dfs(nextX, nextY);
                }
            }
        }
    }


}

