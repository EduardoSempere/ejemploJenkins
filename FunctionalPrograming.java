import java.util.Arrays;
import java.util.List;

public class FunctionalPrograming {
    
    public static void main(String[] args) {
        
        //find the double of the first even number greater than 3
        List<Integer> values = Arrays.asList(1,2,5,4,6,7,8,9,10 );
        System.out.println(

                values.stream().filter(x -> x > 3)
                                .filter(x -> x % 2 == 0)
                                .map(x -> x * 2)
                                .findFirst()


        );

    }
}
