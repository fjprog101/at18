package jalau.at18.kingoftokyo.model;

import org.junit.Test;

import jalau.at18.kingoftokyo.model.DiceFace;
import jalau.at18.kingoftokyo.model.DiceFaceKeeper;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DiceFaceKeeperTest {
    @Test
    public void shouldHaveDicesSavedByPlayer() {
        DiceFaceKeeper diceFaceKeeper = new DiceFaceKeeper();
        List<DiceFace> totalList = new ArrayList<>();
        List<DiceFace> listDiceFace = new ArrayList<>();
        listDiceFace.add(DiceFace.TWO);
        listDiceFace.add(DiceFace.TWO);
        listDiceFace.add(DiceFace.TWO);
        diceFaceKeeper.saveListDiceFace(listDiceFace);
        assertEquals(listDiceFace, diceFaceKeeper.getListDiceFaceKeeper());
        List<DiceFace> listDiceFace1 = new ArrayList<>();
        listDiceFace1.add(DiceFace.HEALING);
        diceFaceKeeper.saveListDiceFace(listDiceFace1);
        totalList.addAll(listDiceFace);
        totalList.addAll(listDiceFace1);
        assertEquals(totalList, diceFaceKeeper.getListDiceFaceKeeper());
    }
}
