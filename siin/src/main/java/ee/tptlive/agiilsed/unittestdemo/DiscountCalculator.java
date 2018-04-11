package ee.tptlive.agiilsed.unittestdemo;

public class DiscountCalculator {

    public static final double TICKET_PRICE =100;

    public enum PersonalStatus {
        DEFAULT, STUDENT, DISABLED, VIP
    }

    public double calculateDiscount(int age, PersonalStatus status){


        if( age <= 6 || status == PersonalStatus.VIP  ){
            return 1; //100%
        }
        if(status == PersonalStatus.DISABLED){
            return 0.9; // 90%
        }

        if(age < 18){
            return 0.75; // 75%
        }

        if(age >= 18 && age <= 26 && status == PersonalStatus.STUDENT){
            return 0.5;  // 50%
        }
        if(age >= 70 ){
            return 0.9; // 90%
        }





        return 0; // 0%
    }

    //CTRL + SHIFT + T loob uue tersti

}
