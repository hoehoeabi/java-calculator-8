package calculator.verification;

import java.util.Set;

public interface Verification {

    /**
     *
     * @param input
     *  1. 입력받은 문자열을 검증
     *
     * (아무문자 무조건 1글자)\n 패턴이 0번 이상으로 시작해야하며
     *  이패턴이 나온뒤(안나왔더라도)
     *  오직 숫자만 최소1회이상 나오게(123가능)
     *  마지막으론 또 패턴인데 문자(무조건하나)숫자(최소1개) 패턴이 0회이상나오게
     *
     *  2. 커스텀 구분자가 있는지 검증
     *
     *  @return boolean
     */
    public boolean validateInput(String input,String regex);

    /**
     * @param input,delimiters
     * 문자들이 구분자들로만 이뤄졌는지 검증
     * @return boolean
     */
    public boolean areCustumDelimiters(String input);

    /**
     * @param start,end,delimiters
     * 숫자를 구분자로 등록했을경우 처음 혹은 마지막 숫자가 구분자인지 확인
     * @return
     */
    public boolean haveNumberDelimiters(char start,char end);

}
