package calculator.validation;

import calculator.validation.validator.DelimiterCharacterValidator;
import calculator.validation.validator.InputFormatValidator;
import calculator.validation.validator.NumberDelimiterValidator;

public interface Validators {

    public InputFormatValidator getInputFormatValidator();

    public DelimiterCharacterValidator getDelimiterCharacterValidator();

    public NumberDelimiterValidator getNumberDelimiterValidator();

}
