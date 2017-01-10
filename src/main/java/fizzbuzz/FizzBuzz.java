package fizzbuzz;


import java.io.PrintStream;

public class FizzBuzz {
    private PrintStream printStream;

    public FizzBuzz(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void fizzBuzz(int maxNumber) {
        for (int i = 1; i <= maxNumber; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                printStream.println("FizzBuzz");
            } else if (i % 3 == 0) {
                printStream.println("Fizz");
            } else if (i % 5 == 0) {
                printStream.println("Buzz");
            } else {
                printStream.println(i);
            }
        }
    }
}
