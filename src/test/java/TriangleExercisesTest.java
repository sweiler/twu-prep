import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TriangleExercisesTest {

    private AdvancedPrintStream outputChecker;
    private TriangleExercises triangleExercises;

    @Before
    public void crearteTriangleExercises() {
        outputChecker = new AdvancedPrintStream();
        triangleExercises = new TriangleExercises(outputChecker.getPrintStream());
    }

    @Test
    public void shouldPrintARightTriangleWithMaximum3Asterisks() {
        triangleExercises.printRightTriangle(3);
        assertThat(outputChecker.getContents(), is("*\n**\n***\n"));
    }

    @Test
    public void shouldPrintARightTriangleWithMaximum5Asterisks() {
        triangleExercises.printRightTriangle(5);
        assertThat(outputChecker.getContents(), is("*\n**\n***\n****\n*****\n"));
    }


}
