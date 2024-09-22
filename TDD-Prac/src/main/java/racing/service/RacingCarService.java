package racing.service;

import racing.view.OutputView;
import racing.domain.RacingCar;
import racing.strategy.RandomMoveStrategy;

import java.util.List;

public class RacingCarService {

    public void processRacing(String[] carNames, int roundNum) {

        List<RacingCar> racingCars = RacingCar.createRacingCars(carNames);
        RandomMoveStrategy randomMoveStrategy = new RandomMoveStrategy();
        for (int i = 0; i < roundNum; i++) {
            for (RacingCar racingCar : racingCars) {
                racingCar.go(randomMoveStrategy, 1);
            }
            OutputView.carsStatus(racingCars, i);
        }
    }
}
