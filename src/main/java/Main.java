import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {
        Printy printy = new Printy(System.out);
        TriangleExercises triangleExercises = new TriangleExercises(printy);
        DiamondExercises diamondExercises = new DiamondExercises(printy);

        printy.printAsterisk();
        printy.printHorizontalLine(8);
        printy.printVerticalLine(3);

        triangleExercises.printRightTriangle(3);

        diamondExercises.printIsoscelesTriangle(3);
    }

}
