import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int n;
    static int m;
    static int[][] map;
    static boolean[][] visited;
    static int min = 200;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n + 1][m + 1];
        visited = new boolean[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            String s = br.readLine();
            for (int j = 1; j <= m; j++) {
                map[i][j] = s.charAt(j - 1) - '0';
            }
        }

        bfs();
        System.out.println(map[n][m]);

    }

    public static void bfs() {
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(1, 1));
        while (!queue.isEmpty()) {
            Point p = queue.poll();
            visited[p.y][p.x] = true;
            System.out.println(p.y + " " + p.x);

            for (int i = 0; i < 4; i++) {
                int nextX = p.x + dx[i];
                int nextY = p.y + dy[i];

                if (nextX > 0 && nextY > 0 && nextX <= m && nextY <= n) {
                    if (!visited[nextY][nextX] && map[nextY][nextX] == 1) {
                        queue.add(new Point(nextX, nextY));
                        map[nextY][nextX] = map[p.y][p.x] + 1;

                    }
                }
            }
        }

    }

    static class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}