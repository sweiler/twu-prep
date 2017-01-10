package triangle_and_diamond;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TriangleExercisesTest {

    private AdvancedPrintStream outputChecker;
    private TriangleExercises triangleExercises;

    @Before
    public void setup() {
        outputChecker = new AdvancedPrintStream();
        triangleExercises = new TriangleExercises(new Printy(outputChecker.getPrintStream()));
    }

    @Test
    public void shouldPrintARightTriangleWithMaximum3Asterisks() {
        triangleExercises.printRightTriangle(3);
        assertThat(outputChecker.getContents(), is("*\n**\n***\n"));
    }

    @Test
    public void shouldPrintARightTriangleWithMaximum5Asterisks() {
        triangleExercises.printRightTriangle(0);
        assertThat(outputChecker.getContents(), is(""));
    }


}
