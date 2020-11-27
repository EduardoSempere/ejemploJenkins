import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CyclicRotation {

    public static void main(String[] args) {
        Arrays.stream(solution(new int[] { 1,2,3,4,5,6,7 }, 6)).forEach(System.out::println);
    }

    public static int[] solution(int[] A, int K) {

        if (A.length <= 1) {
            return A;
        }

        if (A.length == K) {
            return A;
        }
        //if (A.length < K) {

            int temp;
            for (int i = 0; i < K; i++) {
                temp = A[A.length-1];
                for (int j = A.length-1; j > 0; j--) {
                    A[j] = A[j-1];
                }
                A[0] = temp;
            }
            return A;
        // }

        // int[] segundaParte = Arrays.copyOfRange(A, 0, A.length - K);
        // int[] primeraParte = Arrays.copyOfRange(A, A.length - K, A.length);

        // int[] result = IntStream.concat(Arrays.stream(primeraParte), Arrays.stream(segundaParte)).toArray();
        // return result;

    }
}
