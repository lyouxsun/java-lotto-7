package lotto.domain;

import camp.nextstep.edu.missionutils.Randoms;
import lotto.domain.lottoForm.Lotto;

import java.util.List;
import java.util.stream.LongStream;

import static lotto.constant.LottoValues.*;

public class LottoMachine {
    private final Lottos lottos = new Lottos();

    public Lottos issue(long lottoCount) {
        LongStream.range(0, lottoCount).forEach(i -> {
            Lotto lotto = Lotto.from(generateNumbers());
            lottos.addLotto(lotto);
        });
        return lottos;
    }

    public List<Integer> generateNumbers() {
        return Randoms.pickUniqueNumbersInRange(
                NUMBER_MIN.value(),
                NUMBER_MAX.value(),
                SIZE.value()
        );
    }
}
