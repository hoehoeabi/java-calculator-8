package calculator.validation;

import calculator.validation.validator.CharacterDelimiterValidator;
import calculator.validation.validator.InputValidator;
import calculator.validation.validator.NumberDelimiterValidator;

public interface Validators {

    InputValidator getInputValidator();

    CharacterDelimiterValidator getCharacterValidator();

    NumberDelimiterValidator getNumberValidator();

}
