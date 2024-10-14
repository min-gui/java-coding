package lotto.domain;

import java.util.HashMap;
import java.util.Map;

public class LottoResult {

    private Map<LottoRank, Long> lottoRankMap = new HashMap<>();

    public LottoResult(Map<LottoRank, Long> lottoRankMap){
        this.lottoRankMap = lottoRankMap;
    }

    public Map<LottoRank, Long> getLottoRankMap() {
        return lottoRankMap;
    }
}
