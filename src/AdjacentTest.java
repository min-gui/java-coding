import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class AdjacentTest {
    public static void main(String[] args) {
        AdjacentTest adjacentTest = new AdjacentTest();
        System.out.println(adjacentTest.solution(new int[]{70, 50, 80, 50}
                , 100));


    }

    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);

        int upCnt = 0;
        int downCnt = people.length-1;

        while (downCnt-upCnt >= 0){
            if (people[downCnt]+people[upCnt] <= limit){
                downCnt--;
                upCnt++;
                answer++;
            }else {
                downCnt--;
                answer++;
            }
        }

        return answer;
    }


}
