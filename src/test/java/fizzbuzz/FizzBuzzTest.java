package fizzbuzz;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import triangle_and_diamond.AdvancedPrintStream;
import triangle_and_diamond.Printy;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {

    private AdvancedPrintStream outputChecker;
    private FizzBuzz fizzBuzz;

    @Before
    public void initializeObjects() {
        outputChecker = new AdvancedPrintStream();
        fizzBuzz = new FizzBuzz(outputChecker.getPrintStream());
    }

    @Test
    public void shouldPrintOneNumber(){
        fizzBuzz.fizzBuzz(1);
        assertThat(outputChecker.getContents(),is("1\n"));
    }

    @Test
    public void shouldPrintTwoNumbers(){
        fizzBuzz.fizzBuzz(2);
        assertThat(outputChecker.getContents(),is("1\n2\n"));
    }

    @Test
    public void shouldPrintFizz() {
        fizzBuzz.fizzBuzz(3);
        assertThat(outputChecker.getContents(), is("1\n2\nFizz\n"));
    }

    @Test
    public void shouldReturnCorrectFizzORBuzzOutput() {
        fizzBuzz.fizzBuzz(5);
        assertThat(outputChecker.getContents(), is("1\n2\nFizz\n4\nBuzz\n"));
    }

    @Test
    public void shouldReturnCorrectFizzBuzzCompleteOutput() {
        fizzBuzz.fizzBuzz(15);
        assertThat(outputChecker.getContents(), is("1\n2\nFizz\n4\nBuzz\nFizz\n" +
                "7\n" +
                "8\n" +
                "Fizz\n" +
                "Buzz\n" +
                "11\n" +
                "Fizz\n" +
                "13\n" +
                "14\n" +
                "FizzBuzz\n"));
    }
}
