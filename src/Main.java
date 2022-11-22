import java.util.*;

public class Main {

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};
    static boolean[] visted;
    static int[][] map;
    static int R = 0;
    static int C = 0;
    static int maxCnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        R = sc.nextInt();
        C = sc.nextInt();
        //아스키 코드 값 이용.
        visted = new boolean[26];
        map = new int[R][C];

        for (int i = 0; i < R; i++) {
            String str = sc.next();
            for (int j = 0; j < C; j++) {
                map[i][j] = str.charAt(j) - 'A';
            }
        }

        dfs(new Horse(0, 0), 1);

        System.out.println(maxCnt);
    }

    public static void dfs(Horse horse, int inCnt) {
        int x = horse.x;
        int y = horse.y;
        visted[map[y][x]] = true;
        maxCnt = Math.max(maxCnt,inCnt);
        for (int i = 0; i < 4; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];
            if ((0 <= nextX && nextX < C) && (0 <= nextY && nextY < R)) {
                if (!visted[map[nextY][nextX]]) {
                    dfs(new Horse(nextX, nextY), inCnt+1);
                    visted[map[nextY][nextX]] = false;
                }
            }
        }

    }


    static class Horse {
        int x, y;

        public Horse(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}