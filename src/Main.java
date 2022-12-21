import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        solution(7);
        int[][] arr = {{1,2},{1,3}};
        String[] strarr = {"root","cs","hello"};
        solution(3,arr,strarr);
    }

    public static int solution(int N, int[][] relation, String[] dirname) {
        ArrayList<Point> arrayList = new ArrayList<>();
        for ( int i =0 ; i < N-1; i ++){
            int start = relation[i][1];
            int end = relation[i][1];
            String name = dirname[i+1];

            arrayList.add(new Point(start,end, name));

        }

        


        return 0;
    }

    static class Point{
        int start;
        int end;
        String name;

        public Point(int start, int end, String name) {
            this.start = start;
            this.end = end;
            this.name = name;
        }
    }

    public static long[] solution(long n) {
        long min = 1;
        if ((n / 7) > 0) {
            min = (n / 7) * 2;
        }

        long na = 1;
        if (n % 7 == 0 ){
            na = 0;
        } else if (n % 7 > 1 && 7 < n) {
            na = 2;
        }

        long max = na + min;

        System.out.println(max);

        long[] answer = {min, max};

        return answer;
    }

}