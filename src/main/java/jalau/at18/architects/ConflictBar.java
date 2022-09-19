package jalau.at18.architects;

public class ConflictBar {
    private int numberOfPlayers;
    private int warCalls;
    private boolean conflict;
    public ConflictBar(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
        warCalls = 0;
        conflict = false;
    }
    public void addWarCalls(int horn) {
        if (warCalls + horn < numberOfPlayers) {
            warCalls += horn;
        } else {
            conflict = true;
            warCalls = 0;
        }
    }

    public int getWarCalls() {
        return warCalls;
    }

    public boolean getConflict() {
        return conflict;
    }
}