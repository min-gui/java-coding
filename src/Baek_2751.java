import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Baek_2751 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        StringBuilder sb = new StringBuilder();
        for(int i =0 ; i < length ; i++){
            arr.add(sc.nextInt());
        }

        Collections.sort(arr);


        for(int i : arr)
            sb.append(i).append("\n");

        System.out.println(sb);

    }
}
