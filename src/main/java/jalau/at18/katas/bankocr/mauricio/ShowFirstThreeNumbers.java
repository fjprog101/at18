package jalau.at18.katas.bankocr.mauricio;

public class ShowFirstThreeNumbers {
    public void showNumberSelected(String[][] number1, String[][] number2, String[][] number3) {
        for (int row = 0; row < number1.length; row++) {
            int newLine = 0;
            for (int col = 0; col < number1[1].length; col++) {
                System.out.print(number1[row][col]);
                newLine++;
                if (newLine == number1.length) {
                    System.out.println("");
                }
            }
        }
        for (int row = 0; row < number2.length; row++) {
            int newLine = 0;
            for (int col = 0; col < number2[1].length; col++) {
                System.out.print(number2[row][col]);
                newLine++;
                if (newLine == number2.length) {
                    System.out.println("");
                }
            }
        }

        for (int row = 0; row < number3.length; row++) {
            int newLine = 0;
            for (int col = 0; col < number3[1].length; col++) {
                System.out.print(number3[row][col]);
                newLine++;
                if (newLine == number3.length) {
                    System.out.println("");
                }
            }
        }
    }
}
