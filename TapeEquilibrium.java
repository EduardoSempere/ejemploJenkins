public class TapeEquilibrium {
    
    public static void main(String[] args) {
        /**
         * caso de uso minimos valores
         * N=2
         * {-1_000, 999}
         */


         /**
          * caso de uso maximo valores 
          * N = 100_000
          * {}
          */

          /**
           * caso de uso ejemplo
           * N=5
           * {3,1,2,4,3}
           */
          System.out.println(solution(new int[]{3,1,2,4,3}));

           /**
           * caso de uso ejemplo
           * N=2
           * {-1_000, 1_000}
           */
          System.out.println(solution(new int[]{-1_000,1_000}));
    }


    public static int solution(int[] A) {

        int B = A[0];
        int Z = 0;
        int dif = 0;
        int difT = 0; 
        for (int i = 1; i < A.length; i++) {
             Z = Z + A[i];
        }
        
        dif = Math.abs(B-Z);

        for (int i = 1; i < A.length-1; i++) {
            B = B + A[i];
            Z = Z - A[i];
            difT = Math.abs(B-Z);
            if ( difT < dif ) {
                dif = difT;
            }

        }

        return dif;
        
    }

}
