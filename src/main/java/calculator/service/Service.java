package calculator.service;

import calculator.validation.Validators;
import calculator.verification.Verification;
import camp.nextstep.edu.missionutils.Console;

public class Service {

    private final Validators validators;
    private final Verification verification;

    public Service(Validators validators, Verification verification) {
        this.validators = validators;
        this.verification = verification;
    }

    public void run(){
        System.out.println("덧셈할 문자열을 입력해 주세요.\n" );
        String input = Console.readLine();



        System.out.println("결과 : " );

    }
}
