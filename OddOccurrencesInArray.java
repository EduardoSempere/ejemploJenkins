
import java.util.Arrays; 
import java.util.Map;
import java.util.Optional; 
import java.util.stream.Collectors;

public class OddOccurrencesInArray {

    public static void main(String[] args) {
       // System.out.println(solution3(new int[]{9,3,9,3,9,7,9,7,8}));
        
        System.out.println(solution3(new int[]{2, 2, 3, 3, 4}));
        // System.out.println(solution(new int[]{9,3,9}));
        // System.out.println(solution(new int[]{9}));
    }

    public static int solution3(int[] A) {


        Arrays.sort(A);
        int result = A[0];
        int i = 0;
        boolean encontrado = false;
        for (; i < A.length-1; ) {
            result = A[i];
            if (A[i] != A[i+1]) {
                encontrado = true;
                break;
            }
            i = i +2;
        }
        if (!encontrado) {
            if (A.length - i == 1) {
                result = A[A.length-1];
            }
        }

        return result;
        
    }



    //escorrecta pero no tienen buen perfomance 
    public static int solution2(int[] A) {

        Map<String, Long> re = Arrays.stream(A).boxed().collect(Collectors.groupingBy(String::valueOf, Collectors.counting()));
        Optional<String> findAny = re.entrySet().stream().filter(x -> (x.getValue()%2) != 0)
                              .map(x ->x.getKey().toString()).findAny();

        if (findAny.isPresent()) {
            return Integer.parseInt(findAny.get());
        }else {
            return 0;
        }
        // int result = 0;
        // int tempIndex = -1;


        // for (Integer i : list) {
        //     list.remove(i);
        //     tempIndex = list.indexOf(i);
        //     if (tempIndex ==  -1) {
        //         result = i;
        //         break;
        //     }else {
        //         list.remove(tempIndex);
        //     }
        // } 
        // return result;
        
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
