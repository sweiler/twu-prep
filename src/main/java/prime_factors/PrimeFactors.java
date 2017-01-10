package prime_factors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public List<Integer> generate(int number) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (number > 1) {
            int counter = 2;
            while (number != 1) {
                if (number % counter == 0) {
                    number = number / counter;
                    arrayList.add(counter);
                } else {
                    counter++;
                }
            }
        }

        return arrayList;
    }
}
