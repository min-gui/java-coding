package lotto.view;

import lotto.domain.LottoNumber;

import java.util.Scanner;

public class InputView {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String DELIMITER = ",";
    private static final int LOTTO_PRICE = 1000;

    private InputView() {
    }

    public static int inputMoney() {
        System.out.println("구입금액을 입력해 주세요.");
        return Integer.parseInt(SCANNER.nextLine());
    }

    public static LottoNumber buyLottoticket(int money) {
        int lottoCnt = money / LOTTO_PRICE;
        return new LottoNumber(lottoCnt);
    }

    public static String inputWinningNumbers() {
        System.out.println("지난 주 당첨 번호를 입력해 주세요.");
        String winningNumbers = SCANNER.nextLine();
        validateWinningNumbers(winningNumbers);
        return winningNumbers;
    }

    public static void validateWinningNumbers(String winningNumbers) {

        if (winningNumbers == null || winningNumbers.isBlank()){
            throw new IllegalArgumentException("null 또는 빈 문자열은 입력할 수 없습니다.");
        }

        if (!isSixNumber(winningNumbers)) {
            throw new IllegalArgumentException("당첨 번호는 6개여야 합니다.");
        }
    }

    static boolean isSixNumber(String winningNumbers) {
        return winningNumbers.split(DELIMITER).length == 6;
    }


}
