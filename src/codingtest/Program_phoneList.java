package codingtest;

import java.util.*;

public class Program_phoneList {

    public static void main(String[] args) {
        String[] sample = {"123","456","789"};



        System.out.println(solution(sample));
    }

    public static boolean solution(String[] phone_book) {
        boolean answer = true;

        HashMap<String,String> hashMap = new HashMap<String,String>();
        for (String i : phone_book){
            hashMap.put(i,i);
        }

        for (String item : phone_book){
            for (int i = 1 ; i < item.length() ; i++){
                if (hashMap.containsKey(item.substring(0,i))){
                    return false;
                }
            }
        }


        return true;
    }
}
