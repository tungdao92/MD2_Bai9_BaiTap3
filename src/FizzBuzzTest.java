import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void testFizz3(){
        int number = -3;
        String expected = "Out of range";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }
    @Test
    void testFizz6(){
        int number = 6;
        String expected = "Fizz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }
    @Test
    void testBuzz5(){
        int number = 5;
        String expected = "Buzz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    void testFizzBuzz15() {
        int number = 15;
        String expected = "FizzBuzz";

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }
    @Test
    void testFizzBuzz11(){
        int number = 11;
        String expected = "Eleven";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

}
