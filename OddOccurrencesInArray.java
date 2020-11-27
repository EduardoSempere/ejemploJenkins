public class OddOccurrencesInArray {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{9,3,9,3,9,7,9,7,8}));
        System.out.println(solution(new int[]{9,3,9}));
        System.out.println(solution(new int[]{9}));
    }

    public static int solution(int[] A) {

        if (A.length == 1) {
            return A[0];
        }
        int result = 0; 
        for (int i = 0; i < A.length; i++) {
            result = A[i];
            boolean sinPar = true; 
            for (int j2 = 0; j2 < A.length; j2++) {
                if (j2 != i) {
                    if (result == A[j2]) {
                        sinPar = false;
                       j2 = A.length;
                    }  
                }
            }
            if (sinPar) {
                 break;
            }
              
        }

        return result;
    }
}
