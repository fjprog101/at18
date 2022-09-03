package jalau.at18.katas.bankocr.maria;

import jalau.at18.katas.bankocr.maria.Numbers.*;

import java.util.ArrayList;
import java.util.List;

public class SetNumberToConvert {

    public List<TypeNumber> saveTypeNumber() {
        List<TypeNumber> typeNumbers = new ArrayList<>();
        ZeroNumber zeroNumber = new ZeroNumber();
        OneNumber oneNumber = new OneNumber();
        TwoNumber twoNumber = new TwoNumber();
        ThreeNumber threeNumber = new ThreeNumber();
        FourNumber fourNumber = new FourNumber();
        FiveNumber fiveNumber = new FiveNumber();
        SixNumber sixNumber = new SixNumber();
        SevenNumber sevenNumber = new SevenNumber();
        EightNumber eightNumber = new EightNumber();
        NineNumber nineNumber = new NineNumber();
        typeNumbers.add(zeroNumber);
        typeNumbers.add(oneNumber);
        typeNumbers.add(twoNumber);
        typeNumbers.add(threeNumber);
        typeNumbers.add(fourNumber);
        typeNumbers.add(fiveNumber);
        typeNumbers.add(sixNumber);
        typeNumbers.add(sevenNumber);
        typeNumbers.add(eightNumber);
        typeNumbers.add(nineNumber);
        return typeNumbers;
    }


}
