package jalau.at18.katas.bankocr.rodrigov;
public class SplitDigit {
    String [] lines;
    int firstCont = 0;
    int limitCont = 3;
    int cont = 0;
    String number;
    String [] digits = new String[9];
    public SplitDigit(String [] lines){
        this.lines=lines;
    }

    public void splitNumbers(){
        for (int index = 0; index <= lines[0].length(); index++) {
            if(index % 3 == 0 && index != 0){
                number = lines[0].substring(firstCont,limitCont);
                number += lines[1].substring(firstCont,limitCont);
                number += lines[2].substring(firstCont,limitCont);
                digits[cont] = number;
                cont++;
                firstCont += 3;
                limitCont += 3; 
                //System.out.print(number);
                number = "";
            }
        }
    }

    public void print(){
        for (int index = 0; index < digits.length; index++) {
            System.out.println(digits[index]+"\n");
        }
    }
    

}
