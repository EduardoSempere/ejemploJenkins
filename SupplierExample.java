import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    
    public static void main(String[] args) {
        
        Supplier<String> su = () -> "Sempere";
        
         

        List<String> list = Arrays.asList();
        String str = list.stream().findAny().orElseGet(su);
        System.out.println(str);
    }
}
