import java.util.HashMap;
import java.util.Set;

public class Program_Camouflage {
    public static void main(String[] args) {

        String[][] problomes = {{"yellowhat", "headgear"},{"yellowhat", "headgear1"},{"yellowhat", "headgear"}};
        System.out.println(solution(problomes));
    }

    public static int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> clothesMap = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            clothesMap.put(clothes[i][1],clothesMap.getOrDefault(clothes[i][1],0)+1);
        }

        Set<String> clotheSet = clothesMap.keySet();
        for (String clotheItem : clotheSet) {
            answer *= clothesMap.get(clotheItem)+1;
        }

        return answer-1;
    }
}
