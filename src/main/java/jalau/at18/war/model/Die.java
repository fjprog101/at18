package jalau.at18.war.model;

public class Die {

    private DieFace currentFace;

    public Die(DieFace face) {
        currentFace = face;
    }

    public void setFace(DieFace newFace) {
        currentFace = newFace;
    }

    public DieFace getFace() {
        return currentFace;
    }
}
