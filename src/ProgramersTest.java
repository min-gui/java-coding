import java.util.*;

public class ProgramersTest {

    /**
     * 1. 아이디어
     */
    public static void main(String[] args) {
        ProgramersTest programersTest = new ProgramersTest();
        System.out.println(programersTest.solution(6, new int[]{7, 10}));
    }

    public long solution(int n, int[] times) {
        long answer = 0;
        Arrays.sort(times);
        long start = times[0];
        long end = times[times.length - 1] * (long)n;
        while (start <= end) {
            long mid = (start+end) / 2;
            long mokSum = 0;
            for (int i : times) {
                mokSum += mid / i;
            }
            if (n > mokSum) {
                start = mid+1;
            } else  {
                end = mid-1;
                answer = mid;
            }

        }

        return answer;
    }


}
