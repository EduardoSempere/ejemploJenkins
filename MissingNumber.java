import java.util.Arrays;
import java.util.List; 
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingNumber {
    
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,3,6,4,1,2}));
          System.out.println(solution(new int[]{1}));
        //  System.out.println(solution(new int[]{-1,-3}));
        // Random random = new Random();
         

        //   int[] test = random.ints(-1_000_000, 1_000_000).limit(100_000).toArray();
        // System.out.println(solution(test));
       // Arrays.stream(test).forEach(System.out::println);
    }


    public static int solution(int[] A)  {

        List<Integer> list = Arrays.stream(A).parallel().boxed().filter(x -> x >= 0).collect(Collectors.toList());
        // return IntStream.range(1, A.length+1).filter(i -> list.indexOf(i) == -1).findAny().getAsInt();

        
        int result = 1;
        for (int i = 1; i <= A.length; i++) {
            if (list.indexOf(i) == -1 ) {
                result = i; 
                break;
        
            }else {
                result = i+1;
            }
        }
        return result;
        
    }
}
