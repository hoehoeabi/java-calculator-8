package calculator.verification;

import calculator.validation.Validators;
import calculator.validation.ValidatorsImpl;
import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class VerificationImplTest {

    Validators validators = new ValidatorsImpl();
    Verification verification = new VerificationImpl(validators);

    @Test
    void 구분자등록만_있는지_정규식_테스트(){
        // given
        String ONLY_DELIMITER_FORMART = "^(?://.\\\\n)*";

        String error1 = "//;\\n//#\\n11;2;3";
        String error2 = "//;\\n1;2";
        String error3 = "23";
        String error4 = "//!\\n";

        // when
        boolean isMatch1 = verification.validateInput(error1, ONLY_DELIMITER_FORMART);
        boolean isMatch2 = verification.validateInput(error2, ONLY_DELIMITER_FORMART);
        boolean isMatch3 = verification.validateInput(error3, ONLY_DELIMITER_FORMART);
        boolean isMatch4 = verification.validateInput(error4, ONLY_DELIMITER_FORMART);
        //  then
        assertThat(isMatch1).isFalse();
        assertThat(isMatch2).isFalse();
        assertThat(isMatch3).isFalse();
        assertThat(isMatch4).isTrue();
    }

    @Test
    void 입력값_정규식_테스트_성공(){
        // given
        String INPUT_FORMART = "^(?://.\\\\n)*\\d+(?:\\D\\d+)*$";

        String correct1 = "//;\\n//#\\n11;2;3";
        String correct2 = "//;\\n1;2";
        String correct3 = "23";

        // when
        boolean isMatch1 = verification.validateInput(correct1, INPUT_FORMART);
        boolean isMatch2 = verification.validateInput(correct2, INPUT_FORMART);
        boolean isMatch3 = verification.validateInput(correct3, INPUT_FORMART);

        //  then
        assertThat(isMatch1).isTrue();
        assertThat(isMatch2).isTrue();
        assertThat(isMatch3).isTrue();
    }

    @Test
    void 입력값_정규식_테스트_실패(){
        // given
        String INPUT_FORMART = "^(?://.\\\\n)*\\d+(?:\\D\\d+)*$";

        String error1 = "//\\n//#\\n11;2;3";
        String error2 = "//;;;;\\n1;2";
        String error3 = "1?";

        // when
        boolean isMatch1 = verification.validateInput(error1, INPUT_FORMART);
        boolean isMatch2 = verification.validateInput(error2, INPUT_FORMART);
        boolean isMatch3 = verification.validateInput(error3, INPUT_FORMART);

        //  then
        assertThat(isMatch1).isFalse();
        assertThat(isMatch2).isFalse();
        assertThat(isMatch3).isFalse();
    }

    @Test
    void 커스텀구분자등록여부_정규식_테스트(){
        // given
        String CHECK_DELIMITER_FORMART = "^(?://.\\\\n)+.*";

        String correct1 = "//;\\n//#\\n11;2;3";
        String correct2 = "//;\\n1;2";
        String correct3 = "23";

        // when
        boolean isMatch1 = verification.validateInput(correct1, CHECK_DELIMITER_FORMART);
        boolean isMatch2 = verification.validateInput(correct2, CHECK_DELIMITER_FORMART);
        boolean isMatch3 = verification.validateInput(correct3, CHECK_DELIMITER_FORMART);

        //  then
        assertThat(isMatch1).isTrue();
        assertThat(isMatch2).isTrue();
        assertThat(isMatch3).isFalse();
    }

}