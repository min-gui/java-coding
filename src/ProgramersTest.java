import java.util.*;

public class ProgramersTest {
    public static void main(String[] args) {
        ProgramersTest programersTest = new ProgramersTest();
        System.out.println(programersTest.solution(
                9, new int[][]{{1, 3}, {2, 3}, {3, 4}, {4, 5}, {4, 6}, {4, 7}, {7, 8}, {7, 9}}));
    }


    int[][] map;

    public int solution(int n, int[][] wires) {
        int answer = n;
        map = new int[n + 1][n + 1];
        for (int i = 0; i < wires.length; i++) {
            map[wires[i][0]][wires[i][1]] = 1;
            map[wires[i][1]][wires[i][0]] = 1;
        }

        for (int i = 0; i < wires.length; i++) {
            int a = wires[i][0];
            int b = wires[i][1];

            map[a][b] = 0;
            map[b][a] = 0;
            answer = Math.min(answer, serach(n,a));
            map[a][b] = 1;
            map[b][a] = 1;
        }


        return answer;
    }

    public int serach(int n, int start) {
        boolean[] visited = new boolean[n + 1];
        int cnt = 1;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);

        while (!queue.isEmpty()) {
            int point = queue.poll();
            visited[point] = true;

            for (int i = 1; i <= n; i++) {
                if (visited[i]) continue;
                if (map[point][i] == 1) {
                    queue.offer(i);
                    cnt++;
                }
            }
        }
        return (int) Math.abs(n - 2 * cnt);
    }


}
