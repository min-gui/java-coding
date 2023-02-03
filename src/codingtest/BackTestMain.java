package codingtest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BackTestMain {
    static Stack<Character> characterStack;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String strings = br.readLine();
        boolean continueIs = false;
        characterStack = new Stack<>();

        for (int i = 0; i < strings.length(); i++) {
            char charIndex = strings.charAt(i);
            //"<" 가 시작 되었고, 현재 인덱스가 ">" 가 아닐때 가로안에 있는 문자열 하나씩 출력.
            if (continueIs && charIndex != '>') {
                System.out.print(charIndex);
                continue;
            }


            if (charIndex == '<') {
                //문자열이 < 로시작할때 스택 안에 문자열이 있으면 모두 출력.
                continueIs = true;
                stackPrint();
                System.out.print("<");
            } else if (charIndex == '>') {
                continueIs = false;
                System.out.print(">");
            } else if (charIndex != ' ') {
                //인덱스가 <,>,' ' 아닐때 스텍에 문자열 추가.
                characterStack.add(charIndex);
            }


            //인텍스가 ' '이거나 마지막줄 일때
            if (charIndex == ' ' || i == strings.length() - 1) {
                stackPrint();

                if (charIndex == ' ')
                    System.out.print(" ");
            }
        }
    }

    public static void stackPrint(){
        while (!characterStack.isEmpty()) {
            char c = characterStack.pop();
            System.out.print(c);
        }
    }

}

