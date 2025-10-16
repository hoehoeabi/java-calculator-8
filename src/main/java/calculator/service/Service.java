package calculator.service;

import calculator.verification.Verification;
import camp.nextstep.edu.missionutils.Console;

import static calculator.util.StringCalculator.sum;
import static calculator.util.StringParser.addDelimiter;


public class Service {

    private final Verification verification;

    public Service(Verification verification) {
        this.verification = verification;
    }

    private final String ONLY_DELIMITER_FORMART = "^(?://.\\\\n)*";
    private final String INPUT_FORMART = "^(?://.\\\\n)*\\d+(?:\\D\\d+)*$";
    private final String CHECK_DELIMITER_FORMART = "^(?://.\\\\n)+.*";


    public void run(){

        System.out.println("덧셈할 문자열을 입력해 주세요." );
        String input = Console.readLine();

        if(input.isEmpty() || verification.validateInput(input, ONLY_DELIMITER_FORMART)){
            System.out.println("결과 : 0" );
            return ;
        }

        if(!verification.validateInput(input, INPUT_FORMART))
            throw new IllegalArgumentException(
                    "들어올 수 있는 패턴은 //{구분자로 사용할 아무문자}\\n" +
                    "{여러자리숫자}" +
                    "{여러자리숫자}{문자하나} 입니다.");

        if(verification.validateInput(input, CHECK_DELIMITER_FORMART))
            input = addDelimiter(input);


        if(!verification.areCustumDelimiters(input))
            throw new IllegalArgumentException("구분자가 아닌 문자를 구분자로 사용하였습니다");


        if(verification.haveNumberDelimiters(input.charAt(0), input.charAt(input.length()-1)))
            throw new IllegalArgumentException("숫자 구분자가 처음 혹은 마지막글자입니다");


        System.out.println("결과 : " + sum(input));

    }
}
