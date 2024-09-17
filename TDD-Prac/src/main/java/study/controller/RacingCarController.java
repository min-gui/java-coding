package study.controller;

import study.service.RacingCarService;
import study.view.InputView;

public class RacingCarController {

    public static void main(String[] args) {
        RacingCarService racingCarService = new RacingCarService();
        //주어진 횟수동안 n대의 자동차는 전진 또는 멈출 수 있다.
        int carNum = InputView.inputCarNum();
        int carRound = InputView.inputRoundNum();

        racingCarService.processRacing(carNum,carRound);
    }


}
