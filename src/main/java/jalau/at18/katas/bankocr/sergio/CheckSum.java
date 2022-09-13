package jalau.at18.katas.bankocr.sergio;

import java.util.List;

public class CheckSum {
    private final int checkSumModule = 11;

    public boolean verifyCheckSum(List<Integer> listNumbers) {
        int checkSumModifier = 1;
        int checkSumCheck = 0;
        for (int index = listNumbers.size() - 1; index >= 0; index--) {
            checkSumCheck = checkSumCheck + (listNumbers.get(index) * checkSumModifier);
            checkSumModifier++;
        }
        return checkSumCheck % checkSumModule == 0;

    }

}
