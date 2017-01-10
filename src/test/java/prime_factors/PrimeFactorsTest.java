package prime_factors;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PrimeFactorsTest {

    PrimeFactors primeFactors =  new PrimeFactors();

    @Test
    public void shouldReturnEmptyListForOne(){
        List<Integer> list = primeFactors.generate(1);
        assertThat(list, is(Collections.<Integer>emptyList()));
    }

    @Test
    public void shouldReturnCorrectFactorsForTwo() {
        List<Integer> list = primeFactors.generate(2);
        assertThat(list, is(Collections.singletonList(2)));
    }

    @Test
    public void shouldReturnCorrectFactorsForThirty() {
        List<Integer> list = primeFactors.generate(30);
        assertThat(list, is(Arrays.asList(2,3,5)));
    }

    @Test
    public void shouldReturnDuplicatePrimeFactors() {
        List<Integer> list = primeFactors.generate(40);
        assertThat(list, is(Arrays.asList(2,2,2,5)));
    }

    @Test
    public void shouldReturnEmptyListForNegativeNumbers() {
        List<Integer> list = primeFactors.generate(-5);
        assertThat(list, is(Collections.<Integer>emptyList()));
    }

}
