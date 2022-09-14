package jalau.at18.kingoftokyo;

public class DiceIndentifier {
    private DiceRoller diceRoller;

    public DiceIndentifier() {
        this.diceRoller = new DiceRoller();
    }

    public String[] value() {
        String[] numberRandom = diceRoller.showListDices().split("");
        return numberRandom;
    }

    public boolean identifyDices() {
        // 3 6 4 3 5 3
        //1. Identificar dados:
        //         identificar 3 numeros iguales y mandar el valor del numero. 3->3 return valor3
        //         condicion para verificar si el valor entregado 3, esta entre los getRepresentative (1,2,3)
        return true;
    }

}
