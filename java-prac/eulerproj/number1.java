package eulerproj;

public class number1 {

    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int total = 0;

        while (true) {
            if (a % 5 != 0) {
                total += a;
            }

            if (a >= 1000) {
                total -= a;
                break;
            }
            a += 3;
        }

        while (true) {
            total += b;

            if (b >= 1000) {
                total -= b;
                break;
            }
            b += 5;
        }
        System.out.println(total);
    }
}
