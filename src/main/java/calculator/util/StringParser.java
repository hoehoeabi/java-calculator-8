package calculator.util;

import calculator.delimiter.Delimiters;

import java.util.Set;

public class StringParser {

    private StringParser() {
        throw new IllegalStateException("StringParser is Utility class");
    }

    public static String addDelimiter(String input){
        Set<Character> delimiters = Delimiters
                .getInstance()
                .getDelimitersSet();
        int index = input.indexOf("//");
        // 커스텀 구분자가 있다면
        while(index != -1) {
            delimiters.add(input.charAt(index+2));
            input = input.substring(input.indexOf("n")+1);
            index = input.indexOf("//");
        }
        return input;
    }
}
