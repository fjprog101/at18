package jalau.at18.katas.pokerhands.team2;

public class Input {
    public String[] hands;

    public Input(){
        hands = new String[2];
    }

    public String[] separateHands(String input) {
        String[] splitInput = input.split(" ");
        
        hands[0] = input.substring(0,input.length()/2);
        hands[1] = input.substring(input.length()/2 + 1,input.length());
        return hands;
    }
    
}
