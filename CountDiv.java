public class CountDiv {
    
    public static void main(String[] args) {
        System.out.println(solution(6, 11, 2));
        System.out.println(solution(10, 10, 5));
        System.out.println(solution(10, 10, 7));
        System.out.println(solution(10, 10, 20));
        System.out.println(solution(0, 1, 11));
        
    }

    public static int solution(int A, int B, int K) {


        if (A == B) {
            if (A % K == 0) {
                return 1;
            }
        }

        if (K == 1) {
          return B;
        }
        if (K == 2) {
            return Math.floorDiv(Math.abs(A-B)+1, 2);
        }


        
        int result=0;

        
        for (int i = A; i <= B; i++) {
            if (i%K == 0 ) {
                result = result +1;
            }  
        }

        return result;
        
    }
}
