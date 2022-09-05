import java.util.*;

public class ProgramersTest {

    /**
     * 1. 아이디어
     */
    public static void main(String[] args) {
        ProgramersTest programersTest = new ProgramersTest();
        System.out.println(programersTest.solution(new int[]{3, 2, 7, 2},
                new int[]{4, 6, 5, 1}));
    }

    public int solution(int[] queue1, int[] queue2) {
        int answer = -2;

        Queue<Integer> queueList1 = new LinkedList<>();
        Queue<Integer> queueList2 = new LinkedList<>();

        int direct = 0;
        int queue1Sum = 0;
        int queue2Sum = 0;
        int cnt = 0;

        for (int i = 0; i < queue1.length; i++) {
            queue1Sum += queue1[i];
            queue2Sum += queue2[i];
            queueList1.add(queue1[i]);
            queueList2.add(queue2[i]);
        }

        while (queue1Sum != queue2Sum) {
            cnt++;

            if (queue1Sum > queue2Sum) {
                int temp = queueList1.poll();
                queueList2.offer(temp);
                queue1Sum -= temp;
                queue2Sum += temp;
            } else {
                int temp = queueList2.poll();
                queueList1.offer(temp);
                queue1Sum += temp;
                queue2Sum -= temp;
            }

            if (cnt > (queue1.length + queue2.length) * 2) {
                return -1;
            }
        }
        answer = cnt;


        return answer;
    }


}
