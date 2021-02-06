import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class BuscarHermanos {

    public static void main(String[] args) {
        Arrays.stream(sol(3, new int[]{2,3,4}, 3)).forEach(System.out::println);
    }

    public static int[] sol(int size, int[] arbol, int hermano) {
        
        Set<Integer> result = new TreeSet<Integer>();
        result.add(6);
        result.add(4);
 

        return result.stream().mapToInt(x -> x).toArray();
    }
}