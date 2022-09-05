package jalau.at18.katas.bankocr.mauricio;

public class ShowFirstThreeNumbers {
    public void showNumberSelected(String[][][] listNumbers) {
        for (int element = 0; element < listNumbers.length; element++) {
            for (int row = 0; row < listNumbers[1].length; row++) {
                int newLine = 0;
                for (int col = 0; col < listNumbers[1].length; col++) {
                    System.out.print(listNumbers[element][row][col]);
                    newLine++;
                    if (newLine == listNumbers[1].length) {
                        System.out.println("");
                    }
                }
            }
        }
    }
}
