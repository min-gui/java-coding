package codingtest.algorithm.datastructure300;

import java.util.Scanner;

public class Baek2609 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();


        System.out.println(gcd(A,B));
        System.out.println(lcd(A,B));

    }
    static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b, a%b);
    }

    static int lcd(int a, int b){
        return a*b / gcd(a,b);
    }
}
