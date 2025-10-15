package calculator.validation.validator;

import java.util.Set;

public class DelimiterCharacterValidator {

    public boolean validate(String input, Set<Character> delimiters) {

        for(char c : input.toCharArray()) {
            // 문자이며 구분자에 속해있으면 통과
            if(Character.isLetter(c) && delimiters.contains(c)) continue;
            // 문자이며 구분자에 속해있지 않으면 실패
            else if(Character.isLetter(c) && !delimiters.contains(c)) return false;
            // 숫자이며 구분자에 속해있으면 통과
            else if(Character.isDigit(c) && delimiters.contains(c)) continue;
            // 숫자이며 구분자에 속해있지 않으면 통과
            else continue;

        }
        return true;
    }
}
