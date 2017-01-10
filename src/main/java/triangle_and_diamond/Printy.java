package triangle_and_diamond;

import java.io.PrintStream;

public class Printy {

    private PrintStream printStream;
    private Character asterisk ='*';

    public Printy() {
        printStream = System.out;
    }

    public Printy(PrintStream printStream) {
        this.printStream = printStream;
    }

    public Printy(PrintStream printStream, Character asterisk){
        this(printStream);
        setAsterisk(asterisk);
    }

    public void setAsterisk(Character asterisk){
        this.asterisk=asterisk;
    }

    public Character getAsterisk(){
        return this.asterisk;
    }
    public void printAsterisk() {
        printStream.print(getAsterisk());
    }

    public void printHorizontalLine(int numberOfAsterisks) {
        InputValidation.checkInputArgumentIsPositive(numberOfAsterisks);
        for (int i = 0; i < numberOfAsterisks; i++) {
            printAsterisk();
        }
        printNewLine();
    }

    public void printVerticalLine(int numberOfAsterisks) {
        InputValidation.checkInputArgumentIsPositive(numberOfAsterisks);
        for (int i = 0; i < numberOfAsterisks; i++) {
            printAsterisk();
            printNewLine();
        }
    }

    public void printCharacterMultipleTimes(int numberOfChars, char character) {
        for (int j = 0; j < numberOfChars; j++) {
            printStream.print(character);
        }
    }

    public void printNewLine() {
        printStream.println();
    }

    public void printString(String string) {
        printStream.print(string);
    }
}
