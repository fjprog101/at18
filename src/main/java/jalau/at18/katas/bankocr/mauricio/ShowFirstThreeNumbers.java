package jalau.at18.katas.bankocr.mauricio;

public class ShowFirstThreeNumbers {
    public void showNumberSelected(String[][] number1, String[][] number2, String[][] number3) {
        for (int row = 0; row < number1.length; row++) {
            for (int col = 0; col < number1[1].length; col++) {
                System.out.println(number1[row][col]);
            }
        }
        for (int row = 0; row < number2.length; row++) {
            for (int col = 0; col < number2[1].length; col++) {
                System.out.println(number2[row][col]);
            }
        }

        for (int row = 0; row < number3.length; row++) {
            for (int col = 0; col < number3[1].length; col++) {
                System.out.println(number3[row][col]);
            }
        }
    }
}
