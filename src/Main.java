

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        solution(4);
    }

    public static int solution(int N) {
        // write your code in Java SE 11

        int totalCnt = 0;
        Point p = new Point();
        while (true){
            int na = N%2;
            N = N/2;


            if (na == 1){
                p.is = true;
                totalCnt = Math.max(totalCnt, p.cnt);
                p.cnt = -1;

            }

            if(p.is == true){
                p.cnt++;
            }

            if (N == 1){
                totalCnt = Math.max(totalCnt, p.cnt);
                break;
            }

        }

        System.out.println(+totalCnt);
        return 0;
    }
    public static class Point{
        int cnt=0;
        //셀수 있는지 이전에 1이 나왔었는지 판별
        boolean is = false;
    }
}