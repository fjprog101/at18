package jalau.at18.katas.pokerhands.team2;

public class Game {
    private Hand[] hands;
    private String input;

    public Game(String input) {
        hands = new Hand[2];
        this.input = input;
    }

    public void initGame() {
        splitChainInHalf(input);

    }

    public String[] splitChainInHalf(String input) {
        String[] entrys = new String[2];
        entrys[0] = input.substring(0, input.length() / 2);
        entrys[1] = input.substring(input.length() / 2 + 1, input.length());
        fillHands(entrys[0], entrys[1]);
        return entrys;
    }

    private void fillHands(String firstEntry, String secondEntry) {
        if (firstEntry.contains("Black")) {
            fillHand(firstEntry, 0);
            fillHand(secondEntry, 1);
        } else {
            fillHand(secondEntry, 0);
            fillHand(firstEntry, 1);
        }
    }


    private void fillHand(String entry, int position) {
        //hands[position] = entry;
        System.out.println("en prueba");
    }


}
