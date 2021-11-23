import java.util.Arrays;

import java.util.Comparator;

public class Programmers {
    public static void main(String[] args) {
        int[] answers = {1,3,2,4,2};

        int[] A = {1, 2, 3, 4, 5};
        int[] B = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] C = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[][] countArr = {{1, 0}, {2, 0}, {3, 0}};

        for (int i = 0; i < answers.length; i++) {
            if (A[i % 5] == answers[i]) {
                countArr[0][1]++;
            }
            if (B[i % 8] == answers[i]) {
                countArr[1][1]++;
            }
            if (C[i % 10] == answers[i]) {
                countArr[2][1]++;
            }
        }

        Arrays.sort(countArr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                } else {
                    return o2[1] - o1[1];
                }


            }
        });

        int[] answer;
        if (countArr[0][1] != countArr[1][1]) {
            answer = new int[]{countArr[0][0]};
        } else if (countArr[1][1] != countArr[2][1]) {
            answer = new int[]{countArr[0][0], countArr[1][0]};
        } else {
            answer = new int[]{countArr[0][0], countArr[1][0], countArr[2][0]};
        }
        for (int i : answer) {
            System.out.println(i);
        }
        System.out.println(countArr[0][0] + " " + countArr[0][1]);
        System.out.println(countArr[1][0] + " " + countArr[1][1]);
        System.out.println(countArr[2][0] + " " + countArr[2][1]);


    }
}
