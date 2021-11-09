import java.util.Scanner;

public class Back_9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int vpsCount = 0;


        for (int i = 0; i < length; i++) {
            String strings = sc.next();
            for (int j =0 ; j < strings.length() ; j++){
                if (strings.charAt(j) == '(' ){
                    vpsCount++;
                }else {
                    vpsCount--;
                }

                if (vpsCount < 0){
                    break;
                }
            }

            if (vpsCount == 0){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
            vpsCount = 0;

        }
    }
}
