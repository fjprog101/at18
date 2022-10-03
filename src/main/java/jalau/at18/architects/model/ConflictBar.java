package jalau.at18.architects.model;

public class ConflictBar {
    private int numberOfPlayers;
    private int warCalls;
    private boolean conflict;
    public ConflictBar(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
        warCalls = 0;
    }
    public void addWarCalls(int horn) {
        if (warCalls + horn < numberOfPlayers) {
            warCalls += horn;
            conflict = false;
        } else {
            warCalls = 0;
            conflict = true;
        }
    }

    public int getWarCalls() {
        return warCalls;
    }

    public boolean getConflict() {
        return conflict;
    }
}