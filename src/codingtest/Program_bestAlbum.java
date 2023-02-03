package codingtest;

import java.util.*;

public class Program_bestAlbum {
    public static void main(String[] args) {
       String[] genres =  {"classic", "pop", "classic", "classic", "pop"};
       int[] play = {500, 600, 150, 800, 3000};
       System.out.println(solution(genres,play));
    }

    public static int[] solution(String[] genres, int[] plays) {

        HashMap songMap = new HashMap<String, Integer>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < genres.length ; i++){
            songMap.put(genres[i],(Integer) songMap.getOrDefault(genres[i],0)+plays[i]);
        }

        List<Map.Entry<String, Integer>> entries = new LinkedList<>(songMap.entrySet());
        Collections.sort(entries, ((o1, o2) -> o2.getValue().compareTo(o1.getValue())));
        for (int i = 0; i < entries.size() ; i++){
            HashMap playMap = new HashMap<Integer,Integer>();

            for (int j = 0 ; j < genres.length ; j++){
                if (entries.get(i).getKey().equals(genres[j])){
                    System.out.println();
                    playMap.put(j,plays[j]);
                }

            }
            List<Map.Entry<Integer, Integer>> playEntrys = new LinkedList<>(playMap.entrySet());
            Collections.sort(playEntrys, ((o1, o2) -> o2.getValue().compareTo(o1.getValue())));
            for (int j = 0 ; j < playEntrys.size() ;j++){

                arrayList.add(playEntrys.get(j).getKey());
                if (j == 1){
                    break;
                }
            }

        }

        System.out.println(arrayList);


        int[] answer = new int[arrayList.size()];
        int size =0;
        for(int i: arrayList){
            answer[size++] = i;

        }

        return answer;
    }
}
