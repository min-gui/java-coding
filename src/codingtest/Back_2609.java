package codingtest;

import java.util.Scanner;

public class Back_2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(gcd(num1,num2));
        System.out.println(lcm(num1,num2));
    }

    static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b, a%b);
    }

    static int lcm(int a, int b){
        return a*b / gcd(a,b);
    }
}
