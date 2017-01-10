package triangle_and_diamond;

import org.junit.Before;
import org.junit.Test;



import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PrintyTest {

    private AdvancedPrintStream outputChecker;
    private Printy printy;

    @Before
    public void setup() {
        outputChecker = new AdvancedPrintStream();
        printy = new Printy(outputChecker.getPrintStream());
    }

    @Test
    public void shouldPrintOneAsterisk() {
        printy.printAsterisk();
        assertThat(outputChecker.getContents(), is("*"));
    }

    @Test
    public void shouldPrintHorizontalLineOf8Asterisks() {
        printy.printHorizontalLine(8);
        assertThat(outputChecker.getContents(), is("********\n"));
    }

    @Test
    public void shouldReturnNewLineCharForZeroAsterisks() {
        printy.printHorizontalLine(0);
        assertThat(outputChecker.getContents(), is("\n"));
    }


    @Test
    public void shouldPrintVerticalLineOf5Asterisks() {
        printy.printVerticalLine(5);
        assertThat(outputChecker.getContents(), is("*\n*\n*\n*\n*\n"));
    }

    @Test
    public void shouldPrintVerticalLineOf3Asterisks() {
        printy.printVerticalLine(0);
        assertThat(outputChecker.getContents(), is(""));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionOnInvalidNegativeIntegerInput() {
        printy.printHorizontalLine(-1);
    }

}
