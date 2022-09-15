package jalau.at18.azul;

import java.util.*;

public class MixedBag {

    public ArrayList<Character> mixColors(ArrayList<Character> simpleBag) {
        ArrayList<Character> mixedBag = simpleBag;
        Collections.shuffle(mixedBag);
        return mixedBag;
    }
}