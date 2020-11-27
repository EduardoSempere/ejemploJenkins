import java.util.Arrays;

public class MaxCounters {
    
    public static void main(String[] args) {
        
    }

    public static int[] solution(int N , int[] A) {

        int[] contadores = new int[N];

        Arrays.fill(contadores, 0);

        int maximoValor=0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == N+1) {
                Arrays.fill(contadores, maximoValor);
            }else {
                contadores[A[i]-1] = contadores[A[i]-1] +1;
                if (contadores[A[i]-1] > maximoValor) {
                    maximoValor = contadores[A[i]-1];
                }
            }
        }
        
        return contadores;
    }
}
