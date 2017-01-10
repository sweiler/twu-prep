import java.io.PrintStream;

public class Printy {

    private PrintStream printStream;

    public Printy() {
        printStream = System.out;
    }

    public Printy(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void printAsterisk() {
        printStream.print("*");
    }

    public void printHorizontalLine(int numberOfAsterisks) {
        InputValidation.checkInputArgumentIsPositive(numberOfAsterisks);
        for (int i = 0; i < numberOfAsterisks; i++) {
            printAsterisk();
        }
        printNewLine();
    }

    public void printVerticalLine(int numberOfAsterisks) {
        InputValidation.checkInputArgumentIsPositive(numberOfAsterisks);
        for (int i = 0; i < numberOfAsterisks; i++) {
            printAsterisk();
            printNewLine();
        }
    }

    public void printCharacterMultipleTimes(int numberOfChars, char character) {
        for (int j = 0; j < numberOfChars; j++) {
            printStream.print(character);
        }
    }

    public void printNewLine() {
        printStream.println();
    }
}
