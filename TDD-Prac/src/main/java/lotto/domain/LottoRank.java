package lotto.domain;

import java.util.Arrays;

public enum LottoRank {

    FIRST(6, 1_000_000_000),
    SECOND(5, 50_000_000),
    THIRD(4, 1_500_000),
    FOURTH(3, 50_000),
    FIFTH(2, 5_000),
    SIXTH(1, 0),
    NONE(0, 0)
    ;

    private final int matchCount;
    private final int winMoney;

    LottoRank(int matchCount, int winMoney) {
        this.matchCount = matchCount;
        this.winMoney = winMoney;
    }

    public int getMatchCount() {
        return matchCount;
    }

    public int getWinMoney() {
        return winMoney;
    }

    public static LottoRank valueOf(int matchCount){
        return Arrays.stream(values())
                .filter(rank -> rank.matchCount == matchCount)
                .findFirst()
                .orElse(NONE);
    }
}
