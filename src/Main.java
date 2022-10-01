import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main {

    /**
     * 1. 아이디어
     * 문서의 개수 N, 몇번째에 놓여 있는지 M, N개 문서의 중요도가 차례로 나온다.
     * - 구현
     * 구분표현을 만든다.
     * 번지수, 중요도.
     * 들어오는 가장 큰 수를 찾는다.
     */

    static int arr[];
    static boolean visited[];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int testCase = sc.nextInt();

        for (int i = 0; i < testCase; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int MAX = 0;
            int cnt = 0;

            Queue<Point> queue = new LinkedList<>();
            for (int j = 0; j < N; j++) {
                int value = sc.nextInt();
                MAX = Math.max(MAX, value);
                queue.add(new Point(value, j));
            }

            while (!queue.isEmpty()){

                Point nowP = queue.poll();
                boolean flag = true;

                for (Point p : queue){
                    if (nowP.value < p.value){
                        flag = false;
                        break;
                    }
                }

                if (flag){
                    cnt++;
                    if (nowP.turn==M){
                        System.out.println("cnt = " + cnt);
                        break;
                    }
                }else {
                    queue.add(nowP);
                }
            }

        }
    }

    public static class Point {
        int value;
        int turn;

        public Point(int value, int turn) {
            this.value = value;
            this.turn = turn;
        }
    }


}