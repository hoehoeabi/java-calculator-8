package calculator.util;

import calculator.delimiter.Delimiters;
import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class UtilTest {

    @BeforeEach
    void setUp() {
        Delimiters
                .getInstance()
                .clear();
    }

    @Test
    void 문자열에서_숫자들_계산(){
        // given
        String input = "11,2:3";

        // when & then
        assertThat(StringCalculator.sum(input)).isEqualTo(16);
    }

    @Test
    void 입력값에서_구분자_추가(){
        // given
        Set<Character> delimiters = Delimiters
                .getInstance()
                .getDelimitersSet();
        String input = "//@\\n//#\\n11,2:3";

        // when
        StringParser.addDelimiter(input);

        // then
        assertThat(delimiters.size()).isEqualTo(4);
    }

}