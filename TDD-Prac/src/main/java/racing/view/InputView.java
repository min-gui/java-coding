package racing.view;

import java.util.Scanner;

public class InputView {
    public static final Scanner SCANNER = new Scanner(System.in);
    private static final int MAX_CAR_NAME_LENGTH = 5;

    private InputView() {
    }

    public static int inputCarNum() {
        System.out.println("자동차 대수는 몇 대 인가요?");
        return SCANNER.nextInt();
    }

    public static int inputRoundNum() {
        System.out.println("라운드 횟수는 몇 회 인가요?");
        return SCANNER.nextInt();
    }

    public static String[] inputCarNames() {
        System.out.println("자동차 이름을 입력해주세요(쉼표 구분으로 (,) ,5글자 이내).");
        String[] carNameList = SCANNER.nextLine().split(",");
        for (String car : carNameList){
            validationCarName(car);
        }
        return carNameList;
    }

    public static void validationCarName(String carName){
        if (carName.length() > MAX_CAR_NAME_LENGTH){
            throw new RuntimeException("5글자를 초과 할 수 없습니다.");
        }
    }
}
