package jalau.at18.katas.bankocr.hugo;

public class Result {
    private Iterator iter = new Iterator();
    private NumChecker checker = new NumChecker();

    public void getResult(int[] intAccNum, char[] accNum, boolean illegible) {
        if (checker.checkAccountNum(intAccNum) && !illegible) {
            System.out.println(String.copyValueOf(accNum) + " ok");
        } else {
            if (!illegible) {
                System.out.println(String.copyValueOf(accNum) + " ERR");
                iter.iterate(intAccNum);
            } else {
                System.out.println(String.copyValueOf(accNum) + " ILL");
            }
        }
    }
}
