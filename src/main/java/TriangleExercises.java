import java.io.PrintStream;

public class TriangleExercises {

    private Printy printy;

    public TriangleExercises() {
        printy = new Printy();
    }

    public TriangleExercises(Printy printy) {
        this.printy = printy;
    }

    public void printRightTriangle(int numberOfLines) {
        InputValidation.checkInputArgumentIsPositive(numberOfLines);
        for (int i = 1; i <= numberOfLines; i++) {
            printy.printHorizontalLine(i);
        }
    }
}
