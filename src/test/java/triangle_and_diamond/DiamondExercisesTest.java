package triangle_and_diamond;

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

    @Test
    public void shouldPrintIsoscelesTriangleWith4Lines() {
        diamondExercises.printIsoscelesTriangle(4);
        assertThat(outputChecker.getContents(), is("   *\n  ***\n *****\n*******\n"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionOnPrintIsoscelesTriangleWithInvalidArgument() {
        diamondExercises.printIsoscelesTriangle(-1);
    }

    @Test
    public void shouldPrintADiamondWithLength3() {
        diamondExercises.printDiamond(3);
        assertThat(outputChecker.getContents(), is("  *\n ***\n*****\n ***\n  *\n"));
    }

    @Test
    public void shouldPrintADiamondWithLength2() {
        diamondExercises.printDiamond(2);
        assertThat(outputChecker.getContents(), is(" *\n***\n *\n"));
    }

    @Test
    public void shouldPrintADiamondWithLength4() {
        diamondExercises.printDiamond(4);
        assertThat(outputChecker.getContents(), is("   *\n  ***\n *****\n*******\n *****\n  ***\n   *\n"));
    }


    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionOnPrintDiamondWithInvalidArgument() {
        diamondExercises.printDiamond(-1);
    }

    @Test
    public void shouldPrintDiamondWithName(){
        diamondExercises.printDiamondWithName(3, "Bill");
        assertThat(outputChecker.getContents(), is("  *\n ***\nBill\n ***\n  *\n"));
    }


}
