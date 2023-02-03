package codingtest;

import java.util.Arrays;
import java.util.Scanner;

public class Back_10989 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        int tmp[]=new int[n];
        for(int i=0;i<n;i++){
            tmp[i]=sc.nextInt();
        }
        Arrays.sort(tmp);
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<tmp.length;i++){
            sb.append(tmp[i]+"\n");
        }
        System.out.println(sb);
    }
}
