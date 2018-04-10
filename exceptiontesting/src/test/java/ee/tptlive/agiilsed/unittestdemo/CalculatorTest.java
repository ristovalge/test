package ee.tptlive.agiilsed.unittestdemo;

import org.junit.Ignore;
import org.junit.Test;

import java.security.cert.X509Certificate;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void evaluate_0_IfInputIsNull() {
        // given
        String input = null;

        // when
        int result = new Calculator().evaluate(input);

        // then
        assertEquals(0, result);
    }

    @Test
    public void evaluate_0_IfInputIsEmpty() {
        // given
        String input = "";

        // when
        int result = new Calculator().evaluate(input);

        // then
        assertEquals(0, result);
    }

    @Test
    public void evaluate_ReturnsGivenNumber_IfInputIsNumber() {
        // given
        String input = "100";

        // when
        int result = new Calculator().evaluate(input);

        // then
        assertEquals(100, result);
    }

    @Test
    public void evaluate_ReturnsGivenNumber_IfInputIsNegativeNumber() {
        // given
        String input = "-100";

        // when
        int result = new Calculator().evaluate(input);

        // then
        assertEquals(-100, result);
    }

    @Test
    public void evaluate_ReturnsSum_IfInputIsSingleSumOperation() {
        // given
        String input = "56+44";

        // when
        int result = new Calculator().evaluate(input);

        // then
        assertEquals(100, result);
    }

    @Test
    public void evaluate_ReturnsSum_IfInputIsMultipleSumOperation() {
        // given
        String input = "56+44+88+12+50";

        // when
        int result = new Calculator().evaluate(input);

        // then
        assertEquals(250, result);
    }

    @Test
    public void evaluate_ReturnsSum_IfInputIsMultipleSumOperationAndNegativeNumbers() {
        // given
        String input = "-50+88+12+50";

        // when
        int result = new Calculator().evaluate(input);

        // then
        assertEquals(100, result);
    }
    @Test
    public void evaluate_ReturnsSum_IfInputIsMultipleSumOperationAndNumbersX() {
        // given
        String input = "x";

        // when
        int result = new Calculator().evaluate(input, 50  );

        // then
        assertEquals(50, result);
    }
    @Test
    public void evaluate_ReturnsSum_IfInputIsMultipleXOperationAndNumbersX() {
        // given
        String input = "x+x+x+x+x";

        // when
        int result = new Calculator().evaluate(input, 50  );

        // then
        assertEquals(50, result);
    }
    @Test
    @Ignore
    public void evaluate_ReturnsSum_IfInputIsMultipleSumOperationAndNegativeNumbersYX() {
        // given
        String input = "50-30";

        // when
        int result = new Calculator().evaluate(input);

        // then
        assertEquals(20, result);
    }
    @Test
    public void evaluate_ReturnsSum_IfInputIsX() {
        // given
        String input = "X";

        // when
        int result = new Calculator().evaluate(input, 50  );

        // then
        assertEquals(50, result);
    }
    @Test (expected = IllegalArgumentException.class)
    public void  evaluate_ReturnsSum_IfInputIsoverHundred() {
        // given
        String input = "x";

        int x = 150;

        // when
        int result = new Calculator().evaluate(input, x  );

        // then
        assertEquals(150, result);
    }
    @Test (expected = IllegalArgumentException.class)
    public void  evaluate_ReturnsSum_IfLessThenZero() {
        // given
        String input = "x";

        int x = -1;

        // when
        int result = new Calculator().evaluate(input, x  );

        // then
        assertEquals(-1, result);
    }

    @Test
    public void  evaluate_ReturnsSum_IfZero() {
        // given
        String input = "x";

        int x = 0;

        // when
        int result = new Calculator().evaluate(input, x  );

        // then
        assertEquals(0, result);
    }
    @Test
    public void  evaluate_ReturnsSum_IfHundred() {
        // given
        String input = "x";

        int x = 100;

        // when
        int result = new Calculator().evaluate(input, x  );

        // then
        assertEquals(100, result);
    }
    @Test
    public void  evaluate_ReturnsSum_If50() {
        // given
        String input = "x";

        int x = 50;

        // when
        int result = new Calculator().evaluate(input, x  );

        // then
        assertEquals(50, result);
    }





}