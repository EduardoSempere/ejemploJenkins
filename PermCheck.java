import java.util.Arrays;

public class PermCheck {
    
    public static void main(String[] args) {
        System.out.println(solutions(new int[]{4,1,3}));
    }

    public static int  solutions(int[] A) {

        Arrays.sort(A);
        int result = 1;
        int index = 0;
        for (int i = 0; i < A.length; i++) {
            index = i +1;
            if(index != A[i]){
                result = 0;
                break;
            }
        }

        return result;

        
    }
}
