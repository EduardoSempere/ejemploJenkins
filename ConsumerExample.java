import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    
    public static void main(String[] args) {
        
        Consumer<Integer> consumer = n -> System.out.println("Printing:" + n);
        
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        list.stream().forEach(consumer);
    }
}
