import java.util.Arrays;

public class PermMissingElem {
    
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2,3,1,5}));
        System.out.println(solution(new int[]{2,3,4,5}));
        System.out.println(solution(new int[]{}));
    }

    public static int solution(int[] A) {
        
        if (A.length == 0) {
              return 1; 
        }

        Arrays.sort(A);
        int result = 1;
        for (int i = 0; i < A.length; i++) {
            if (result != A[i] ) {
               break;
            }else {
                result++;
            }
        }
        return result;

    }
}
