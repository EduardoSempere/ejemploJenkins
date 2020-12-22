import java.util.Arrays;
import java.util.stream.IntStream;

public class PermMissingElem {
    
    public static void main(String[] args) {

        /**
         * Determinar los casos de pruebas y siempre 
         * tener los casos de pruebas mas extremos 
         * caso de prueba 1 - con los minimos valores posible
         * caso de prueba 2 - con los maximos valores 
         * caso de pruebas n - con valores intermedios 
         * caso de prueba n - con truco 
         * 
         * Datos de este problema
         * rango [1..(N + 1)]
         * N is an integer within the range [0..100,000];
         * the elements of A are all distinct;
         * each element of array A is an integer within the range [1..(N + 1)]
         */

       
         /**
          * caso de prueba minimos valores
          * N = 0
          * {1}
          * 
          */
          System.out.println(solution(new int[]{1}));
        /**
          * caso de prueba maximo valores
          * N = 1_000_000
          * {0...1_000_000}
          * 
          */
          int[] maxValue = IntStream.range(0, 1_000_000).toArray();
          System.out.println(maxValue);
         /**
          * caso de prueba truvo valores
          * N = 5
          * {2,3,1,5}
          * 
          */ 
        System.out.println(solution(new int[]{2,3,1,5}));
        System.out.println(solution(new int[]{2,3,4,5}));
        
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
