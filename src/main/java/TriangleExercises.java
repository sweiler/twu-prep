import java.io.PrintStream;

public class TriangleExercises {

    private PrintStream printStream;

    public TriangleExercises() {
        printStream = System.out;
    }

    public TriangleExercises(PrintStream printStream) {
        this.printStream = printStream;
    }

    public static void main(String[] args) {
        TriangleExercises app = new TriangleExercises();
        app.printAsterisk();
        app.printHorizontalLine(8);
        app.printVerticalLine(3);
        app.printRightTriangle(3);
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

    public void printRightTriangle(int numberOfLines) {
        checkInputArgumentIsPositive(numberOfLines);
        for (int i = 1; i <= numberOfLines; i++) {
            printHorizontalLine(i);
        }
    }

    private void checkInputArgumentIsPositive(int inputArg) throws IllegalArgumentException {
        if (inputArg <= 0) {
            throw new IllegalArgumentException("Invalid Argument. Please provide postive Integer as argument!");
        }
    }
}
