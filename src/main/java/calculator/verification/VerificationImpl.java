package calculator.verification;

import calculator.validation.Validators;
import calculator.validation.ValidatorsImpl;

import java.util.Set;

public class VerificationImpl implements Verification {

    private final Validators validators;

    public VerificationImpl(Validators validators) {
        this.validators = validators;
    }

    @Override
    public boolean validateInput(String input, String regex) {
        return validators.getInputFormatValidator().validate(input, regex);
    }


    @Override
    public boolean areCustumDelimiters(String input, Set<Character> delimiters) {
        return validators.getDelimiterCharacterValidator().validate(input, delimiters);
    }

    @Override
    public boolean haveNumberDelimiters(char start, char end, Set<Character> delimiters) {
        return validators.getNumberDelimiterValidator().validate(start, end, delimiters);
    }
}
