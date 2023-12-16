package codingtest.algorithm.datastructure301;

import java.util.Scanner;

public class Bake1212 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] binaryList = {"000", "001", "010", "011", "100", "101", "110", "111"};
        String input = sc.next();

        StringBuilder sb = new StringBuilder();
        if (input.length() == 1 && input.charAt(0) == '0') {
            sb.append(0);
        } else {
            for (int i = 0; i < input.length(); i++) {
                int n = Character.getNumericValue(input.charAt(i));

                if (i == 0 && n <4){
                    switch (n){
                        case 1:
                            sb.append("1");
                            break;
                        case 2:
                            sb.append("10");
                            break;
                        case 3:
                            sb.append("11");
                            break;
                    }
                }else {
                    sb.append(binaryList[n]);
                }
            }

        }
        System.out.println(sb.toString());
    }
}
