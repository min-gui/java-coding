package racing.view;

import java.util.Scanner;

public class InputView {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static int inputCarNum(){
        System.out.println("자동차 대수는 몇 대 인가요?");
        return SCANNER.nextInt();
    }

    public static int inputRoundNum(){
        System.out.println("라운드 횟수는 몇 회 인가요?");
        return SCANNER.nextInt();
    }
}
