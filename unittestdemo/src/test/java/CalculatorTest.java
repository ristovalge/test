import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test

    public void evaluate_Returns0_ifInputIsNull() {
        // given
        String input = null;
       // when
       int result = new Calculator().evaluate(input);

       // then
        assertEquals(0, result );

    }
    @Test

    public void evaluate_Returns0_ifInputIsEmpty() {
        // given
        String input = "";
        // when
        int result = new Calculator().evaluate(input);

        // then
        assertEquals(0, result );

    }

    @Test

    public void evaluate_Returns0_ifInputIsBlank() {
        // given
        String input = " ";
        // when
        int result = new Calculator().evaluate(input);

        // then
        assertEquals(0, result );

    }
    @Test

    public void evaluate_ReturnsSameNumber_ifInputIsNumber() {
        // given
        String input = "23";
        // when
        int result = new Calculator().evaluate(input);

        // then
        assertEquals(23, result );

    }
    @Test

    public void evaluate_ReturnsSameNegativeNumber_ifInputIsNegativeNumber() {
        // given
        String input = "-23";
        // when
        int result = new Calculator().evaluate(input);

        // then
        assertEquals(-23, result );

    }
    @Test

    public void evaluate_ReturnsSameNumber_ifInputIsSingleSumOperation() {
        // given
        String input = "23+77";
        // when
        int result = new Calculator().evaluate(input);

        // then
        assertEquals(100, result );

    }
    @Test

    public void evaluate_ReturnsSameNumber_ifInputIsMultipleSumOperation() {
        // given
        String input = "23+77+55+45+50";
        // when
        int result = new Calculator().evaluate(input);

        // then
        assertEquals(250, result );

    }








}