package jalau.at18.katas.bankocr.mauricio;

import java.util.ArrayList;

public class MakeTheList {
    private final int one = 1;
    private final int two = 2;
    private final int three = 3;
    private final int four = 4;
    private final int five = 5;
    private final int six = 6;
    private final int seven = 7;
    private final int eight = 8;

    public int[] makeAList(ArrayList<Integer> mainList) {
        mainList.add(three);
        mainList.add(four);
        mainList.add(five);
        mainList.add(eight);
        mainList.add(eight);
        mainList.add(two);
        mainList.add(eight);
        mainList.add(six);
        mainList.add(five);
        int[] newList = mainList.stream().mapToInt(Integer::intValue).toArray();
        return newList;
    }
}
