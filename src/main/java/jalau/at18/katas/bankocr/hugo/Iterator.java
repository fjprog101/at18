package jalau.at18.katas.bankocr.hugo;

public class Iterator {

    private static final int COLPOS = 9;
    private static final int NUM3 = 3;
    private static final int NUM5 = 5;
    private static final int NUM6 = 6;
    private static final int NUM7 = 7;
    private static final int NUM8 = 8;
    private static final int NUM9 = 9;

    private NumChecker checker = new NumChecker();

    public boolean isNumberPos(int num) {
        if (num == 0 || num == 1 || num == NUM3 || num == NUM5 || num == NUM6 || num == NUM9) {
            return true;
        }
        return false;
    }

    public int[] iterate(int[] errNum) {
        int[] auxNum = errNum.clone();
        boolean cycle = true;
        int pos = 0;
        do {
            if (isNumberPos(auxNum[pos])) {
                auxNum[pos] = numPosibilities(auxNum[pos]);
                if (checker.checkAccountNum(auxNum)) {
                    errNum[pos] = auxNum[pos];
                    cycle = false;
                    return errNum;
                } else {
                    auxNum[pos] = errNum[pos];
                }
            }
            pos++;
        } while (cycle && pos < COLPOS);
        return errNum;
    }

    public int numPosibilities(int error) {
        switch (error) {
            case 0:
                error = NUM8;
                break;
            case 1:
                error = NUM7;
                break;
            case NUM3:
                error = NUM9;
                break;
            case NUM5:
                error = NUM6;
                break;
            case NUM6:
                error = NUM8;
                break;
            case NUM9:
                error = NUM8;
                break;
            default:
        }
        return error;
    }
}