import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SeparateNumbers1 {


    public static void main(final String[] args) {
        System.out.println(separate(new int[] { 5, 3, -3, -4, 0, 2, -1, 4, -7, 2 }));
    }

    public static String separate(final int[] arr) {

        final Map<Boolean, List<Integer>> result = Arrays.stream(arr).boxed()
                .collect(Collectors.partitioningBy(x -> x >= 0));

        // result.get(true).stream().forEach(System.out::println);
        // result.get(false).stream().forEach(System.out::println);

        Stream<Integer> concat = Stream.concat(result.get(true).stream(), result.get(false).stream());
       return concat.map(String::valueOf).collect(Collectors.joining(",","[","]"));
        
    }
}