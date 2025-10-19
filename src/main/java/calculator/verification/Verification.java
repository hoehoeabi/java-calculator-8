package calculator.verification;

import java.util.Set;

public interface Verification {

    /**
     *
     * @param input(문자열), regex(정규식)
     *  1. 입력받은 문자열을 검증
     *
     *  1_1
     *  구분자 추가구문만 있을경우
     *
     *  1_2
     * (아무문자 무조건 1글자)\n 패턴이 0번 이상으로 시작해야하며
     *  이패턴이 나온뒤(안나왔더라도)
     *  오직 숫자만 최소1회이상 나오게(123가능)
     *  마지막으론 또 패턴인데 문자(무조건하나)숫자(최소1개) 패턴이 0회이상나오게
     *
     *  2. 커스텀 구분자가 있는지 검증
     *
     *  @return boolean
     */
    boolean validateInput(String input,String regex);

    /**
     * @param input(문자열)
     * 문자들이 구분자들로만 이뤄졌는지 검증
     * @return boolean
     */
    boolean areCustumDelimiters(String input);

    /**
     * @param start(문자열의 시작 글자),end(문자열의 끝 글자)
     * 숫자를 구분자로 등록했을경우 처음 혹은 마지막 숫자가 구분자인지 확인
     * @return
     */
    boolean haveNumberDelimiters(char start,char end);

}
