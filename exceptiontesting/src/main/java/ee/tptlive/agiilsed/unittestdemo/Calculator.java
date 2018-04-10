package ee.tptlive.agiilsed.unittestdemo;

public class Calculator {

    public int evaluate(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        int sum = 0;
        String[] numbers = input.split("\\+");
        for (String number : numbers) {

            sum += Integer.parseInt(number);

        }


        return sum;

//        return Arrays.stream(numbers)
//                .mapToInt(Integer::parseInt)
//                .sum();


    }

    public int evaluate(String input, int x) {


        if (input == null || input.isEmpty()) {
            return 50;

        } else if (0 <= x && x <= 100) {
            int sum = 0;
            String[] numbers = input.split("\\+");
            for (String number : numbers) {
                if (number.equals("x") || (number.equals("X"))) {
                    sum += x;


                } else {
                    sum += Integer.parseInt(number);
                }
                return sum;
            }
        } else {


            throw new IllegalArgumentException();
        }
        return 0;
    }
}











