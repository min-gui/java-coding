package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Back17928 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.valueOf(br.readLine());
        String[] s = br.readLine().split(" ");
        int[] list = new int[size];
        int[] resultList = new int[size];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < size; i++) {
            list[i] = Integer.parseInt(s[i]);
            resultList[i] = -1;
        }

        for (int i = 1; i < size; i++) {
            stack.add(i - 1);

            while (!stack.isEmpty()) {
                if (list[stack.peek()] < list[i])
                    resultList[stack.pop()] = list[i];
                else{
                    break;
                }
            }
        }

        for (int i : resultList) {
            System.out.print(i +" ");
        }
    }


}
