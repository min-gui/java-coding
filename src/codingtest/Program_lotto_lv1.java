package codingtest;

public class Program_lotto_lv1 {


    public static void main(String[] args) {

        int[] lottos = {1, 1, 1, 1, 1, 1};
        int[] win_nums = {38, 19, 20, 40, 15, 25};
        int[] result = solution(lottos,win_nums);
        System.out.println(result[0]+" "+result[1]);
    }


    public static int[] solution(int[] lottos, int[] win_nums) {
        int matchCount = 0;
        int minCount = 0;
        for (int i : lottos){
            if(i == 0) {
                matchCount++;
                continue;
            }

            for (int j : win_nums){
                if (i == j) minCount++;
            }
        }
        int firstNum = 7-(minCount+matchCount);
        if (firstNum == 7) firstNum = 6;
        int secondNum= 7-minCount;
        if (secondNum == 7) secondNum = 6;

        int[] answer = {firstNum,secondNum};
        return answer;
    }
}
