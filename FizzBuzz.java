import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FizzBuzz {
    
    public static void main(String args[]){

        fizzBuzz(30).stream().forEach(System.out::println);
    }

    public static List<String> fizzBuzz(int num){
        
        return IntStream.range(1,num+1).mapToObj(i -> getValue(i))
                                     .collect(Collectors.toList());
      

    }

    public static String getValue(int i){
        if((i % 15) == 0) {
            return "FizzBuzz";
        }else if ((i % 5) == 0){
            return "Buzz";
        }else if ((i % 3) == 0){
            return "Fizz";
        }else {
            return String.valueOf(i);
        }
    }
}
