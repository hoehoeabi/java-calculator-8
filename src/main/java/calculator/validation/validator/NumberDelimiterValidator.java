package calculator.validation.validator;

import calculator.delimiter.Delimiters;

import java.util.Set;

public class NumberDelimiterValidator {

    public boolean validate(char start, char end) {
        Set<Character> delimiters = Delimiters
                .getInstance()
                .getDelimitersSet();
        return delimiters.contains(start) || delimiters.contains(end);

    }
}
