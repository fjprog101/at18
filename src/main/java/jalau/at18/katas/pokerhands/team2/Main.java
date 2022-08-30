package jalau.at18.katas.pokerhands.team2;

public class Main {
    public static void main(String[] args) {
        String input = "Black: 2H 3D 5S 9C KD  White: 2C 3H 4S 8C AH";
        Game game = new Game(input);
        game.getGameResults();
    }

}
