package jalau.at18.kingoftokyo;

import java.util.HashMap;
import java.util.List;

public class DiceIndentifier {
    private DiceRoller diceRoller;
    private HashMap<DiceFace, Integer> diceCount;

    public DiceIndentifier() {
        this.diceRoller = new DiceRoller();
        this.diceCount = new HashMap<DiceFace, Integer>();
    }

    public HashMap<DiceFace, Integer> countDice(List<DiceFace> listRandomDiceFace) {
        //List<DiceFace> listRandomDice = diceRoller.randomDice();
        for (DiceFace randomDiceFace : listRandomDiceFace) {
            addDiceWithCount(randomDiceFace);
        }
        return getDiceFaceCount();
    }

    public void addDiceWithCount(DiceFace diceFace) {
        int existingCount = 0;
        if (diceCount.containsKey(diceFace)) {
            existingCount = getDiceHashMap(diceFace);
        }
        diceCount.put(diceFace, existingCount + 1);
    }

    public int getDiceHashMap(DiceFace diceFace) {
        return diceCount.get(diceFace);
    }

    public HashMap<DiceFace, Integer> getDiceFaceCount() {
        return diceCount;
    }

    public int reviewString() {
        String numberDicesValues = diceRoller.showListDices();
        if (numberDicesValues.contains("1")) {
            return countDiceFaces(numberDicesValues, '1');
        } else if (numberDicesValues.contains("2")) {
            return countDiceFaces(numberDicesValues, '2');
        } else {
            return countDiceFaces(numberDicesValues, '3');
        }
    }

    public int countDiceFaces(String numberRandom, Character number) {
        int pos = 0;
        int contador = 0;
        pos = numberRandom.indexOf(number);

        while (pos != -1) {
            contador++;
            pos = numberRandom.indexOf(number, pos + 1);
        }
        return contador;
    }


    public boolean identifyDices() {
        // 3 6 4 3 5 3
        //1. Identificar dados:
        //         identificar 3 numeros iguales y mandar el valor del numero. 3->3 return valor3
        //         condicion para verificar si el valor entregado 3, esta entre los getRepresentative (1,2,3)
        return true;
    }

}
