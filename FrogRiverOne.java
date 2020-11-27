import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FrogRiverOne {
    
    public static void main(String[] args) {
        System.out.println(solution(5,new int[]{1,3,1,4,2,3,5,4}));
    }

    public static int solution(int X, int[] A) {
        List<Integer> l = Arrays.stream(A).map(x -> x).boxed().collect(Collectors.toList());
        int index = l.lastIndexOf(X);
        return index;
    }
}
