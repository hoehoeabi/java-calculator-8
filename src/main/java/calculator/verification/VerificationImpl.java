package calculator.verification;

import calculator.validation.Validators;

public class VerificationImpl implements Verification {

    private final Validators validators;

    public VerificationImpl(Validators validators) {
        this.validators = validators;
    }

    @Override
    public boolean validateInput(String input, String regex) {
        return validators
                .getInputValidator()
                .validate(input, regex);
    }


    @Override
    public boolean areCustumDelimiters(String input) {
        return validators
                .getCharacterValidator()
                .validate(input);
    }

    @Override
    public boolean haveNumberDelimiters(char start, char end) {
        return validators
                .getNumberValidator()
                .validate(start, end);
    }
}
