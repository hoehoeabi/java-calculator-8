package calculator.service;

import calculator.validation.Validators;
import calculator.verification.Verification;
import camp.nextstep.edu.missionutils.Console;

public class Service {

    private final Verification verification;

    public Service(Verification verification) {
        this.verification = verification;
    }

    private final String INPUT_FORMART = "^(?://.\\\\n)*\\d+(?:\\D\\d+)*$";
    private final String CHECK_DELIMITER_FORMART = "^(?://.\\\\n)*\\d+$";

    public void run(){
        System.out.println("덧셈할 문자열을 입력해 주세요.\n" );
        String input = Console.readLine();



        System.out.println("결과 : " );

    }
}
