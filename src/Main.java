

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        int[][] lecture = new int[N][2];
        int temp = 0;


        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            lecture[i][0] = start;
            lecture[i][1] = end;
        }

        Arrays.sort(lecture, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]){
                    return  o1[0] - o2[0];
                }

                return o1[1] - o2[1];
            }
        });

        int cnt = 1;
        temp = lecture[0][1];

        for (int i = 1 ; i < N ; i++){
            System.out.println(lecture[i][0]+" "+lecture[i][1]);
            if(lecture[i][0] >= temp){
                cnt++;
                temp = lecture[i][1];
            }
        }
        System.out.println(cnt);

    }

}