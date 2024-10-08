package racing.controller;

import racing.service.RacingCarService;
import racing.view.InputView;

public class RacingCarController {
    // 각 자동차에 이름을 부여할 수 있다. 자동차 이름은 5자를 초과할 수 없다.
    // 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
    // 자동차 이름은 쉼표(,)를 기준으로 구분한다.
    // 자동차 경주 게임을 완료한 후 누가 우승했는지 알려준다. 우승자는 한명 이상일 수 있다.
    public static void main(String[] args) {
        RacingCarService racingCarService = new RacingCarService();
        //주어진 횟수동안 n대의 자동차는 전진 또는 멈출 수 있다.
        int carRound = InputView.inputRoundNum();
        String[] carNames = InputView.inputCarNames();
        racingCarService.processRacing(carNames,carRound);



    }


}
