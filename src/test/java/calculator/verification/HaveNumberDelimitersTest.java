package calculator.verification;

import calculator.delimiter.Delimiters;
import calculator.validation.Validators;
import calculator.validation.ValidatorsImpl;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class HaveNumberDelimitersTest {

    Validators validators = new ValidatorsImpl();
    Verification verification = new VerificationImpl(validators);

    @Test
    void 숫자구분자_옳바른_위치_성공(){
        // given
        String input = "213,4";
        Delimiters.getInstance().add('1');

        // when
        boolean result = verification.haveNumberDelimiters(input.charAt(0), input.charAt(input.length()-1));

        // then
        assertThat(result).isFalse();
    }

    @Test
    void 숫자구분자_처음_위치_실패(){
        // given
        String input = "1:2,3";
        Delimiters.getInstance().add('1');

        // when
        boolean result = verification.haveNumberDelimiters(input.charAt(0), input.charAt(input.length()-1));

        // then
        assertThat(result).isTrue();
    }
}
