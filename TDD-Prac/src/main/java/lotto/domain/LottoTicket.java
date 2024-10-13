package lotto.domain;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LottoTicket {
    private final static int LOTTO_DEFAULT_NUM = 6;
    private List<LottoNumber> lottoNumbers;

    public LottoTicket (int lottoCnt){
        this.lottoNumbers = createLotto(lottoCnt);
    }


    private List<LottoNumber> createLotto(int lottoCnt){
        return IntStream.range(0, lottoCnt)
                .mapToObj(lotto -> new LottoNumber(LOTTO_DEFAULT_NUM))
                .collect(Collectors.toList());
    }

    public List<LottoNumber> getLottoNumbers() {
        return lottoNumbers;
    }

    public Map<LottoRank, Long> findWinning(List<Integer> winLottoNumber){
         return lottoNumbers.stream()
                .map(lottoNumber -> lottoNumber.countMatchLottoNumber(winLottoNumber))
                .map(LottoRank::valueOf)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
