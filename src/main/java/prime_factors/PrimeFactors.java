package prime_factors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public List<Integer> generate(int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (n > 1) {
            int counter = 2;
            while (n != 1) {
                if (n % counter == 0) {
                    n = n / counter;
                    arrayList.add(counter);
                } else {
                    counter++;
                }
            }
        }

        return arrayList;
    }
}
