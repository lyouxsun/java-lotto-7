package lotto.view;

import camp.nextstep.edu.missionutils.Console;

public class RequestView {
    public static String getMoney(){
        System.out.println("구입금액을 입력해 주세요.");
        return Console.readLine();
    }
}