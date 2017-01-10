package triangle_and_diamond;

public class DiamondExercises {

    private Printy printy;

    public DiamondExercises(Printy printy) {
        this.printy = printy;
    }

    public DiamondExercises() {
        this.printy = new Printy();
    }

    public void printIsoscelesTriangle(int numberOfLines) {
        printUpperDiamond(numberOfLines);
        printy.printHorizontalLine(numberOfLines*2 -1);
    }

    private void printUpperDiamond(int numberOfLines) {
        InputValidation.checkInputArgumentIsPositive(numberOfLines);

        int initialSpace = numberOfLines - 1;

        for (int i=0; i<numberOfLines-1; i++) {
            printTriangleLine(initialSpace, i);
        }
    }

    public void printDiamond(int diamondSideLength) {
        printIsoscelesTriangle(diamondSideLength);
        printLowerDiamond(diamondSideLength);
    }

    private void printLowerDiamond(int diamondSideLength) {
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

    public void printDiamondWithName(int diamondSideLength, String name) {

        printUpperDiamond(diamondSideLength);
        printy.printString(name);
        printy.printNewLine();
        printLowerDiamond(diamondSideLength);
    }
}
