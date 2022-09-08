package jalau.at18.katas.bankocr.libertad;

import java.util.Arrays;

public class Comparator {
    public boolean compare(String[] strings, String[] input) {
        boolean isEquals = false;
        if (Arrays.deepEquals(strings, input)) {
            isEquals = true;
        }
        return isEquals;
    }
}
