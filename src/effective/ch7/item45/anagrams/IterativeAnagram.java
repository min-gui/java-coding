package effective.ch7.item45.anagrams;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class IterativeAnagram {

    public static void main(String[] args) throws IOException {
        String[] strings = {"min55", "ok", "ko", "yes666"};

        File dictionary = new File(strings[1]);
        int minGroupSize = Integer.parseInt(strings[2]);

        Map<String, Set<String>> groups = new HashMap<>();
        groups.put("ok", Collections.singleton("ss"));
        try (Scanner s = new Scanner(dictionary)) {
            while (s.hasNext()) {
                String word = s.next();
                groups.computeIfAbsent(alphabetize(word),
                        (unsued) -> new TreeSet<>()).add(word);
            }
        }

        for (Set<String> group : groups.values())
            if (group.size() >= minGroupSize)
                System.out.println(group.size() + ": " + group);

    }

    private static String alphabetize(String s){
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}
