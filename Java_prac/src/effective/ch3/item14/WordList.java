package effective.ch3.item14;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class WordList {

    public static void main(String[] args) {
        String[] ar = {"fmfmf","aaas","bbbdd"};
        Set<String> s = new TreeSet<>();
        //첫글자가 알파벳 순으로 정렬
        Collections.addAll(s, ar);
        System.out.println(s);
    }
}
