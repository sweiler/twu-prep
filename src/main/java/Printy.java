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
        checkInputArgumentIsPositive(numberOfAsterisks);
        for (int i = 0; i < numberOfAsterisks; i++) {
            printAsterisk();
        }
        printStream.println();
    }

    public void printVerticalLine(int numberOfAsterisks) {
        checkInputArgumentIsPositive(numberOfAsterisks);
        for (int i = 0; i < numberOfAsterisks; i++) {
            printAsterisk();
            printStream.println();
        }
    }

    private void checkInputArgumentIsPositive(int inputArg) throws IllegalArgumentException {
        if (inputArg <= 0) {
            throw new IllegalArgumentException("Invalid Argument. Please provide postive Integer as argument!");
        }
    }
}
