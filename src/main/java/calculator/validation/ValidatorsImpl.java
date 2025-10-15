package calculator.validation;

import calculator.validation.validator.DelimiterCharacterValidator;
import calculator.validation.validator.InputFormatValidator;
import calculator.validation.validator.NumberDelimiterValidator;

public class ValidatorsImpl implements Validators {

    private final InputFormatValidator inputFormatValidator = new InputFormatValidator();
    private final DelimiterCharacterValidator delimiterCharacterValidator = new DelimiterCharacterValidator();
    private final NumberDelimiterValidator numberDelimiterValidator = new NumberDelimiterValidator();

    public InputFormatValidator getInputFormatValidator() {
        return inputFormatValidator;
    }

    public DelimiterCharacterValidator getDelimiterCharacterValidator() {
        return delimiterCharacterValidator;
    }

    public NumberDelimiterValidator getNumberDelimiterValidator() {
        return numberDelimiterValidator;
    }
}
