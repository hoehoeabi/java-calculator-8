package calculator.delimiter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Delimiters {

    private static Delimiters delimiters;

    private Set<Character> delimitersSet = new HashSet<>(Arrays.asList(',', ':'));

    private Delimiters() {}

    public static Delimiters getInstance() {
        if (delimiters == null) {
            delimiters = new Delimiters();
        }

        return delimiters;
    }

    public Set<Character> getDelimitersSet() {
        return delimitersSet;
    }

    public void add(char delimiter) {
        delimitersSet.add(delimiter);
    }

    public void clear() {
        delimitersSet.clear();
        delimitersSet.addAll(Arrays.asList(',', ':'));
    }
}
