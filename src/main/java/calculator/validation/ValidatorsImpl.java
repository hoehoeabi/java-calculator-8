package calculator.validation;

import calculator.validation.validator.CharacterDelimiterValidator;
import calculator.validation.validator.InputValidator;
import calculator.validation.validator.NumberDelimiterValidator;

public class ValidatorsImpl implements Validators {

    private final InputValidator inputValidator = new InputValidator();
    private final CharacterDelimiterValidator characterValidator = new CharacterDelimiterValidator();
    private final NumberDelimiterValidator numberValidator = new NumberDelimiterValidator();

    public InputValidator getInputValidator() {
        return inputValidator;
    }

    public CharacterDelimiterValidator getCharacterValidator() {
        return characterValidator;
    }

    public NumberDelimiterValidator getNumberValidator() {
        return numberValidator;
    }
}
