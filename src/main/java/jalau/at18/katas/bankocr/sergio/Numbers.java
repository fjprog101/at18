package jalau.at18.katas.bankocr.sergio;

enum Numbers {
    ONE(new char[][] {{' ', ' ', ' ' }, {' ', ' ', '|' }, {' ', ' ', '|' } }, 1),
    TWO(new char[][] {{' ', '_', ' ' }, {' ', '_', '|' }, {'|', '_', ' ' } }, 2),
    THREE(new char[][] {{' ', '_', ' ' }, {' ', '_', '|' }, {' ', '_', '|' } }, 3),
    FOUR(new char[][] {{' ', ' ', ' ' }, {'|', '_', '|' }, {' ', ' ', '|' } }, 4),
    FIVE(new char[][] {{' ', '_', ' ' }, {'|', '_', ' ' }, {' ', '_', '|' } }, 5),
    SIX(new char[][] {{' ', '_', ' ' }, {'|', '_', ' ' }, {'|', '_', '|' } }, 6),
    SEVEN(new char[][] {{' ', '_', ' ' }, {' ', ' ', '|' }, {' ', ' ', '|' } }, 7),
    EIGHT(new char[][] {{' ', '_', ' ' }, {'|', '_', '|' }, {'|', '_', '|' } }, 8),
    NINE(new char[][] {{' ', '_', ' ' }, {'|', '_', '|' }, {' ', '_', '|' } }, 9);
    private int numberValue;
    private char[][] matrixNumber;

    Numbers(char[][] matrixNumber, int numberValue) {
        this.numberValue = numberValue;
        this.matrixNumber = matrixNumber;
    }

    char[][] getMatrixNumber() {
        return matrixNumber;
    }
    int getNumberValue() {
        return numberValue;
    }
}