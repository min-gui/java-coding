package lotto.domain;

import lotto.util.RottoNumberUtil;

import java.util.List;

public class LottoNumber {

    private final List<Integer> numbers;

    public LottoNumber(int lottoNum) {
        this.numbers = this.generateSortedLottoNumbers(lottoNum);
    }

    private List<Integer> generateSortedLottoNumbers(int lottoNum) {
        List<Integer> lottoList = RottoNumberUtil.generateLottoNumber(lottoNum);
        lottoList.sort(Integer::compareTo);
        return lottoList;
    }

    public int countMatchLottoNumber(List<Integer> winningNumbers) {
        return (int) numbers.stream()
                .filter(winningNumbers::contains)
                .count();
    }

    public String numberToString(){
        return numbers.toString();
    }
}
