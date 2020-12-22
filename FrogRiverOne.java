import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FrogRiverOne {
    
    public static void main(String[] args) {
        System.out.println(solution(5,new int[]{1,3,1,4,2,3,5,4}));
    }

    public static int solution(int X, int[] A) {
        
        int result = 0;
        boolean encontrado = false;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == X) {
                result = result + i;
                encontrado = true;
            }
        }
        if (!encontrado) {
            result = -1;
        }
        return result;
    }
}
