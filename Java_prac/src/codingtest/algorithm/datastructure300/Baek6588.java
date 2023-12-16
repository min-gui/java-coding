package codingtest.algorithm.datastructure300;

import java.io.*;
import java.util.Scanner;

public class Baek6588 {

    //8
    //20
    //42
    //0
    //n으로 나타낼 수 없는 경우.
    //Goldbach's conjecture is wrong.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[] isPrime = new boolean[1000001];

        for (int i = 3; i < 1000001; i++) {
            isPrime[i] = isPrime(i);
        }

        while (true) {
            int n = Integer.parseInt(br.readLine());
            boolean is = false;
            if (n == 0) break;


            for (int i = n; i > 0 ; i--) {
                if (isPrime[i] == true) {
                    //소수 일때
                    int temp = n - i;
                    if (isPrime[temp] == true) {
//                        bw.write((temp+i)+ " = "+ temp + " + " + i+"\n");
                        System.out.println( (temp+i)+ " = "+ temp + " + " + i);
                        is = true;
                        break;
                    }
                }
            }
            if (!is)
                System.out.println("Goldbach's conjecture is wrong.");

        }
        bw.flush();

    }

    public static boolean isPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
