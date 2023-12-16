package codingtest.algorithm.datastructure301;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baek2089 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> list = new ArrayList<>();

        if(n==0) //n이 0 일때
            System.out.println(n);

        while(n!=0) {
            list.add(Math.abs(n%-2));
            //올림처
            n=(int)Math.ceil((double)n/-2);
        }

        for(int i=list.size()-1; i>=0; i--)
            System.out.print(list.get(i));
    }

}
