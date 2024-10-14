package lotto.view;

import lotto.domain.LottoNumber;
import lotto.domain.LottoRank;
import lotto.domain.LottoTicket;

import java.util.HashMap;
import java.util.Map;

public class OutputView {
    private static final Map<Integer, String> MATCH_MSG = new HashMap<>();

    static {
        MATCH_MSG.put(3, "3개 일치(5000원)- ");
        MATCH_MSG.put(4, "4개 일치(50000원)- ");
        MATCH_MSG.put(5, "5개 일치(1500000원)- ");
        MATCH_MSG.put(6, "6개 일치(2000000000원)- ");
    }

    private OutputView(){}

    public static void printLottoTickets(LottoTicket lottoTicket){
        lottoTicket.getLottoNumbers()
                .stream()
                .map(LottoNumber::numberToString)
                .forEach(System.out::println);
    }

    public static void printWinStatics(Map<LottoRank, Long> winningResult){
        MATCH_MSG.entrySet().stream()
                .forEach(entry ->{
                    Long result = winningResult.get(LottoRank.valueOf(entry.getKey()));
                    result = result == null ? 0 : result;
                    System.out.println(entry.getValue() +  result + "개");
                });
    }

    public static void printProfitRate(Map<LottoRank, Long> winningResult,int inputMoney){
        int totalWinSum = winningResult.entrySet().stream()
                .filter(entry -> entry.getKey() != LottoRank.NONE)
                .mapToInt(entry -> (int) (entry.getKey().getWinMoney() * entry.getValue()))
                .sum();


        double profitRate = (double) totalWinSum / inputMoney;
        System.out.println("총 수익률은 " + profitRate + "입니다.");
    }
}
