package lotto.controller;

import lotto.domain.LottoRank;
import lotto.domain.LottoResult;
import lotto.domain.LottoTicket;
import lotto.view.InputView;
import lotto.view.OutputView;

import java.util.List;
import java.util.Map;

public class LottoController {

    public static void main(String[] args) {

        int inputMoney = InputView.inputMoney();
        LottoTicket lottoTicket = InputView.buyLottoTicket(inputMoney);
        OutputView.printLottoTickets(lottoTicket);

        String inputWinningNumbers = InputView.inputWinningNumbers();
        List<Integer> winNumbers = InputView.extractNumber(inputWinningNumbers);

        Map<LottoRank, Long> winningResult = lottoTicket.findWinning(winNumbers);
        LottoResult lottoResult = new LottoResult(winningResult);

        OutputView.printWinStatics(lottoResult.getLottoRankMap());
        OutputView.printProfitRate(lottoResult.getLottoRankMap(), inputMoney);


    }
}
