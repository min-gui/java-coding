package codingtest.algorithm.datastucture303;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Back11576 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        Stack<Integer> stack = new Stack<Integer>();
        int sum = 0;
        for (int i = num-1; i >= 0; i--) {
            int temp = Integer.parseInt(st.nextToken());
            sum = Integer.valueOf((int) (sum +(temp*(Math.pow(A,i)))));
        }

        while (sum > 0) { // 10진수를 B진수로 계산해서 결과값 스택에 저장함
            stack.push(sum % B);
            sum = sum / B;
        }

        while (!stack.empty()) { // 스택에 저장된 값을 출력함
            System.out.println(stack.pop()+" ");
        }

    }
}
