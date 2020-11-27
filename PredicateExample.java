import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    
    public static void main(String[] args) {
        Predicate<Integer> pre = n -> (n%2==0) ;

        List<Integer> list = Arrays.asList(2,3,7,10);

        list.stream().filter(pre).forEach(System.out::println);
    }
}
