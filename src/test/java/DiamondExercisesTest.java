import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DiamondExercisesTest {

    private AdvancedPrintStream outputChecker;
    private DiamondExercises diamondExercises;

    @Before
    public void createNecessaryObjects() {
        outputChecker = new AdvancedPrintStream();
        diamondExercises = new DiamondExercises(new Printy(outputChecker.getPrintStream()));
    }

    @Test
    public void shouldPrintIsoscelesTriangleWith3Lines() {
        diamondExercises.printIsoscelesTriangle(3);
        assertThat(outputChecker.getContents(), is("  *\n ***\n*****\n"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionOnPrintIsoscelesTriangleWithInvalidArgument() {
        diamondExercises.printIsoscelesTriangle(-1);
    }

}
