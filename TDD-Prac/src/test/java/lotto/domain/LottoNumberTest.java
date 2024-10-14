package lotto.domain;

import lotto.util.RottoNumberUtil;
import lotto.view.InputView;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


@DisplayName("로또 번호 테스트")
class LottoNumberTest {

    @Test
    @DisplayName("로또 번호 생성 테스트")
    public void generateLottoTest() throws Exception {

        int lottoNum = 6;
        List<Integer> integerList = RottoNumberUtil.generateLottoNumber(lottoNum);
        assertThat(integerList.size()).isEqualTo(lottoNum);

    }

    @ParameterizedTest
    @DisplayName("로또 티켓 생성 테스트")
    @ValueSource(ints = {1, 2, 3, 4, 5})
    public void lottoTicketTest(int cnt) throws Exception {

        LottoTicket lottoTicket = new LottoTicket(cnt);

        int size = lottoTicket.getLottoNumbers().size();

        assertThat(size).isEqualTo(cnt);

    }

    @ParameterizedTest
    @NullAndEmptySource
    @DisplayName("로또 번호 입력 검증 테스트")
    public void validateWinningNumbersTest(String input) throws Exception {
        assertThatThrownBy(() -> InputView.validateWinningNumbers(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("null 또는 빈 문자열은 입력할 수 없습니다.");

     }




}