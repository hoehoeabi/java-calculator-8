package calculator;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ApplicationTest extends NsTest {
    @Test
    void 커스텀_구분자_사용_성공() {
        assertSimpleTest(() -> {
            run("//;\\n//!\\n//@\\n1!22@3,4");
            assertThat(output()).contains("결과 : 30");
        });
    }

    @Test
    void 커스텀_구분자_미사용_성공() {
        assertSimpleTest(() -> {
            run("11");
            assertThat(output()).contains("결과 : 11");
        });
    }

    @Test
    void 공백_문자열_입력시_0을_출력_성공() {
        assertSimpleTest(() -> {
            run("\n");
            assertThat(output()).contains("결과 : 0");
        });
    }

    @Test
    void 커스텀_구분자_등록구문만_입력(){
        assertSimpleTest(() -> {
            run("//@\\n");
            assertThat(output()).contains("결과 : 0");
        });
    }

    @Test
    void 숫자_구분자_사용(){
        assertSimpleTest(() -> {
            run("//1\\n213:4");
            assertThat(output()).contains("결과 : 9");
        });
    }

    // @@@@@@@@@@@@@@예외 시나리오@@@@@@@@@@@@@@@@@@@@@@@
    @Test
    void 예외_테스트_구분자가_첫글자_실패() {
        assertSimpleTest(() -> {
            run(",1,2,3");
            assertThat(output()).contains("[ERROR]");
        });
    }

    @Test
    void 예외_테스트_구분자가_마지막글자_실패() {
        assertSimpleTest(() -> {
            run("1,2,");
            assertThat(output()).contains("[ERROR]");
        });
    }

    @Test
    void 예외_테스트_등록되지않은_구분자가_마지막글자_실패() {
        assertSimpleTest(() -> {
            run("1,2?");
            assertThat(output()).contains("[ERROR]");
        });
    }

    @Test
    void 예외_테스트_등록되지않은_구분자가_처음글자_실패() {
        assertSimpleTest(() -> {
            run("?1,2,");
            assertThat(output()).contains("[ERROR]");
        });
    }

    @Test
    void 예외_테스트_구분자사이_숫자없음_실패(){
        assertSimpleTest(() -> {
            run("1,,2");
            assertThat(output()).contains("[ERROR]");
        });
    }

    @Test
    void 예외_테스트_숫자구분자가_마지막에옴_실패(){
        assertSimpleTest(() -> {
            run("//4\\n1,2,3,4");
            assertThat(output()).contains("[ERROR]");
        });
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }

    @Test
    void 숫자_구분자_끝에_사용(){
        assertSimpleTest(() -> {
            run("//1\\n213:1");
            assertThat(output()).contains("[ERROR]");
        });
    }

}
