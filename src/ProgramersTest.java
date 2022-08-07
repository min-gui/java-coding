import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class ProgramersTest {
    public static void main(String[] args) {
        ProgramersTest programersTest = new ProgramersTest();
        System.out.println(programersTest.solution("BBAABB"));


    }

    public int solution1(String name) {
        int answer = 0;
        char tempName = 'A';
        int seriseCheck = 0;
        int totalCnt = 0;

        //for (int j = 0; j < 2; j++) {
        //알파벳 값.
        int alphCnt = 0;
        for (int i = 0; i < name.length(); i++) {

            name.charAt(i); // 74 - 65, 91 - 74
            int up = name.charAt(i) - 65;
            int down = 91 - name.charAt(i);
            alphCnt += Math.min(up, down);

            System.out.println(alphCnt);
            if (name.charAt(i) == tempName && name.length()-1 != i) {
                seriseCheck++;
            } else {
                System.out.println("serise "+seriseCheck);
                totalCnt = Math.max(seriseCheck, totalCnt);
                seriseCheck = 0;
            }
        }
        System.out.println(alphCnt);
        int way = Math.min(name.length() - 1, name.length() - 1 -totalCnt);
        answer = way + alphCnt;


        return answer;
    }

    static public int solution(String name) {
        int answer = 0;

        int len = name.length();

        //최대로 가질 수 있는 min값은 끝까지 가는것
        int min_move = len-1;

        for(int i=0; i<len; i++) {
            answer += Math.min(name.charAt(i)-'A', 'Z'-name.charAt(i)+1);

            //좌우: 연속된 A의 등장에 따라 최소 움직임이 달라진다
            int next = i+1;// 현재 다음 위치부터
            //내 다음이 A라면 계속 NEXT++
            while(next<len && name.charAt(next) == 'A')
                next++;

            min_move = Math.min(min_move, i+len-next + i);
        }//for

        answer += min_move;

        return answer;
    }


}
