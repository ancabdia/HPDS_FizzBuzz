package dis.ulpgc.es;


/**
 * If that number is a multiple of five, you should say the word “fizz” (preferably with a French accent) instead.
 * If the number is a multiple of seven, you should say “buzz.”
 * And if it is a multiple of both, you should say “fizzbuzz.”
 * Link without refactor: https://howtodoinjava.com/java/puzzles/fizzbuzz-solution-java/
 */
public class FizzBuzz {
    /**
     * Give the word depending on the number you have.
     * @param number
     * @return the word to say.
     */
    public String of(int number) {
        if (isMultipleOfThirtyFive(number)) return "FizzBuzz";
        if (isMultipleOfSeven(number)) return "Buzz";
        if (isMultipleOfFive(number)) return "Fizz";
        return String.valueOf(number);
    }

    private boolean isMultipleOfThirtyFive(int number) {
        return number % 35 == 0;
    }

    private boolean isMultipleOfSeven(int number) {
        return number % 7 == 0;
    }

    private boolean isMultipleOfFive(int number) {
        return number % 5 == 0;
    }
}