package lotto.view;

import lotto.domain.LottoNumber;
import lotto.domain.LottoTicket;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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

    public static LottoTicket buyLottoTicket(int money) {
        int lottoCnt = money / LOTTO_PRICE;
        return new LottoTicket(lottoCnt);
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

    public static List<Integer> extractNumber(String strNumbers){
        return Arrays.asList(strNumbers.split(DELIMITER))
                .stream()
                .filter(str -> str.matches("[0-9]+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    public static int inputBonusNumber(List<Integer> winningNumbers){
        System.out.println("보너스 볼을 입력해주세요. ex) 1");

        int bonusNumber = SCANNER.nextInt();
        validateBonusNumber(winningNumbers, bonusNumber);

        return bonusNumber;

    }

    public static void validateBonusNumber(List<Integer> winningNumbers, int bonusNumber){

        if (!(bonusNumber >= 1 && bonusNumber <= 45)){
            throw new IndexOutOfBoundsException("번호는 1~45중 하나 입니다.");
        }

        if (winningNumbers.contains(bonusNumber)) {
            throw new IllegalArgumentException("보너스 볼이 당첨번호에 포함되어 있습니다.");
        }

    }


}
