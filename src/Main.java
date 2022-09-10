import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();
        Point point = new Point(text, text.length());
        int forNum = sc.nextInt();
        for (int i = 0; i < forNum; i++) {

            String input = sc.next();

            switch (input.charAt(0)) {
                case 'P':
                    String str = sc.next();
                    input(point, str);
                    break;
                case 'L':
                    left(point);
                    break;
                case 'D':
                    right(point);
                    break;
                case 'B':
                    delete(point);
                    break;

            }

        }

        System.out.println(point.getStr());


    }

    static void left(Point point) {
        if (point.position != 0) {
            point.setPosition(point.position - 1);
        }
    }

    static void right(Point point) {
        if (point.position == point.str.length()) {
            point.setPosition(point.position);
        } else {
            point.setPosition(point.position + 1);
        }
    }

    static void delete(Point point) {

        if (point.position == point.str.length()) {
            point.setStr(point.str.substring(0, point.position - 1));
            point.setPosition(point.str.length());
        } else if (point.position > 0) {
            String tmep = point.str.substring(0, point.position - 1)
                    + point.str.substring(point.position);
            point.setStr(tmep);
        }
    }

    static void input(Point point, String item) {
        String tmep = point.str.substring(0, point.position)
                + item + point.str.substring(point.position);

        point.setPosition(point.position + 1);
        point.setStr(tmep);
    }

    static class Point {
        private String str;
        private int position;

        public Point(String str, int position) {
            this.str = str;
            this.position = position;
        }

        public void setPosition(int position) {
            this.position = position;
        }

        public void setStr(String str) {
            this.str = str;
        }

        public String getStr() {
            return str;
        }
    }
}