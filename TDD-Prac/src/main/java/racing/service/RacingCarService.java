package racing.service;

import racing.view.OutputView;
import racing.domain.RacingCar;
import racing.strategy.RandomMoveStrategy;

import java.util.List;
import java.util.stream.Collectors;

public class RacingCarService {

    public void processRacing(String[] carNames, int roundNum) {

        List<RacingCar> racingCars = RacingCar.createRacingCars(carNames);
        for (int i = 0; i < roundNum; i++) {
            for (RacingCar racingCar : racingCars) {
                racingCar.go(new RandomMoveStrategy(), 1);
            }
            OutputView.carsStatus(racingCars, i);
        }
        List<RacingCar> winnerCars = findWinnerCars(racingCars);
        OutputView.printRacingWinner(winnerCars);
    }

    public List<RacingCar> findWinnerCars(List<RacingCar> racingCars) {
        int maxPosition = racingCars.stream()
                .mapToInt(RacingCar::getPosition)
                .max()
                .orElse(0);
        return racingCars.stream()
                .filter(racingCar -> racingCar.getPosition() == maxPosition)
                .collect(Collectors.toList());
    }
}
