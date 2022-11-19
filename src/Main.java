import java.util.*;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cnt = 1;
        int N = sc.nextInt();
        int[][] lectures = new int[N][2];
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            int si = sc.nextInt();
            int ti = sc.nextInt();
            lectures[i][0] = si;
            lectures[i][1] = ti;
        }

        Arrays.sort(lectures, Comparator.comparing(o1 -> o1[0]));
        //강의 끝나는 시간 추가.
        queue.add(lectures[0][1]);
        for (int i = 1; i < N; i++) {
            if (queue.peek() <= lectures[i][0]){
                queue.poll();
            }
            queue.add(lectures[i][1]);


        }
        System.out.println(queue.size());
    }

}