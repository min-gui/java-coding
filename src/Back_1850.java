import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Back_1850 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        Long num1 = Long.valueOf(st.nextToken());
        Long num2 = Long.valueOf(st.nextToken());

        long result = gcd(num1,num2);
        StringBuilder sb = new StringBuilder();
        for (int i =0; i < result ; i++){
            sb.append("1");
        }

        System.out.println(sb.toString());
    }
    static Long gcd(Long a, Long b){
        if(b==0) return a;
        return gcd(b, a%b);
    }
}
