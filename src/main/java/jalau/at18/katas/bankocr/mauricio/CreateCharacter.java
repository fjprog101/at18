package jalau.at18.katas.bankocr.mauricio;

public class CreateCharacter {

    private BuildNumber build;
    private CharValue value;
    private String[][] number;
    public CreateCharacter(CharValue value, BuildNumber build) {
        this.value = value;
        this.build = build;
    }

    public String[][] makeNumber(){
        number = build.buildANumber();
        return number;
    }

    // public String[][] makeNumber(){
    //     value.TWO = makeTwo();
    //     value.THREE = makeThree();
    //     value.FOUR = makeFour();
    //     value.FIVE = makeFive()
    //     makeNumber2()
    // }

    // public String[][] makeNumber2(){
    //     value.SIX = makeTwo();
    //     value.SEVEN = makeThree();
    //     value.EIGHT = makeFour();
    //     value.NINE = makeFive();
    // }


}
