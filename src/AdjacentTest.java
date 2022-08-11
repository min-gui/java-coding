import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class AdjacentTest {
    public static void main(String[] args) {
        AdjacentTest adjacentTest = new AdjacentTest();
        adjacentTest.solution(4, new int[][]{{1, 2}, {2, 3}, {3, 4}});

    }

    public int solution(int n, int[][] wires) {
        int answer = n;
        initGrape(n);

        for (int[] item : wires) {
            put(item[0], item[1]);
        }

        for (int i = 0; i < wires.length; i++) {
            delete(wires[i][0], wires[i][1]);

            answer = Math.min(answer, Math.abs(search(n,wires[i][0]) - search(n,wires[i][1])));

            put(wires[i][0], wires[i][1]);
        }


        System.out.println(answer);
        return answer;
    }

    private ArrayList<ArrayList<Integer>> listGraph;

    public void initGrape(int initSize) {
        this.listGraph = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i <= initSize; i++) {
            listGraph.add(new ArrayList<Integer>());
        }
    }



    public int search(int n,int start) {
        int cnt = 0;
        boolean[] visited = new boolean[n + 1];;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);

        visited[start] = true;
        while (!queue.isEmpty()) {
            int dot = queue.poll();
            for (int i = 0; i < listGraph.get(dot).size(); i++) {
                if (!visited[listGraph.get(dot).get(i)]) {
                    visited[dot] = true;
                    queue.add(listGraph.get(dot).get(i));
                    cnt++;
                }
            }
        }

        return cnt;
    }

    public void printGraphToAdjList() {
        for (int i = 1; i < listGraph.size(); i++) {
            System.out.println("정점 " + i + "의 인접리스트");

            for (int j = 0; j < listGraph.get(i).size(); j++) {
                System.out.print(" -> " + listGraph.get(i).get(j));
            }
            System.out.println();
        }
    }

    public void put(int x, int y) {
        listGraph.get(x).add(y);
        listGraph.get(y).add(x);
    }

    public void delete(int x, int y) {
        listGraph.get(x).remove(Integer.valueOf(y));
        listGraph.get(y).remove(Integer.valueOf(x));
    }


}
