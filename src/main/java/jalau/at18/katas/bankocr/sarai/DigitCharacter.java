package jalau.at18.katas.bankocr.sarai;

public class DigitCharacter {
private final int sizethree = 3;
private final int sizeArray = 27;
private String[] matrixSize = new String[sizethree];
private String[] matrixSize27 = new String[sizeArray];


private final int sizenine = 9;
private int []respuesta;

    public DigitCharacter(String[] matrixSize) {
        this.matrixSize = matrixSize;
        respuesta = new int [sizenine];
        setrecorrerEntrada();
    }
    public void setrecorrerEntrada() {
        int cont=0;
        for (int index = 0; index < matrixSize27.length; index += 3) {
            DigitReader mirespuesta = new DigitReader(sacarposiciones(index));
            respuesta[cont] = mirespuesta.getnaturalNumbers();
            cont += 1;
        }
    }

    public String getrespuesta(){
        String value = "";
        for(int index=0 ; index < respuesta.length ;index++){
            value += Integer.toString(respuesta[index]);
        }
        return value;
    }

    public int[] getrecorrerEntrada(){
        return respuesta;
    }

    public String[] sacarposiciones(int index){
        String[] numberEntry = new String[sizethree];
        numberEntry[0] = matrixSize[0].substring(index, index+3);
        numberEntry[1] = matrixSize[1].substring(index, index+3);
        numberEntry[2] = matrixSize[2].substring(index, index+3);
        return numberEntry;
    }
}
