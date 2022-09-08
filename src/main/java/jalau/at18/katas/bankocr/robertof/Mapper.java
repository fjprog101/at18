package jalau.at18.katas.bankocr.robertof;

import java.util.Map;

public class Mapper {
    private final Map<Integer, Integer> map = Map.of(13, 1, 26, 2, 28, 3, 24, 4, 30, 5,
                    37, 6, 15, 7, 41, 8, 34, 9, 36, 0);
    public int getMapValue(int key) {
        return map.get(key);
    }
}
