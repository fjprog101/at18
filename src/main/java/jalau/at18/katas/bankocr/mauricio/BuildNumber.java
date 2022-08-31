package jalau.at18.katas.bankocr.mauricio;

public class BuildNumber {

    private String[][] matNumber;
    private CharValue value;
    private CharacterNumbers number;
    public BuildNumber(CharValue value, CharacterNumbers number) {
        this.value = value;
        this.number = number;
    }
    public String[][] buildANumber(){
        if(value == value.TWO){
            matNumber = number.characterForTwo();
        } 
        return matNumber;
    }
}
