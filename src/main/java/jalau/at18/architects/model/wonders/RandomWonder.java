package jalau.at18.architects.model.wonders;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomWonder {
    private Wonders[] wonders;
    private List<Integer> usedNumbers;
    public RandomWonder() {
        wonders = Wonders.values();
        usedNumbers = new ArrayList<>();
    }
    public Wonder getRamdomWonder() {
        Random random = new Random();
        Integer number = random.nextInt(wonders.length);
        while (usedNumbers.contains(number)) {
            number = random.nextInt(wonders.length);
        }
        usedNumbers.add(number);
        return wonders[number].getWonder();
    }
    public List<Integer> getUsedNumbers() {
        return usedNumbers;
    }
}
