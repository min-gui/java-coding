import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int cnt = 1;
        ArrayList<String> answer = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 1; i <= num; i++) {
            int inputNum = sc.nextInt();
            while (cnt<=inputNum){
                stack.add(cnt);
                answer.add("+");
                cnt++;
            }

            if (stack.peek() == inputNum){
                stack.pop();
                answer.add("-");
            }else{
                answer.clear();
                System.out.println("NO");
                break;
            }
        }

        for (String i : answer){
            System.out.println(i);
        }

    }
}