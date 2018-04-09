import java.util.Arrays;

public class Calculator {
    public int evaluate(String input) {
        if(input ==null ||  input.trim().isEmpty()){
            return 0;
        }
        int sum= 0;
       //String[] operands=  input.split("\\+");
        //for (String operand: operands) {
          // sum += Integer.parseInt(operand);

        //}
      //  return sum;


        return Arrays.stream(input.split("\\+"))
                .mapToInt(Integer::parseInt)
                .sum() ;
    }
}


