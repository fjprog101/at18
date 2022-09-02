package jalau.at18.katas.bankocr.rodrigob;

public class Main {
    public static void main(String[] aStrings) {
        Scanner scanner = new Scanner();
        Printer printer = new Printer();
        char[][] input = scanner.readInput();
        String output = printer.writeOutput(input);
        System.out.print(output);
    }
}
