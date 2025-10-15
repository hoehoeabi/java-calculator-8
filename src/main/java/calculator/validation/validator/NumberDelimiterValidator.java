package calculator.validation.validator;

import java.util.Set;

public class NumberDelimiterValidator {

    public boolean validate(char start, char end, Set<Character> delimiters) {
        return delimiters.contains(start) || delimiters.contains(end);

    }
}
