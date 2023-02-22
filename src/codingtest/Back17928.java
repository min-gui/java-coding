package codingtest;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Back17928 {


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] list = new int[size];

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < size; i++) {
            list[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {


            while (!stack.isEmpty() && list[stack.peek()] < list[i]) {
                list[stack.pop()] = list[i];
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            list[stack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for (int i : list) {
            sb.append(i).append(' ');
        }

        System.out.println(sb);
    }


}
