package codingtest;

import java.util.*;

public class Program_marathon {
    public static void main(String[] args) {

        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] complete = {"stanko", "ana", "mislav"};
        System.out.println(solution(participant,complete));
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        //int count = 0;
        Arrays.sort(participant);
        Arrays.sort(completion);

        for(int i = 0 ; i < completion.length ; i++){
            if (!completion[i].equals(participant[i])){
                return answer += participant[i];

            }
        }
        answer = participant[participant.length-1];
        return answer;
    }
}
