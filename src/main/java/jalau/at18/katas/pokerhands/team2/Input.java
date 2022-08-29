package jalau.at18.katas.pokerhands.team2;

public class Input {
    public String[] hands;

    public String[] separateHands(String input) {
        System.out.print(input.substring(0,input.length()/2));
        hands[0] = input.substring(0,input.length()/2);
        hands[1] = input.substring(input.length()/2,input.length());
        System.out.print(hands[0]);
        return hands;

    }
    
}
