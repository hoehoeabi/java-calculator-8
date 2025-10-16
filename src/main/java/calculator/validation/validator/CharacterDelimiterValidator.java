package calculator.validation.validator;

import calculator.delimiter.Delimiters;

import java.util.Set;

public class CharacterDelimiterValidator {

    public boolean validate(String input) {

        Set<Character> delimiters = Delimiters
                .getInstance()
                .getDelimitersSet();

        for(char c : input.toCharArray()) {
            boolean isDigit = Character.isDigit(c);
            boolean isRegisteredDelimiter = delimiters.contains(c);

            if (!isRegisteredDelimiter && !isDigit) {
                return false;
            }

        }
        return true;
    }
}
