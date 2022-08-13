import java.util.*;

public class ProgramersTest {

    /**
     * 1. 아이디어
     *
     *
     */
    public static void main(String[] args) {
        ProgramersTest programersTest = new ProgramersTest();
        System.out.println(programersTest.solution(new int[]{1, 1, 1, 3, 1, 1, 1}));
    }

    public int[] solution(int[] arr) {

        List<Integer> list = new ArrayList<>();
        int pop = 10;
        for (int i : arr){
            if (pop != i){
                list.add(i);
                pop = i;
            }
        }

        int[] answer = new int[list.size()];
        for (int i =0 ; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }


}
