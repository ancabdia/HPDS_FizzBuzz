package dis.ulpgc.es;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit test for simple App.
 */
public class _FizzBuzz {
    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void should_return_number_when_is_not_fizz_and_not_buzz() {
        assertThat(fizzBuzz.of(1)).isEqualTo("1");
        assertThat(fizzBuzz.of(2)).isEqualTo("2");
        assertThat(fizzBuzz.of(4)).isEqualTo("4");
    }

    @Test
    public void should_return_fizz_when_it_is_multiple_of_5(){
        assertThat(fizzBuzz.of(5)).isEqualTo("Fizz");
        assertThat(fizzBuzz.of(10)).isEqualTo("Fizz");
    }

    @Test
    public void should_return_fizz_when_it_is_multiple_of_7(){
        assertThat(fizzBuzz.of(7)).isEqualTo("Buzz");
        assertThat(fizzBuzz.of(14)).isEqualTo("Buzz");
    }

    @Test
    public void should_return_fizz_when_it_is_multiple_of_35() {
        assertThat(fizzBuzz.of(35)).isEqualTo("FizzBuzz");
        assertThat(fizzBuzz.of(140)).isEqualTo("FizzBuzz");
    }

}