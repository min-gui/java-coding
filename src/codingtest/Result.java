package codingtest;

import java.io.*;

public class Result {


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        long n = Long.parseLong(bufferedReader.readLine().trim());

        long result = Result.repeatedString(s, n);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }

    public static long repeatedString(String s, long n) {
        // Write your code here


        long firstCnt = 0;
        long totalCnt = 0;

        for (int i = 0; i < s.length(); i++) {
            if ('a' == s.charAt(i)){
                firstCnt++;
            }
        }

        long mok = n / s.length();
        long reminder =  n % s.length();
        totalCnt = mok * firstCnt;

        for (int i = 0 ; i < reminder ; i++){
            if ('a' == s.charAt(i)){
                totalCnt++;
            }
        }

        return totalCnt;


    }

}

