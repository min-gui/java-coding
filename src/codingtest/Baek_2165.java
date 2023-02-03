package codingtest;

import java.util.Scanner;

public class Baek_2165 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int wineRange = sc.nextInt();


        int[] wines = new int[wineRange+1];
        int[] drink = new int[wineRange+1];
        if (wineRange==1){
            int re = sc.nextInt();
            System.out.println(re);
            return;
        }

        for (int i = 1 ;i < wines.length ; i++){
            wines[i] = sc.nextInt();
        }


        drink[1] = wines[1];
        drink[2] = wines[1]+wines[2];

        for (int i =3 ; i <= wineRange ; i++){
            drink[i] = drink[i -1];
            drink[i] = Math.max(drink[i], wines[i] + drink[i-2]);
            drink[i] = Math.max(drink[i], wines[i] + wines[i-1] + drink[i-3]);
        }

        System.out.println(drink[wineRange]);
    }
}
