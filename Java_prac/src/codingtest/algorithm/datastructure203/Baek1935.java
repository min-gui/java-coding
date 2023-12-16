package codingtest.algorithm.datastructure203;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Baek1935 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String s = sc.next();
        Stack<Double> stack = new Stack<>();

        double[] numberList = new double[N];

        for (int i = 0; i < N; i++) {
            numberList[i] = sc.nextInt();
        }

        double result = 0;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                //알파벳임.
                double num = numberList[s.charAt(i) - 'A'];
                stack.push(num);
            }else {
                double first = stack.pop();
                double second = stack.pop();
                switch (s.charAt(i)) {
                    case '+':
                        result = second + first;
                        stack.push(result);
                        continue;
                    case '-':
                        result = second - first;
                        stack.push(result);
                        continue;
                    case '*':
                        result = second * first;
                        stack.push(result);
                        continue;
                    case '/':
                        result = second / first;
                        stack.push(result);
                        continue;
                }
            }
        }

        System.out.printf("%.2f", stack.pop());
    }


}