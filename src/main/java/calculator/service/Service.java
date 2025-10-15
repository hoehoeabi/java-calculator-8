package calculator.service;

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
//        Set<Character> delimiters = Delimiters.getInstance().getDelimitersSet();

        System.out.println("덧셈할 문자열을 입력해 주세요.\n" );
        String input = Console.readLine();

        if(input.isEmpty()){
            System.out.println("결과 : 0" );
            return;
        }

        if(!verification.validateInput(input, INPUT_FORMART))
            throw new IllegalArgumentException();

        if(verification.validateInput(input, CHECK_DELIMITER_FORMART)){
            // 구분자 추가 로직
            // input에서 구분자를 추출하며 추출이 끝난 구분자 구문은 잘라내기
        }

        if(!verification.areCustumDelimiters(input)){
            throw new IllegalArgumentException();
        }

        if(verification.haveNumberDelimiters(input.charAt(0), input.charAt(input.length()-1))){
            throw new IllegalArgumentException();
        }

        // 계산 로직


        System.out.println("결과 : " );

    }
}
