import java.io.PrintStream;

public class TriangleExercises {

    private Printy printy;

    public TriangleExercises() {
        printy = new Printy();
    }

    public TriangleExercises(Printy printy) {
        this.printy = printy;
    }

//    public static void main(String[] args) {
//        TriangleExercises app = new TriangleExercises();
//        app.printAsterisk();
//        app.printHorizontalLine(8);
//        app.printVerticalLine(3);
//        app.printRightTriangle(3);
//    }

    public void printRightTriangle(int numberOfLines) {
        InputValidation.checkInputArgumentIsPositive(numberOfLines);
        for (int i = 1; i <= numberOfLines; i++) {
            printy.printHorizontalLine(i);
        }
    }
}
