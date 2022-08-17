import javax.swing.text.html.Option;
import java.util.*;

public class Main {
    static boolean[] visted;
    static ArrayList<ArrayList<Integer>> arr;
    public static void main(String[] args) {
        int answer = 0;
        Scanner sc = new Scanner(System.in);

        //정점의 갯수
        int N = sc.nextInt();
        //간선의 갯수
        int M = sc.nextInt();

        visted = new boolean[N + 1];
        arr = new ArrayList<>();
        for (int i = 0; i < N + 1; i++) {
            arr.add(new ArrayList<>());
        }
        for (int i = 0; i < M; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            arr.get(u).add(v);
            arr.get(v).add(u);
        }

        for (int i = 1 ; i <= N ;i++){
            if (!visted[i]){
                search(i);
                answer++;
            }
        }
        System.out.println(answer);

    }


    static public void search(int start){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);

        while (!queue.isEmpty()){
            int a = queue.poll();
            visted[a] = true;
            for (int i = 0 ; i < arr.get(a).size() ; i++){
                int value = arr.get(a).get(i);
                if (!visted[value]){
                    visted[value] = true;
                    queue.add(value);
                }

            }

        }
    }

}

