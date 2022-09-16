package jalau.at18.architects;

public abstract class Wonder {
    private Stage[] architects;
    public Wonder() {
        architects = new Stage[5];
    }
    public Stage[] getStages() {
        return architects;
    }
    abstract void fillStages();
}
