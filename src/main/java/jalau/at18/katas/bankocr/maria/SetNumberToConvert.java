package jalau.at18.katas.bankocr.maria;

import jalau.at18.katas.bankocr.maria.Numbers.*;

import java.util.ArrayList;
import java.util.List;

public class SetNumberToConvert {

    public List<TypeNumber> saveTypeNumber() {
        List<TypeNumber> typeNumbers = new ArrayList<>();
        typeNumbers.add(new ZeroNumber());
        typeNumbers.add(new OneNumber());
        typeNumbers.add(new TwoNumber());
        typeNumbers.add(new ThreeNumber());
        typeNumbers.add(new FourNumber());
        typeNumbers.add(new FiveNumber());
        typeNumbers.add(new SixNumber());
        typeNumbers.add(new SevenNumber());
        typeNumbers.add(new EightNumber());
        typeNumbers.add(new NineNumber());
        return typeNumbers;
    }
}
