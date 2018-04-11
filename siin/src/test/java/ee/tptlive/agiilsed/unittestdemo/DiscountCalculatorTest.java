package ee.tptlive.agiilsed.unittestdemo;

import org.junit.Test;

import static org.junit.Assert.*;

public class DiscountCalculatorTest {

    @Test
    public void calculateDiscount_ifAge_isLessThenSix(){

        int input = 6;

        // when
        double result = new DiscountCalculator().calculateDiscount( input, DiscountCalculator.PersonalStatus.DEFAULT);

        // then
        assertEquals(1, result,0.01);

    }
    @Test
    public void calculateDiscount_ifAge_isSeven(){

        int input =7 ;

        // when
        double result = new DiscountCalculator().calculateDiscount( input, DiscountCalculator.PersonalStatus.DEFAULT);

        // then
        assertEquals(0.75, result,0.01);

    }
    @Test
    public void calculateDiscount_ifStudentAndAge_isOver18(){

        int input =19 ;

        // when
        double result = new DiscountCalculator().calculateDiscount( input, DiscountCalculator.PersonalStatus.STUDENT);

        // then
        assertEquals(0.5, result,0.01);

    }
    @Test
    public void calculateDiscount_ifDisabledAndAge_isOver18(){

        int input =25 ;

        // when
        double result = new DiscountCalculator().calculateDiscount( input, DiscountCalculator.PersonalStatus.DISABLED);

        // then
        assertEquals(0.9, result,0.01);

    }
    @Test
    public void calculateDiscount_ifVIP_ageIsOver18(){

        int input =25 ;

        // when
        double result = new DiscountCalculator().calculateDiscount( input, DiscountCalculator.PersonalStatus.VIP);

        // then
        assertEquals(1, result,0.01);

    }
    @Test
    public void calculateDiscount_ifDefault_ageIsOver70(){

        int input =70 ;

        // when
        double result = new DiscountCalculator().calculateDiscount( input, DiscountCalculator.PersonalStatus.DEFAULT);

        // then
        assertEquals(0.9, result,0.01);

    }
    @Test
    public void calculateDiscount_ifDisabled_ageIsOver70(){

        int input =70 ;

        // when
        double result = new DiscountCalculator().calculateDiscount( input, DiscountCalculator.PersonalStatus.DISABLED);

        // then
        assertEquals(0.9, result,0.01);

    }
    @Test
    public void calculateDiscount_ifDefault_ageIsLess18(){

        int input =17 ;

        // when
        double result = new DiscountCalculator().calculateDiscount( input, DiscountCalculator.PersonalStatus.DISABLED);

        // then
        assertEquals(0.9, result,0.01);

    }
    @Test
    public void calculateDiscount_ifVipAge_isLessThenSix(){

        int input = 6;

        // when
        double result = new DiscountCalculator().calculateDiscount( input, DiscountCalculator.PersonalStatus.VIP);

        // then
        assertEquals(1, result,0.01);

    }
    @Test
    public void calculateDiscount_ifVDisabledAge_isLessThenSix(){

        int input = 6;

        // when
        double result = new DiscountCalculator().calculateDiscount( input, DiscountCalculator.PersonalStatus.DISABLED);

        // then
        assertEquals(1, result,0.01);

    }
    @Test
    public void calculateDiscount_ifStudentAge_isLessThenSix(){

        int input = 6;

        // when
        double result = new DiscountCalculator().calculateDiscount( input, DiscountCalculator.PersonalStatus.STUDENT);

        // then
        assertEquals(1, result,0.01);

    }
    @Test
    public void calculateDiscount_ifDisabledAge_isSeven(){

        int input =7 ;

        // when
        double result = new DiscountCalculator().calculateDiscount( input, DiscountCalculator.PersonalStatus.DISABLED);

        // then
        assertEquals(0.9, result,0.01);

    }
    @Test
    public void calculateDiscount_ifVipAge_isSeven(){

        int input =7 ;

        // when
        double result = new DiscountCalculator().calculateDiscount( input, DiscountCalculator.PersonalStatus.DEFAULT);

        // then
        assertEquals(0.75, result,0.01);

    }
    @Test
    public void calculateDiscount_ifStudentAge_isSeven(){

        int input =7 ;

        // when
        double result = new DiscountCalculator().calculateDiscount( input, DiscountCalculator.PersonalStatus.STUDENT);

        // then
        assertEquals(0.75, result,0.01);

    }




}