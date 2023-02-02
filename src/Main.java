import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {


    //1. 쇠막대기 겹치지 않게 아래에 자기보다 큰거.
    //2. 끝점이 겹치지 않게, 레이저는 적어도 하나 쏜다.

    /**
     * 설계 .
     * () 는 레이저이다. 예) (())레이저 하나 쇠막대기 두개.
     * @param args
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] result = br.readLine().toCharArray();
        Stack<Character> stack = new Stack<>();
        int total =0;

        for (int i = 0; i < result.length; i++){
            if (result[i] == '(')
                stack.push(result[i]);
            else {
                stack.pop();
                if (result[i-1]=='(')
                    total += stack.size();
                else
                    total++;
            }

        }
        System.out.println(total);
    }



}