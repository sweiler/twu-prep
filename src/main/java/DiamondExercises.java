import java.io.PrintStream;

public class DiamondExercises {

    private Printy printy;

    public DiamondExercises(Printy printy) {
        this.printy = printy;
    }

    public DiamondExercises() {
        this.printy = new Printy();
    }

    public void printIsoscelesTriangle(int numberOfLines) {
        InputValidation.checkInputArgumentIsPositive(numberOfLines);

        int initialSpace = numberOfLines - 1;

        for (int i=0; i<numberOfLines; i++) {
            printTriangleLine(initialSpace, i);
        }
    }

    public void printDiamond(int diamondSideLength) {
        printIsoscelesTriangle(diamondSideLength);
        int initialSpace = diamondSideLength - 1;

        for (int i = diamondSideLength - 2; i >= 0; i--) {
            printTriangleLine(initialSpace, i);
        }
    }

    private void printTriangleLine(int initialSpace, int loopVar) {
        int spaces = initialSpace - loopVar;
        int asterisks = 2 * loopVar + 1;

        printy.printCharacterMultipleTimes(spaces, ' ');
        printy.printCharacterMultipleTimes(asterisks,printy.getAsterisk());
        printy.printNewLine();
    }
}
