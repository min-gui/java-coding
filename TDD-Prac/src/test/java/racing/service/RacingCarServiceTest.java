package racing.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racing.domain.RacingCar;
import racing.strategy.AlwaysMoveStrategy;
import racing.strategy.AlwaysNoMoveStrategy;
import racing.strategy.MoveStrategy;

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


}