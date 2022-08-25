import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int E = sc.nextInt();
        int S = sc.nextInt();
        int M = sc.nextInt();

        while (true) {
            cnt++;
            int eNa = cnt % 15;
            int sNa = cnt % 28;
            int mNa = cnt % 19;
            if (eNa == 0) eNa = 15 ;
            if (sNa == 0) sNa = 28 ;
            if (mNa == 0) mNa = 19 ;

            if (eNa == E && sNa == S && mNa == M){
                break;
            }
        }
        System.out.println(cnt);

    }
}