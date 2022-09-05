import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = Integer.parseInt(sc.nextLine());


        for (int i = 0; i < cnt; i++) {
            String[] s = sc.nextLine().split(" ");
            for (String item : s) {
                System.out.print(reverse(item) + " ");
            }
        }

    }

    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

}