package calculator.verification;

import calculator.delimiter.Delimiters;
import calculator.validation.Validators;
import calculator.validation.ValidatorsImpl;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class AreCustumDelimitersTest {

    Validators validators = new ValidatorsImpl();
    Verification verification = new VerificationImpl(validators);

    @Test
    void 옳바른_구분자_확인_성공(){
        // given
        String input = "1:2,3";

        // when & then
        assertThat(verification.areCustumDelimiters(input)).isTrue();
    }

    @Test
    void 틀린_구분자_확인_성공(){
        // given
        String input = "1:2$3";

        // when & then
        assertThat(verification.areCustumDelimiters(input)).isFalse();
    }
}
