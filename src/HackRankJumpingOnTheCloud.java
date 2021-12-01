import java.util.Arrays;
import java.util.List;

public class HackRankJumpingOnTheCloud {
    static int totalNum = 0;

    public static void main(String[] args) {

        Integer[] arr = {0, 0, 0, 1, 0, 0};

        jumpingOnClouds(Arrays.asList(arr));
    }

    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here

        return calNum(c,0);
    }

    public static int calNum(List<Integer> c, int curPostion) {

        if (curPostion + 2 >= c.size()) {
            if (curPostion + 1 >= c.size()){
                return totalNum;
            }else {
                if (c.get(curPostion + 1) == 0) {
                    return ++totalNum;
                } else {
                    return totalNum;
                }
            }

        } else {
            if (c.get(curPostion + 2) == 0) {
                totalNum++;
                return calNum(c, curPostion + 2);
            } else if (c.get(curPostion + 1) == 0) {
                totalNum++;
                return calNum(c, curPostion + 1);
            } else {
                return calNum(c, curPostion + 3);
            }
        }

    }

}
