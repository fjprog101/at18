package jalau.at18.katas.bankocr.rodrigov;
public class SplitDigit {
    String [] lines;
    int firstCont = 0;
    int limitCont = 3;
    int cont = 0;
    private String number;
    private String [] digits = new String[9];

    public SplitDigit(String [] lines){
        this.lines=lines;
    }

    public void splitNumbers(){
        for (int index = 0; index <= lines[0].length(); index++) {
            if(index % 3 == 0 && index != 0){
                number = lines[0].substring(firstCont,limitCont);
                number += lines[1].substring(firstCont,limitCont);
                number += lines[2].substring(firstCont,limitCont);
                incrementAndClear();
            }
        }
    }

    public void incrementAndClear(){
        digits[cont] = number;
        cont++;
        firstCont += 3;
        limitCont += 3; 
        number = "";
    }
    
    public void print(){
        for (int i = 0; i < digits.length; i++) {
            System.out.println(digits[i]+"\n");
        }
    }
    public String[] getDigits() {
        return digits;
    }

    public void setDigits(String[] digits) {
        this.digits = digits;
    }
}
