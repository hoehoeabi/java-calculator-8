package calculator.util;

import calculator.delimiter.Delimiters;

import java.util.Set;

public class StringCalculator {

    public static int sum(String input) {
        Set<Character> delimiters = Delimiters.getInstance().getDelimitersSet();
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        // 계산
        for(char c : input.toCharArray()) {
            // 구분자면 + 계산
            if(delimiters.contains(c)) {
                answer += Integer.parseInt(sb.toString());
                sb = new StringBuilder();
                continue;
            }
            // 숫자면 StringBuilder에 추가
            if(Character.isDigit(c)) {
                sb.append(c);
            }
        }
        // 마지막 숫자는 뒤에 구분자가 없기에 따로 덧셈
        answer += Integer.parseInt(sb.toString());
        return answer;

    }
}
