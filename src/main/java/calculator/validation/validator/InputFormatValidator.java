package calculator.validation.validator;

public class InputFormatValidator {

    public boolean validate(String input,String regex) {
        return input.matches(regex);
    }

}
