package racing.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racing.domain.RacingCar;
import racing.strategy.AlwaysMoveStrategy;
import racing.strategy.AlwaysNoMoveStrategy;
import racing.strategy.MoveStrategy;
import racing.view.InputView;

import javax.swing.plaf.PanelUI;
import java.util.List;
import java.util.stream.Collectors;

@DisplayName("레이싱 경주 테스트")
class RacingCarServiceTest {

    @Test
    public void 레이싱카_이동_확인() throws Exception {
        RacingCar racingCar = new RacingCar(0,"test1");
        MoveStrategy moveStrategy = new AlwaysMoveStrategy();
        racingCar.go(moveStrategy, 1);

        Assertions.assertThat(racingCar.getPosition()).isEqualTo(1);
    }

    @Test
    public void 레이싱카_이동_안함_확인() throws Exception {
        RacingCar racingCar = new RacingCar(0,"test1");
        MoveStrategy moveStrategy = new AlwaysNoMoveStrategy();
        racingCar.go(moveStrategy, 1);

        Assertions.assertThat(racingCar.getPosition()).isEqualTo(0);
    }

    @Test
    public void 레이싱카_이름_확인_5자이내() throws Exception {
        String carName = "test111";
        Assertions.assertThatThrownBy(() -> {
            InputView.validationCarName("test111");
        }).isInstanceOf(RuntimeException.class);
    }

    @Test
    public void 우승자_찾기() throws Exception {

        String[] carNames = {"one", "two", "three"};

        List<RacingCar> racingCars = RacingCar.createRacingCars(carNames);

        List<RacingCar> resultRacingCars = racingCars.stream().map(car -> {
            if (car.getCarName() == "two") {
                MoveStrategy moveStrategy = new AlwaysMoveStrategy();
                car.go(moveStrategy, 1);
            }
            return car;
        }).collect(Collectors.toList());

        RacingCarService racingCarService = new RacingCarService();
        List<RacingCar> winnerCars = racingCarService.findWinnerCars(resultRacingCars);
        Assertions.assertThat(winnerCars.get(0).getCarName()).isEqualTo("two");

    }


}