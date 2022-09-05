package jalau.at18.katas.bankocr.mauricio;

public class CreateCharacter {

    private BuildNumber build;
    private CharValue value;
    private String[][] number;

    public CreateCharacter(CharValue value, BuildNumber build) {
        this.value = value;
        this.build = build;
    }

    public String[][] makeNumber() {
        number = build.buildANumber();
        return number;
    }
}
