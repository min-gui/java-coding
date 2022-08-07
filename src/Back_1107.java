import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Back_1107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String N = sc.next();
        int M = sc.nextInt();
        ArrayList<Integer> mArr = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));

        for(int i = 0 ; i < M ; i++){
            int wrongNum = sc.nextInt();
            mArr.remove(Integer.valueOf(wrongNum));
        }

        System.out.println("size "+ mArr);

        for (int i =0 ; i < N.length() ; i++){
            int num = N.charAt(i)-48;
            if (mArr.contains(num)){
                System.out.println(num);
            }
            //System.out.println(num);



        }
        System.out.println(N);
    }
}
