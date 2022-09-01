package jalau.at18.katas.bankocr.carlos;

public class NumberToSign {
    public static char [][] matrixNumber;



    public static char[][] oneToSign() {
        matrixNumber[1][1] = '|';
        matrixNumber[2][1] = '|';
        return matrixNumber;
    }

     public static void twoToSign() {
        matrixNumber[0][1] = '_';
        matrixNumber[1][2] = '|'; matrixNumber[1][1] = '_';
        matrixNumber[2][0] = '|'; matrixNumber[2][2] = '_';
        //printNumber(matrixNumber);
    }
    public static void printNumber(char [][] matrixNumber) {
        matrixNumber = oneToSign();
        for (int index = 0; index<3; index++){
            for (int jindex = 0; jindex < 3; jindex++){
                System.out.println(matrixNumber[index][jindex]);
            }
        }
    }
}
