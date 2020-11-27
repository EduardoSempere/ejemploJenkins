import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solucion {

    public static void main(String[] args) {
        System.out.println(solution(new int[] { 0 }));
        // System.out.println(solution(new int[] { 2, 1, 4, 6, 1, 7, 8, 3 }));
        // System.out.println(solution(new int[] { 2, 1, 5, 4, 6, 1, 7, 8, 3, 14, 14, 13, 13, 13, 4, 4, 4, 2, 3, 32, }));
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        Set<Integer> l = Arrays.stream(A).filter(x -> x >= 0).sorted().boxed().collect(Collectors.toSet());
        // Set<Integer> l = IntStream.range(0, 1000001).filter(x -> x > 0).boxed().collect(Collectors.toSet());
        List<Integer> li = l.stream().sorted().collect(Collectors.toList());

        int result = 0;

        for (int i = 1; i < li.size(); i++) {

            int next = li.get((i - 1) + 1);
            if ((next - ((i - 1) + 1)) > 0) {
                result = li.get(i - 1) + 1;
                break;
            } 


        }
        if(li.isEmpty()){
            return 1;
        }
        if(result == 0){
           result =  li.get(li.size()-1) + 1;
        }

        return result;
    }
}
