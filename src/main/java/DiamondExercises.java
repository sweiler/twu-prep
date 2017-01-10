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
        int spaces;
        int asterisks;

        for (int i=0; i<numberOfLines; i++) {
            spaces = initialSpace - i;
            asterisks = 2 * i + 1;

            printy.printCharacterMultipleTimes(spaces, ' ');
            printy.printCharacterMultipleTimes(asterisks, '*');
            printy.printNewLine();
        }
    }

}
