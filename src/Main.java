import java.util.*;

public class Main {

    static int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
    static int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};
    static boolean[][] visted;
    static int[][] map;
    static int testCase = 0;
    static int I = 0;
    static int minCnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        testCase = sc.nextInt();

        for (int i = 0; i < testCase; i++) {
            I = sc.nextInt();
            visted = new boolean[I][I];
            map = new int[I][I];
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();

            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            search(new Point(x1, y1), new Point(x2, y2));
        }

    }

    public static void search(Point start, Point end) {

        Queue<Point> queue = new LinkedList<>();
        queue.add(start);

        while (!queue.isEmpty()) {
            Point currentP = queue.poll();

            if (currentP.x == end.x && currentP.y == end.y) {
                System.out.println(map[currentP.y][currentP.x]);
                return;
            }

            for (int i = 0; i < 8; i++) {
                int nextX = currentP.x + dx[i];
                int nextY = currentP.y + dy[i];
                if (0 <= nextX && nextX < I && 0 <= nextY && nextY < I) {
                    if (!visted[nextY][nextX]) {
                        visted[nextY][nextX] = true;
                        map[nextY][nextX] = map[currentP.y][currentP.x] + 1;
                        queue.add(new Point(nextX, nextY));
                    }
                }
            }
        }
    }
    static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}




