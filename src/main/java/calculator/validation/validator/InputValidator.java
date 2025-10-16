package calculator.validation.validator;

public class InputValidator {

    public boolean validate(String input,String regex) {
        return input.matches(regex);
    }

}
