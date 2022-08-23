import java.util.Scanner;

public class Main {

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};
    static char[][] map;
    static boolean[][] vistied;
    static int max = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int mapSize = sc.nextInt();
        map = new char[mapSize][mapSize];
        vistied = new boolean[mapSize][mapSize];


        for (int i = 0; i < mapSize; i++) {
            String inputString = sc.next();
            for (int j = 0; j < mapSize; j++) {
                map[i][j] = inputString.charAt(j);
            }
        }

        for (int i = 0; i < mapSize; i++) {
            for (int j = 0; j < mapSize; j++) {
                Point p1 = new Point(j, i);
                search(p1);
            }
        }


        System.out.println(max);

    }

    static void search(Point point) {
        for (int i = 0; i < 4; i++) {
            int x = point.x + dx[i];
            int y = point.y + dy[i];
            if ((x >= 0 && x < map.length) && (y >= 0 && y < map.length)) {
                if (map[point.y][point.x] != map[y][x]) {
                    char temp = map[point.y][point.x];
                    map[point.y][point.x] = map[y][x];
                    map[y][x] = temp;
                    maxSearch();
                    map[y][x] = map[point.y][point.x];
                    map[point.y][point.x] = temp;
                }
            }
        }
    }

    static void maxSearch() {

        int sum = 1;
        //필드만 최고 찾기
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length - 1; j++) {
                if (map[i][j] == map[i][j + 1]) {
                    sum++;
                } else {
                    sum = 1;
                }
                max = Math.max(max, sum);
            }
            sum = 1;
        }
        //열만 최고 찾기
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length - 1; j++) {
                if (map[j][i] == map[j + 1][i]) {
                    sum++;
                } else {
                    sum = 1;
                }
                max = Math.max(max, sum);
            }
            sum = 1;
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