package codingtest.algorithm.datastucture303;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String B = st.nextToken();
        int N = Integer.parseInt(st.nextToken());
        int answer = 0;

        for (int i = 0; i < B.length(); i++) {
            if ('0'<= B.charAt(i) && B.charAt(i) <= '9')
                answer = answer * N + (B.charAt(i) - '0');
            else
                answer = answer * N + (B.charAt(i) - 'A' + 10);
        }
        System.out.println(answer);

    }
}
