
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



/*class Result {

    *//*
     * Complete the 'possibleChanges' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY usernames as parameter.
     *//*

    public static List<String> possibleChanges(List<String> usernames) {
        // Write your code here

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int usernamesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> usernames = new ArrayList<>();

        for (int i = 0; i < usernamesCount; i++) {
            String usernamesItem = bufferedReader.readLine();
            usernames.add(usernamesItem);
        }


        List<String> result = Result.possibleChanges(usernames);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(result.get(i));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}*/

public class HackRank_UserNameChange {
}
