package jalau.at18.katas.bankocr.sarai;

public class ValidChecksum {
    private String account ;
    //private int sum = 0;
    public ValidChecksum(String accountNum) { //"123456679"
        this.account = accountNum;
    }
    public String[] value() {
        String[] arrOfStr = account.split("");
        return arrOfStr;
    }
    public int valid() {
        int sum = 0;
        int numer = 9;
        for (String positionnumber : value()) {
            sum += (Integer.parseInt(positionnumber) * numer--);
        }
        return sum % 11;

    }
    public boolean validnumber() {
        
        if(valid()== 0){
        return true;
        }
        return false;
        
    }


}
