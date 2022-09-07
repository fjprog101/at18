package jalau.at18.katas.bankocr.adriana;

public enum CharacterType {
    PIPE("|"),
    UNDERSCORE("_"),
    EMPTY(" ");

    private String image;
    CharacterType(String image) {
        this.image = image;
    }
    public String getImage() {
        return image;
    }

}
